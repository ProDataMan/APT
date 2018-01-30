package fitnesse;

import java.sql.SQLException;
import apt.CourseCoster;
import fit.ColumnFixture;
import testsupport.DbSupport;

public class DiscountsFixture extends ColumnFixture {
	public String courseCode, discountCode;
	public double courseCost, discountAmount;
	
	public double total() throws ClassNotFoundException, SQLException {
		DbSupport db = new DbSupport();
		db.setCourseCost(courseCode, courseCost);
		db.setDiscount(discountCode, discountAmount);
		
		CourseCoster coster = new CourseCoster(db);
		return coster.getCost(courseCode, discountCode);
	}
	
	// @@@ TODO need to close the database?
}
