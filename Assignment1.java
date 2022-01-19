
public class Assignment1 {

	public static void main(String[] args) {
		double planCost = planCostCalc(699);
		System.out.println(planCost);
		
		double pizzaCost = pizzaCalc(2, 399, 20);
		System.out.println(pizzaCost);
		
		double tax = taxCalc(80000, 20);
		System.out.println(tax);
	}

	//7
	static float planCostCalc(float cost) {
		return cost + cost*18/100;
	}
	
	//8
	static float pizzaCalc(int qty, float costEach, int discount) {
		return (qty * costEach) - ((qty * costEach)*discount/100);
	}
	
	//9
	static float taxCalc(int salary, int tax) {
		return tax * salary / 100;
	}
}
