//STOR Lagrange's Interpolation

import java.util.*;

public class Lagrange {

	public static void main(String[]args) 
	{
		int size=0,i=0,j=0;
		double newx=0,newy=0,ans=0,sum1=1,sum2=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		size=sc.nextInt();
		
		double x[]=new double[size];
		double y[]=new double[size];
		double form[]=new double[size];
		
		System.out.println("Enter values for x: ");
		for(i=0;i<size;i++)
		{
			x[i]=sc.nextDouble();
		}
		
		System.out.println("Enter values for y: ");
		for(i=0;i<size;i++)
		{
			y[i]=sc.nextDouble();
		}
		
		System.out.println("Enter new x: ");
		newx=sc.nextDouble();
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(j!=i)
				{
					sum1*=newx-x[j];
					sum2*=x[i]-x[j];
				}
			}
			
			form[i]=(sum1/sum2)*y[i];
			sum1=1;
			sum2=1;
		}
		
		for(i=0;i<size;i++)
		{
			ans+=form[i];
		}
		System.out.println("ans: "+ans);
	}
}
