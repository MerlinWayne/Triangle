import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test(expected = IllegalArgumentException.class)
	public void testCheckIntegrity() {
		String[] str = new String[3];
		str[0] = "3";
		str[1] = "4";
		str[2] = "7";
		Triangle t = new Triangle(3, 4, 7);
		t.createTriangle(str)str.
	}

	@Test
	public void testGetType() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateTriangle() {
		String[] str = new String[3];
		str[0] = "3";
		str[1] = "4";
		str[2] = "7";
		System.out.println(createTriangle(str));
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
