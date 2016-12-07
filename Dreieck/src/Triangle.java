
//to run in CMD: java -jar Triangle.jar

public class Triangle {

	public static enum TYPE {
		ISOSCELES /* gleichschenklig */, EQUILATERAL /* gleichseitig */, SCALENE /* ungleichseitig */
	};

	private final int a, b, c;
	private TYPE type;

	/**
	 * @param a
	 *            length of side a of the triangle
	 * @param b
	 *            length of side b of the triangle
	 * @param c
	 *            length of side c of the triangle
	 */
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Checks the integrity of the triangle
	 * 
	 * @throws {@link IllegalArgumentException} if the side lengths do not describe a triangle
	 */
	private void checkIntegrity() throws IllegalArgumentException {
		if((a+b <= c) || (a+c <= b) || b+c <= a){
			throw new IllegalArgumentException("this can't be a triangle!!	");
		}
	}

	/**
	 * Determines the type of a triangle, depending on its side lengths
	 * 
	 * @return EQUILATERAL => all sides are equal in length, ISOSCELES => two
	 *         sides are equal in length, SCALENE => all sides are unequal
	 */
	private void determineType() {
		if(((a==b)&&(a != c)) || ((a==c)&&(b != c)) || ((c==b)&&(a != c)) ){
			this.type = type.ISOSCELES;
		} else if(a==b && b==c){
			this.type = type.EQUILATERAL;
		} else if(a!=b && b!=c) this.type = type.SCALENE;
	}
	
	
	public TYPE getType() {
		return this.type;
	}

	/**
	 * Creates new triangle instance
	 * 
	 * @param sides
	 *            string array which contains the length of all three sides of
	 *            the triangle
	 * @return new triangle instance
	 * 
	 * @throws {@link IllegalArgumentException} if the sides array does not represent a triangle
	 */
	public static Triangle createTriangle(String[] sides) throws IllegalArgumentException {
		if(sides.length > 3 || sides.length < 3){
			throw new IllegalArgumentException("a triangle has exactly 3 sides!");
		}
		
		int a = Integer.parseInt(sides[0]);
		int b = Integer.parseInt(sides[1]);
		int c = Integer.parseInt(sides[2]);
		
		if(a == (int)a && b == (int) b && c == (int)c){
			Triangle dreieck = new Triangle(a, b, c);
			dreieck.checkIntegrity();
			dreieck.determineType();
			return dreieck;			
		}
		else throw new IllegalArgumentException("the sides must be integers!");
		
		
	}

	/**
	 * Returns the {@link TYPE} of the triangle in german
	 * 
	 * @return german string representation for the given {@link TYPE}:
	 *         EQUILATERAL => "gleichseitig", ISOSCELES => "gleichschenklig",
	 *         SCALENE => "ungleichseitig"
	 */
	@Override
	public String toString() {
		// TODO: Implement this method   -> not sure what this is good for though
		String str;
		switch(type) {
		case ISOSCELES:
			str = "gleichschenklich";
			break;
			
		case EQUILATERAL:
			str = "gleichseitig";
			break;
			
		case SCALENE:
			str = "ungleichseitig";
			break;
			
		default:
			str = "invalid type!";
			break;				
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(createTriangle(args));
	}

}
