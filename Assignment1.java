
public class Assignment1 {

	public static void main(String[] args) {
		swapTwoNumbers();
		swapTwoNumbersWithoutTemp();
		swapThreeNumbers();
		swapThreeNumbersWithoutTemp();
		swapFourNumbers();
		swapFourNumbersWithoutTemp();
		
		double planCost = planCostCalc(699, 18); // plan cost 699 with tax 18%
		System.out.println(planCost);
		System.out.println("-------------------------");
		double pizzaCost = pizzaCalc(2, 399, 20); // 2 pizza, $399 each, discount 20%
		System.out.println(pizzaCost);
		System.out.println("-------------------------");
		double tax = taxCalc(85000, 20); // salary: $80000, tax 20%
		System.out.println(tax);
	}
	
	// swap 2 numbers
	static void swapTwoNumbers() {
		int num1 = 1;
		int num2 = 2;
		
		System.out.println(num1 +" -> "+ num2);
		int temp = num1;
		num1= num2;
		num2 = temp;
		System.out.println(num1 +" -> "+ num2);
		System.out.println("-------------------------");
	}
	static void swapTwoNumbersWithoutTemp() {
		int num1 = 1;
		int num2 = 2;
		
		System.out.println(num1 +" -> "+ num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println(num1 +" -> "+ num2);
		System.out.println("-------------------------");
	}
	// swap 3 numbers
	static void swapThreeNumbers() {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3);
		int temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = temp;
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3);
		System.out.println("-------------------------");
	}	
	static void swapThreeNumbersWithoutTemp() {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3);
		num3 = num1 + num2 + num3;
		num2 = num3 - (num2+num1);
		num1 = num3 - (num2+num1);
		num3 = num3 - (num2+num1);
		
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3);
		System.out.println("-------------------------");
	}	
	// swap 4 numbers
	static void swapFourNumbers() {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3 +" -> "+ num4);
		int temp = num1;
		num1= num2;
		num2 = num3;
		num3 = num4;
		num4 = temp;
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3 +" -> "+ num4);
		System.out.println("-------------------------");
	}
	static void swapFourNumbersWithoutTemp() {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3 +" -> "+ num4);
		num4 = num1 + num2 + num3 + num4;
		num3 = num4 - (num1 + num2 + num3);
		num2 = num4 - (num1 + num2 + num3);
		num1 = num4 - (num1 + num2 + num3);
		num4 = num4 - (num1 + num2 + num3);
		
		System.out.println(num1 +" -> "+ num2 +" -> "+ num3 +" -> "+ num4);
		System.out.println("-------------------------");
	}

	//7
	static double planCostCalc(double cost, int gst) {
		return cost + cost*gst/100;
	}
	
	//8
	static double pizzaCalc(int qty, double costEach, int discount) {
		return (qty * costEach) - ((qty * costEach)*discount/100);
	}
	
	//9
	static double taxCalc(int salary, int tax) {
		return tax * salary / 100;
	}
}
