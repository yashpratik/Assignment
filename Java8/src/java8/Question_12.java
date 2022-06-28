package java8;


interface AA
{
	void third(int a[]);
}
public class Question_12
{
	public static void main(String []args)
	{
		AA obj=(a)->{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	//	System.out.println("Maximum No :"+a[len - 1]);
		for(int k = 1; k <= 5; k++)
		{
			System.out.println("Largest Element :"+k+" "+a[len - k]);
		}
		};
		int a[] = {10,20,30,40,50,60,70,80,90};
		obj.third(a);
	}
}