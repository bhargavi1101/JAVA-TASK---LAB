class greatestnumber
{
	public static void main(String args[])
	{
		int a=4,b=14,c=24,large;
		large=(a<b)?(a<c?a:c):(b>c?b:c);
		System.out.println("Largest number among " +a+","+b+" and "+c+" is " +large);
	}
}