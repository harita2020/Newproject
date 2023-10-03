package mapping;

public class Excptn {
	public static void main(String[]args) {
		try {
                Scanner obj = new Scanner;
                
				System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("should not divide by zero");				
	}
} 
}
