import java.util.Scanner;
class LineComparision
{
	public static void main(String[] args)
	{
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
		ComparingLines line=new ComparingLines();
		double l1=line.length1(x1,x2,y1,y2);
		System.out.printf("length of line1:%.2f \n",l1);

		System.out.println("Enter line2 co-ordinates:");
		System.out.println("Enter x1:");
		x1=sc.nextInt();
		System.out.println("Enter x2:");
		x2=sc.nextInt();
		System.out.println("Enter y1:");
		y1=sc.nextInt();
		System.out.println("Enter y2:");
		y2=sc.nextInt();
		double l2=line.length2(x1,x2,y1,y2);
		System.out.printf("length of line2:%.2f \n",l2);
		line.compareLines();
	}
}