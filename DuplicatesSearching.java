import java.util.Scanner;

public class DuplicatesSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];//array declaration
        for(int k=0;k<arr.length;k++)
			
		{
			System.out.println("enter the values");
			arr[k]=s.nextInt();
			
		}
		//int[] arr= {10,20,30,40,1};
		for(int i=0;i<arr.length;i++)
		{
			
        for(int j=i+1;j<arr.length;j++)
        {
        	if(arr[i]==arr[j])
        	{
        		System.out.println("the Duplicate values is" +arr[j]);
        		flag=true;
        		break;
        		
        	}
        }
        
        	
        }
        if(flag==false)
		{
		System.out.println("no duplicates");
		}
		
		

	}

}
