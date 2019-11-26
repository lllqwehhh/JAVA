import java.util.Scanner;
class DogAge{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入狗的年龄");
		int dogAge = scan.nextInt();
		if (dogAge < 0){
			System.out.println("输入有误");
		}
		else if (dogAge < 2){
			System.out.println("狗的年龄是" + 10.5 * dogAge);
		}
		else{
			System.out.println("狗的年龄是" + ((10.5 * 2) + (dogAge - 2) * 4));
		}
	}
}