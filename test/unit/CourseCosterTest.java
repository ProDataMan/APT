package unit;

import static org.junit.Assert.*;
import apt.DbLayer;
import apt.CourseCoster;
import org.junit.*;
import static org.mockito.Mockito.*;

public class CourseCosterTest {
	@Test
	public void testDiscount() {
		DbLayer db = mock(DbLayer.class);
		when(db.getCourseCost(anyString())).thenReturn(1000.0);
		when(db.getDiscount("SAVE")).thenReturn(10.0);

		CourseCoster coster = new CourseCoster(db);

		assertEquals(900, coster.getCost("TDD", "SAVE"), 0.005);
		verify(db).getDiscount("SAVE");
	}
}
