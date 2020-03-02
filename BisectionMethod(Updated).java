import java.util.*;
import java.lang.Math;
public class Bisect {

	float x1=1,x2=2,x0,value1,value2,mid;
	int degree;
	int counter = 1;
	float tempD;
	float [] coeff;
	
	void take_input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Degree");
		degree = sc.nextInt();
		degree++;
		
		coeff= new float[degree];
		for(int i=0;i<degree;i++)
		{
			System.out.println("Enter Coeffecient "+(i+1));		
			coeff[i] = sc.nextFloat();
		}	
	}
	void func_bisection_initial()
	{
		do
		{
			value1 = equation_ret(x1);
			value2 = equation_ret(x2);
			System.out.println(value1+"  " +value2);	
			if(value1>0&&value2>0)	
				x1--;
			else if(value1<0&&value2<0)
				x2++;	
		}while(false);
			//(value1<=0&&value2>=0);

	}
	float equation_ret(float x)
	{
		float value = 0;
		tempD = degree - 1;
		for(int i=0;i<degree;i++)
		{
			value += coeff[i]*Math.pow(x,tempD--); 
		}
		return value;
	}
	void func_bisection()
	{
		mid=(x1+x2)/2;
		if(equation_ret(mid)>0)
		{
			x2 = mid;
		}
		else
			x1 = mid;	
	}
	void main_function()
	{
		take_input();
		func_bisection_initial();
		do
		{
			func_bisection();
			
		}while((x2-x1)>0.005f);
		
		System.out.println(x1 +"  "+x2);
		mid=(x1+x2)/2;
		System.out.println("Final answer :"+equation_ret(mid));
	}
	public static void main(String[] args) {
		Bisect obj = new Bisect();
	
		obj.main_function();
		
	}

}
