package pkgshape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleTest {	
	@Test
	void TestTriangle_1() {
		double sides = 7;
		double angles = 60;
		
		Triangle t1 = null;
		try {
			t1 = new Triangle(sides);
		} catch (Exception e) {
			fail("TestTriangle Failed");
		}
		assertEquals(sides, t1.gets1(), 0.01);
		assertEquals(sides, t1.gets2(), 0.01);
		assertEquals(sides, t1.gets3(), 0.01);
		
		assertEquals(angles, t1.AngleA(), 0.01, "Angle does not equal");
		assertEquals(angles, t1.AngleB(), 0.01, "Angle does not equal");
		assertEquals(angles, t1.AngleC(), 0.01, "Angle does not equal");
	}
	
	@Test
	void TestTriangle_2() {
		double sides = -7;
		double angles = 60;
		
		assertThrows(Exception.class, () -> {
			Triangle t1 = new Triangle(sides);
		});
		
	}
}

