package tr.org.linux.kamp.garbage;


	import java.util.Scanner;

	public class EmailValidation {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Email giriniz :");
			String email=sc.next();
			
			System.out.println(emailValidation(email));
		}
		
		public static boolean emailValidation(String str) {
			if(str.contains(" ")) {
				return false;
			}
			if(!str.contains("@")) {
				return false;
			}
			if(!str.contains(".")) {
				return false;
			}
			if(!(str.charAt(0)!='@' || str.charAt(0)!='.')) {
				return false;
			}
			
			if(!(str.length()-str.lastIndexOf(".")>=2)) {
				return false;
			}
			if(!(str.indexOf(".")-str.lastIndexOf("@")>1)) {
				return false;
			}
			
//			if(!str.contains("@.")) {
//				return false;
//			}
			return true;
			
		}
	}


