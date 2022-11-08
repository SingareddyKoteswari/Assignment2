import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //int[] arr= {50,10,30,20,70,40};
    Scanner s=new Scanner(System.in);
	int[] arr=new  int[5];
	for(int k=0;k<arr.length;k++)
		
	{
		System.out.println("enter the values");
		arr[k]=s.nextInt();
	}
    int temp;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=1;j<arr.length-i;j++)
    	{
    		if(arr[j]<arr[j-1])
    		{
    			temp=arr[j];
    			arr[j]=arr[j-1];
    			arr[j-1]=temp;
    		}
    	}
    }
    for(int k=0;k<arr.length;k++)
    {
    	System.out.print(" "+arr[k]);
    }
	}
}
    

