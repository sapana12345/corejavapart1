package corejavapart1;

public class additonmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] x={{10,20,30},{20,10,40},{23,45,32}};
int [][] y={{1,2,30},{20,21,40},{2,52,34}};
int[][] sum= new int[3][3];

int i,j;
for(i=0;i<x.length;i++)
{
	for(j=0;j<x[0].length;j++)
	{
		sum[i][j]=x[i][j]+y[i][j];
		
			
	}
}
System.out.println("addtion of two matrix");
for(i=0;i<x.length;i++)
{
	for(j=0;j<x[0].length;j++)
	{
		
		System.out.format("%d \t",sum[i][j]);

			
	}
	System.out.println();

}
	}

}
