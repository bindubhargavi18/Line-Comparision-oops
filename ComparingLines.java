class ComparingLines extends LineLength
{
	public void compareLines()
	{
		super.length1(x1,x2,y1,y2);
		super.length2(x1,x2,y1,y2);
		if(len1>len2)
			System.out.println("Line1 is greater than line2");
		else if(len1<len2)
			System.out.println("Line1 is less than line2");
		else if(len1==len2)
			System.out.println("Both lines are equal");
		else
			System.out.println("Lines are neither equal nor less or greater");
	}
}