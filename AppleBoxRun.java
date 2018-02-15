import java.util.Scanner;
public class AppleBoxRun {
	public static void main(String [] args){
	Scanner in = new Scanner(System.in);
	Box B = new Box();
	System.out.print("Enter widthBox box: ");
	int WidthBox = in.nextInt();
	System.out.print("Enter LongBox box: ");
	int LongBox = in.nextInt();
	System.out.print("Enter amount apple: ");
	int AmountApple = in.nextInt();
	int SB = B.SizeBox(WidthBox,LongBox);
	System.out.println("Size Box = "+ SB +" m3");
	int CB = B.CapacityBox(SB);
	System.out.println("Capacity Box = "+ CB+ " Kg");
	/* int AmountApple = 10; */
	int AB = B.AmountBox(CB, AmountApple);
	System.out.println("Amount box =  "+ AB +", and one box filled not up to the end");
 }
}