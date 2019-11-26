import java.util.Scanner;

class Lottery{
	public static void main(String[] args) {
		int num = (int)(Math.random() * 90 + 10);
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你想买的数字");
		int numCustomer = scan.nextInt();
		int ten1 = num / 10;
		int ten2 = numCustomer / 10;
		int ge1 = num % 10;
		int ge2 = numCustomer % 10;
		if (ten1 == ten2 && ge1 == ge2){
			System.out.println("10000");
		}
		else if (ten1 == ge2 && ge1 == ten2) {
			System.out.println("3000");
		}
		else if (ten1 == ten2 || ge1 == ge2) {
			System.out.println("1000");
		}
		else if (ten1 == ge2 || ge1 == ten2) {
			System.out.println("500");
		}
		else{
			System.out.println("作废");
		}
	}
}