class Casting
{
	public static void main(String args[])
	{
		float sum;
		int i;
		sum = 0.0F;
		for(i = 1; i <= 10; i++)
		{
			sum = sum +1/(float)i;
			System.out.println(" i = " +i);
			System.out.println(" sum = " +sum);
		}
	}
}

/*

C:\Users\User1\Desktop\java programs\java25>java Casting
 i = 1
 sum = 1.0
 i = 2
 sum = 1.5
 i = 3
 sum = 1.8333334
 i = 4
 sum = 2.0833335
 i = 5
 sum = 2.2833335
 i = 6
 sum = 2.4500003
 i = 7
 sum = 2.5928574
 i = 8
 sum = 2.7178574
 i = 9
 sum = 2.8289685
 i = 10
 sum = 2.9289684

*/