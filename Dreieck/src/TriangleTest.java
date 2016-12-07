import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test(expected = IllegalArgumentException.class)
	public void testCheckIntegrity() {
		String[] str = new String[3];
		str[0] = "3";
		str[1] = "4";
		str[2] = "7";
		Triangle.main(str);
	}


	@Test(expected = IllegalArgumentException.class)
	public void testCreateTriangle() {
		String[] str = new String[3];
		str[0] = "3.4";
		str[1] = "4";
		str[2] = "7";
		Triangle.main(str);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMain() {
		String[] str = new String[3];
		str[0] = "0";
		str[1] = "0";
		str[2] = "0";
		Triangle.main(str);		
	}
	
	@Test
	public void testDescending() {
		String[] str = new String[3];
		str[0] = "4";
		str[1] = "3";
		str[2] = "2";
		Triangle.main(str);		
	}
	
	
	@Test
	public void testMax(){
		String[] str = new String[3];
		str[0] = "2147483647";
		str[1] = "2147483647";
		str[2] = "4";
		Triangle.main(str);		
	}

}
