
public class LinearSearchEx1 {
	static int linearSearch(int[] arr1,int key)
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==key)
				{return i+1;}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int key=50;
		System.out.println(key+" is found at position: "+linearSearch(arr,key));

	}

}
