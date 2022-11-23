package types;

interface I1{
	public void add();
}

interface I2{
	public void add2();
}

class I3 implements I1,I2{
	int n=10;
	public void add()
	{
		
	}
	public void add2()
	{
		
	}
}
class I4 extends I3 implements I1,I2{ 
	
	int n2=20;
}
public class Interface {

	public static void main(String[] args) {
	}

}
