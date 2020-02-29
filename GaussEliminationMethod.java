//STOR Gauss Elimination Method

import java.util.Scanner;


public class p1 
{
     public static void main(String[] args)
     {
    	 float [][] a = new float [3][4];
    	 float m=0;
    	 int i,j;
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("enter elements");
    	 for(i=0;i<3;i++)
    	 {
    		 for(j=0;j<4;j++)
    		 {
    			 a[i][j]=in.nextInt();
    			 
    		 }
    	 }
    	 if(a[0][0]!=1)
    	 {
    		 m=a[0][0];
    		 for(j=0;j<4;j++)
    		 {
    			 a[0][j]=(a[0][j]/m);
    			 
    		 }
    			 
    	 }
    	 if(a[1][0]!=0)
    	 {
    		 m=a[1][0];
    		 for(i=0;i<4;i++)
    		 {
    			 a[1][i]=a[1][i]-(m*a[0][i]);
    			 
    		 }
    			 
    	 }
    	 if(a[2][0]!=0)
    	 {
    		 m=a[2][0];
    		 for(i=0;i<4;i++)
    		 {
    			 a[2][i]=a[2][i]-(m*a[0][i]);
    			 
    		 }
    			 
    	 }
    	 if(a[1][1]!=1)
    	 {
    		 m=a[1][1];
    		 for(i=0;i<4;i++)
    		 {
    			 a[1][i]=(a[1][i]/m);
    			 
    		 }
    			 
    	 }
    	 if(a[2][1]!=0)
    	 {
    		 m=a[2][1];
    		 for(i=0;i<4;i++)
    		 {
    			 a[2][i]=a[2][i]-(m*a[1][i]);
    			 
    		 }
    			 
    	 }
    	 if(a[0][1]!=0)
    	 {
    		 m=a[0][1];
    		 for(i=0;i<4;i++)
    		 {
    			 a[0][i]=a[0][i]-(m*a[1][i]);
    			 
    		 }
    			 
    	 }
    	 if(a[2][2]!=1)
    	 {
    		 m=a[2][2];
    		 for(i=0;i<4;i++)
    		 {
    			 a[2][i]=(a[2][i]/m);
    			 
    		 }
    			 
    	 }
    	 if(a[0][2]!=0)
    	 {
    		 m=a[0][2];
    		 for(i=0;i<4;i++)
    		 {
    			 a[0][i]=a[0][i]-(m*a[2][i]);
    			 
    		 }
    			 
    	 }
    	 if(a[1][2]!=1)
    	 {
    		 m=a[1][2];
    		 for(i=0;i<4;i++)
    		 {
    			 a[1][i]=a[1][i]-(m*a[2][i]);
    			 
    		 }
    			 
    	 }
    	 System.out.println("final matrix is:");
    	 for(i=0;i<3;i++)
    	 {
    		 for(j=0;j<4;j++)
    		 {
    			 System.out.println(a[i][j]+" ");
    		 }
    		 System.out.println();
    	 }
    	 
     }

}
