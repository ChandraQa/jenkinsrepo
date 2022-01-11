package firstprogram;

public class PhiramidPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1;
		for(int i=7;i>=0;i--)
		{
			
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=count;k++)
			{
				System.out.print("*");
				System.out.print(" ");
				
			}
			System.out.println();
			
			count=count+1;
		}
		
	}

}
