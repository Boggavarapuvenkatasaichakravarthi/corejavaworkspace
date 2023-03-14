
public class Loop8 {

	public static void main(String[] args) {
		int i,j,n=5;
		for( i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++) 
			{
				if(i==j || i+j==6 )
				{
					System.out.print(" 7 ");				
				}
		
			else 
			{
				System.out.print(" 1 ");
			}
		   }
		System.out.println();
		}
		System.out.println();

	}

}
