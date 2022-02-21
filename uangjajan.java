
import java.util.Scanner;

class uangjajan{
	public static void main(String[] args){
		int USD, Rupiah;
		Scanner input = new Scanner(System.in);
		System.out.println("Uang Yang Dikirim : USD : ");
		int uang = input.nextInt();
		USD = uang*2/100;
		Rupiah = uang*14200;
		System.out.println("Uang Terima :");
		System.out.println("USD =" +USD+ ",-");
		System.out.println("Rupiah=" +Rupiah+ ",-");
	}
}

		