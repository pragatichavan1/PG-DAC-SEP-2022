
class starpattern7{

public static void main(String args[]){
	
	for(int i=1;i<=4;i++)//rows
	{
		for(int j=3;j>=i;j--)//space
		{
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++)//star
		{
			System.out.print("*");
			
		}
			for(int j=0;j<i-1;j++)//star
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
		
		
		
		for(int i=2;i<=4;i++)//rows
	{
		for(int j=2;j<=i;j++)//space
		{
			System.out.print(" ");
			
		}
			for(int j=4;j>i;j--)//star
		{
			System.out.print("*");
			
		}
		for(int j=3;j>=i-1;j--)//star
		{
			System.out.print("*");
			
		}
		
		System.out.println();
	
	}
	
	
} 
}


