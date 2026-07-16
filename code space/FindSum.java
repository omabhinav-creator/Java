class Find
{
	
	public int SumOfMultiplesOf3and5()
	{
		int  sum = 0;
	    int count = 0;
		for (int i = 1 ; i<=1000 ; i++)
		{
			if(i%3 == 0 && i%5 == 0 && count!=5)
			{
				System.out.print(i + " ");
				count = count + 1;
				sum = sum + i;
			}
		}
		//System.out.println("\nSum = " + sum);
		return sum;
	}
	public static void main(String args[])
	{
		Find O1 = new Find();
		int sum = O1.SumOfMultiplesOf3and5();
		System.out.println("\nSum = " + sum);
	}
}