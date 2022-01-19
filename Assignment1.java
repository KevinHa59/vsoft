
public class Assignment1 {

	public static void main(String[] args) {
		double planCost = planCostCalc(699, 18); // plan cost 699 with tax 18%
		System.out.println(planCost);
		
		double pizzaCost = pizzaCalc(2, 399, 20); // 2 pizza, $399 each, discount 20%
		System.out.println(pizzaCost);
		
		double tax = taxCalc(80000, 20); // salary: $80000, tax 20%
		System.out.println(tax);
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
