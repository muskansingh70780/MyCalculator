package MyCalPkg;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int sum=calc.addition(10,20);
		System.out.println("addition is"+sum);
		int sub=calc.subtraction(10,20);
		System.out.println("subtraction is"+sub);
		int mul=calc.multiplication(10,20);
		System.out.println("multiplication is"+mul);
		int div=calc.division(10,20);
		System.out.println("division is"+div);
		
				

	}

}
