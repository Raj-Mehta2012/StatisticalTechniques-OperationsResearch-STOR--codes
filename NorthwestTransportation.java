// STOR Northwest Transportation

import java.util.*;

public class Transport 
{
	public static void main(String[] args){
		
		int row=0,col=0,sum=0,i=0,j=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of sources: ");
		row=sc.nextInt();

		System.out.println("Enter no of destinations: ");
		col=sc.nextInt();	
		
		int[][] mat=new int[row][col];
		int[] dem=new int[col];
		int[] sup=new int[row];
		int[][] ans=new int[row][col];
		
		System.out.println("Enter Matrix Elements: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				ans[i][j]=0;
			}
		}
		
		System.out.println("Enter demand matrix: ");
		for(i=0;i<col;i++)
		{
			dem[i]=sc.nextInt();
		}
		
		System.out.println("Enter supply matrix: ");
		for(i=0;i<row;i++)
		{
			sup[i]=sc.nextInt();
		}
		
			i=0;
			j=0;
			while(j<col&&i<row)
			{
			
				if(dem[i]<sup[j])
				{
					if(i!=0)
					{
						int s=i;
						ans[i][j]+=dem[i]-ans[s-1][j];
					}
					else
						ans[i][j]=dem[i];
					
					ans[i][j+1]=sup[j]-ans[i][j];
					i++;
					j++;
				}
				else
				{
					if(j!=0)
					{
						int s=j;
						ans[i][j]+=sup[i]-ans[i][s-1];
					}
					else
						ans[i][j]=sup[j];

					ans[i+1][j]=dem[i]-ans[i][j];
					j++;
					i++;
				}
				
			}
			System.out.println("ans mat is");
			for(i=0;i<row;i++)
			{
				System.out.println("");
				for(j=0;j<col;j++)
				{
					System.out.print(" "+ans[i][j]);
				}
			}
			
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					sum+=mat[i][j]*ans[i][j];
				}
			}
			System.out.println(" T.COST= "+sum);
	}		
}
	

