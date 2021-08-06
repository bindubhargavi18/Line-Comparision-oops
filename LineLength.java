import java.lang.Math;
class LineLength
{
	 int x1,x2,y1,y2;
	 double len1,len2;
	public double length1(int x1, int x2,int y1,int y2)
	{
	 	len1=Math.sqrt(((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2))));
	 	return len1;
	}
	public double length2(int x1, int x2,int y1,int y2)
	{
	 	len2=Math.sqrt(((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2))));
	 	return len2;
	}
	public void equality()
	{
		if(len1==len2)
			System.out.println("Lines are equal");
		else
			System.out.println("Lines are not equal");
	}
	
}
