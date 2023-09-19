package hmwk;

public class Employee {

	public static void main(String[] args) {
		
		
		
		Fulltime	ob = new Fulltime();
		ob.calsal();
		ob.bonos();
		ob.salary();
		
		System.out.println("=============================");
		
		
		PartTime ob1 = new PartTime();
		ob1.bonos1();
		ob1.calsal();
		ob1.salary();
		System.out.println("=============================");
		
		
		Contract o = new Contract();
		
		o.calsal();
		o.bonos2();
		o.salary();
		
		
		

	}

}
