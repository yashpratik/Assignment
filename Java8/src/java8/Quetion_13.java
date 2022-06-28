package java8;

public class Quetion_13 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
		
		for(int i=0;i<a.length-1;i++)
		{
			if(i<=4)
			{
				String aa=a[i]+" - "+(a[i+2]);
				System.out.println(aa+" , ");
				i=i+2;
			}else
			{
				if(i<=10)
				{
					String aa=a[i]+" - "+(a[i+4]);
					System.out.println(aa+" , ");
					i=i+4;
				}else
				{
					String aa=a[i]+" - "+(a[i+3]);
					System.out.println(aa);
					System.out.println(" ");
					i=i+4;
				}
			}
		}
	}
}
