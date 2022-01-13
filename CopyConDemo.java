
public class CopyConDemo 
{
	int m;
	String n;
	public CopyConDemo(int m, String n) 
	{
		this.m=m;
		this.n=n;
	}

	public CopyConDemo(CopyConDemo c) 
	{
		this(c.getM(),c.getN());
	}
	
	void setM(int m)
	{
		this.m=m;
	}
	int getM()
	{
		return m;
	}
	
	
	void setN(String n)
	{
		this.n=n;
	}
	String getN()
	{
		return n;
	}

	public static void main(String[] args) 
	{
		CopyConDemo c1=new CopyConDemo(12,"Original");
		CopyConDemo c2=new CopyConDemo(c1);
		c2.setN("First");
		System.out.println("Original Copy M= "+c1.getM()+" N= "+c1.getN());
		System.out.println("First Copy M= "+c2.getM()+" N= "+c2.getN());

	}

}
