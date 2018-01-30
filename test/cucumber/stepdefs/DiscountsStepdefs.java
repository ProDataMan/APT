package cucumber.stepdefs;

import cucumber.api.java.en.*;
import testsupport.DbSupport;
import static org.junit.Assert.*;
import java.sql.SQLException;
import apt.CourseCoster;

public class DiscountsStepdefs {
	private DbSupport db;
	private double actualCost;
	
	public DiscountsStepdefs() throws ClassNotFoundException {
		db = new DbSupport();
	}
	
	@Given("^the course \"(.*)\" costs \\$(.+)$")
	public void givenTheCourseCosts(String courseCode, double courseCost) throws SQLException {
		db.setCourseCost(courseCode, courseCost);
	}
	
	@Given("^the code \"(.*)\" gives a (.+)% discount$")
	public void givenTheDiscountIs(String promotionCode, double percentage) throws SQLException {
		db.setDiscount(promotionCode, percentage);
	}
	
	@When("^the cost of \"(.*)\" with the code \"(.*)\" is calculated$")
	public void whenTheCostIsCalculated(String courseCode, String promotionCode) {
		CourseCoster coster = new CourseCoster(db);
		actualCost = coster.getCost(courseCode, promotionCode);
	}
	
	@Then("^the cost should be \\$(.+)$")
	public void thenTheCostShouldBe(double expectedCost) {
		assertEquals(expectedCost, actualCost, 0.005);
	}
}
