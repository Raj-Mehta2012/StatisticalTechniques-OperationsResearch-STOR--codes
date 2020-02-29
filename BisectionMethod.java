//STOR BISECTION METHOD

import java.util.*;
import java.lang.Math;
public class bisection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double deg;	
		int d;//per
		int de;//temp
		
		int i;
		
		System.out.println("Enter degree: ");
		deg=sc.nextInt();
		d=(int)deg;
		de=d;
		
		double vals=deg+1;
		int coef =(int)vals;
		double a[]= new double [coef];
		
		for(i=0;i<vals;i++)
		{
			System.out.print("Enter value: ");
			a[i]=sc.nextDouble();
		}
		double eq0=0;
		double eq1=0;
		double eq=0;
		double x=0;
		double y=0;
		
		for(i=0;i<coef;i++)
		{
			eq0+=a[i]*Math.pow(1,de);
			de-=1;
		}
		
		de=d;
		
		for(i=0;i<coef;i++)
		{
			eq1+=a[i]*Math.pow(2,de);
			de-=1;
		}
		
		System.out.println("eq(1)= "+eq0);
		System.out.println("eq(2)= "+eq1);
		
		x=1;
		y=2;
		double mid=(x+y)/2;
		
		de=d;
		
		while(x-y<=0.02)
		{
				for(i=0;i<coef;i++)
				{
					eq+=a[i]*Math.pow(mid,de);
					de-=1;
				}
				System.out.println("eq:"+eq);
				
				de=d;
				System.out.print(" deg:"+de);
				 	
				if(eq<0){
					y=eq;
					eq=0;
					System.out.println("changed y:"+y);
				}
				else{
					x=eq;
					eq=0;
					System.out.println("changed x:"+x);
				}
				mid=(x+y)/2;
				System.out.println("x:"+x+" y:"+y);
		}
			
	}
}
