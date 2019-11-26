import java.util.Scanner;
class SortNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入1数字");
		int a = scan.nextInt();
		System.out.println("请输入2数字");
		int b = scan.nextInt();
		System.out.println("请输入3数字");
		int c = scan.nextInt();
		if(a > b){
			if(b > c){
				System.out.println(c + "<" + b + "<" + a);
			}
			else if (b == c) {
				System.out.println(c + "=" + b + "<" + a);
			}
			else{
				if (a < c){
					System.out.println(b + "<" + a + "<" + c);
				}
				else if (a == c){
					System.out.println(b + "<" + c + "=" + a);
				}
				else{
					System.out.println(b + "<" + c + "<" + a);
				}
			}
		}
		else if (a == b) {
			if(b > c){
				System.out.println(c + "<" + b + "=" + a);
			}
			else if (b == c) {
				System.out.println(b + "=" + c + "=" + a);
			}
			else{
				System.out.println(b + "=" + a + "<" + c);
			} 	
		}
		else {
			if(a > c){
				System.out.println(c + "<" + a + "<" + b);
			}
			else if (a == c) {
				System.out.println(c + "=" + a + "<" + b);
			}
			else{
				if (b < c){
					System.out.println(a + "<" + b + "<" + c);
				}
				else if (b == c){
					System.out.println(a + "<" + c + "=" + b);
				}
				else{
					System.out.println(a + "<" + c + "<" + b);
				}
			}
		}
	}
}