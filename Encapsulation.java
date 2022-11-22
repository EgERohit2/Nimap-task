//c)how to achieve the Encapsulation in Java ?

package dailyTask;

class Nimap_infotech {
	private int id;
	private String name = "Rohit";
	private double salary;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Nimap_infotech obj = new Nimap_infotech();
		obj.setSalary(15000.00);
		obj.setId(10);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());

	}

}
