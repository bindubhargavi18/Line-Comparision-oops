import java.util.Scanner;
class LineComparision
{
	public static void main(String[] args)
	{
		int x1,x2,y1,y2;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1:");
		x1=sc.nextInt();
		System.out.println("Enter x2:");
		x2=sc.nextInt();
		System.out.println("Enter y1:");
		y1=sc.nextInt();
		System.out.println("Enter y2:");
		y2=sc.nextInt();
		LineLength line=new LineLength(x1,x2,y1,y2);
		System.out.printf("length of line:%.2f ",line.length());
	}
}