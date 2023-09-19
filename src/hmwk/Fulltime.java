package hmwk;

public class Fulltime extends Emp{
	
	public void bonos() {
		
		System.out.println("Bonous to Full time emp is 10000");
	}

	@Override
	public void calsal() {
		System.out.println("Salary to full time emp is 8*10000");		
	}

	@Override
	public void salary() {
		System.out.println("this is a dulpcate method in fulltime");
		
	}

}
