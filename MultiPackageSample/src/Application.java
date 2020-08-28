import java.sql.Date;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super.Math s1;
		s1 = new Super.Math();
		int val = s1.smartAdd(1, 2, 3, 4, 4, 5);
		System.out.println(val);

		double result = java.lang.Math.sqrt(3);
		System.out.println(result);

		result = java.lang.Math.floor(3.9);
		System.out.println(result);

		// floor = rounds down number

		result = java.lang.Math.ceil(3.1);
		System.out.println(result);

		// ceil = rounds up number

		java.util.Date date = new java.util.Date();
		System.out.println(date.toString());

		// Date date = new Date();
	java.util.Date date2;
		
	}

}
