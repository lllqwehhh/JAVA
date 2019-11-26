import java.util.Scanner;
class DividedNumber{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input your number:");
		int num = scan.nextInt();
		if (num < 10000 && num >= 0){
			int t = num / 1000;
			int h = num / 100 % 10;
			int ten = num / 10 % 10;
			int o = num % 10;
			System.out.println(t + "thousnds" + h + "hundreds" 
				+ ten + "tens" + o + "ones"); 
		}
		else{
			System.out.println("warning");
		}
	}
}