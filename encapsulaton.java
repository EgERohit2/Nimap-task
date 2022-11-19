//	Write a program to demonstrate the "Encapsulation" and explain why it is used

package types;

//driver class
class employee{
	private int id=1;
	private String name="Rohit";
	private  double sal=12354.00;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	
	
}

public class encapsulaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee emp=new employee();
		emp.setSal(15000.00);
		emp.setId(100);
		emp.setName("EgERohit");
		System.out.println(emp.getSal());
		
		
		
	
	}
	


}
