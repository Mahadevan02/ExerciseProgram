import java.util.Scanner;  
   
class LinearSearchEx2   
{  
	public static void main(String args[])  
	{
		int c,n,search,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers: ");
		n=sc.nextInt();
		arr =new int[n];
		System.out.println("Enter the numbers: ");
		for(c=0;c<n;c++)
			arr[c]=sc.nextInt();
		System.out.println("Which number want to search: ");
		search=sc.nextInt();
		for(c=0;c<n;c++)
		{
			if(arr[c]==search)   //if present
			{
				System.out.println("The search number present in: "+(c+1));
				break;
			}
		}	if(c==n)        //if not present
				System.out.println("The numbers not found. ");
		
		
	}
}