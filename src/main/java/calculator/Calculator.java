package calculator;

public class Calculator
{
	Double add(Double a, Double b)
	{
		Double res = a + b;
		System.out.print("The addition is: ");
		System.out.println(res + "\n");
		return res;
	}

	Double sub(Double a, Double b)
	{
		Double res = a - b;
		System.out.print("The subtraction is: ");
		System.out.println(res + "\n");
		return res;
	}

	Double mul(Double a, Double b)
	{
		Double res = a * b;
		System.out.print("The multiplication is: ");
		System.out.println(res + "\n");
		return res;
	}

	Double div(Double a, Double b)
	{
		if(b == 0){
			System.out.println("Division By Zero Not Possible \n");
			return null;
		}	

		Double res = a/b;
		System.out.print("The division is: ");
		System.out.println(res + "\n");
		return res;
	}
}
