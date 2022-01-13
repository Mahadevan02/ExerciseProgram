
public class MOverload 
{
	void add(int a,int b)
	{
		int addition=a+b;
		System.out.println("Addition of two numbers: "+addition);
	}
	
	void add(int a,int b,int c)
	{
		float addition=a+b+c;
		System.out.println("Addition of three numbers: "+addition);
	}
	
	public static void main(String[] args) 
	{
		MOverload m=new MOverload();
		m.add(5, 12);
		m.add(45,20, 21);
		

	}

}
