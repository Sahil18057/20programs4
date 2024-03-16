class Matrix
{
	public static void main(String args[])
	{
		double m[] [] = {
		{ 0*0, 1*0, 2*0, 3*0 },
		{ 0*1, 1*1, 2*1, 3*1 },
		{ 0*2, 1*2, 2*2, 3*2 },
		{ 0*3, 1*3, 2*3, 3*3 }
		
	};
	int i, j;
	for(i=0; i<4; i++)
	{
			for(j=0; j<4; j++)
				System.out.println(m[i] [j] + " ");
				System.out.println();
		}
	}
}

/*

C:\Users\User1\Desktop\java programs\java25>java Matrix
0.0
0.0
0.0
0.0

0.0
1.0
2.0
3.0

0.0
2.0
4.0
6.0

0.0
3.0
6.0
9.0

*/