import java.util.Scanner;
class LineComparision
{
	public static void main(String[] args)
	{
		LineLength line=new LineLength();
		int x1,x2,y1,y2;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter line1 co-ordinates:");
		System.out.println("Enter x1:");
		x1=sc.nextInt();
		System.out.println("Enter x2:");
		x2=sc.nextInt();
		System.out.println("Enter y1:");
		y1=sc.nextInt();
		System.out.println("Enter y2:");
		y2=sc.nextInt();
		System.out.printf("length of line1:%.2f \n",line.lengthOfLine1(x1,x2,y1,y2));

		System.out.println("Enter line2 co-ordinates:");
		System.out.println("Enter x1:");
		x1=sc.nextInt();
		System.out.println("Enter x2:");
		x2=sc.nextInt();
		System.out.println("Enter y1:");
		y1=sc.nextInt();
		System.out.println("Enter y2:");
		y2=sc.nextInt();
		System.out.printf("length of line2:%.2f \n",line.lengthOfLine2(x1,x2,y1,y2));
		line.equals();
	}
}