package assigment3;

public class AirithmeticException {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		method();
		
	}

	static void method() throws ArithmeticException {
		throw new ArithmeticException("ArithmeticException Occurred");
	}
}