package tr.org.linux.kamp.garbage;

public class ToUpperCaseEx {
	
		public static void main(String[] args) {
			String str ="hello wolrd";
			System.out.println(ToOurUpperCase(str).equals(str.toUpperCase()));
			System.out.println(ReverseString(str));
			System.out.println(ReverseString2(str));
			System.out.println(isPalindrome(str));

		}
		public static String ToOurUpperCase(String str){
			String result="";
			for(int i=0;i<str.length();i++) {
				result+=Character.toUpperCase(str.charAt(i));
			}
			return result;
		}
		
		//reverse string
		
		public static String ReverseString(String str) {
			String result="";
			for(int i=str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
			}
			return result;
		}
		
		public static String ReverseString2(String str) {
			String result="";
			for(int i=0;i<str.length();i++) {
				result+=str.charAt(str.length()-i-1);
			}
			return result;
		}
		
		//tersine çevirdik eşit mi diye baktık 
		public static boolean isPalindrome(String str) {
			return str.equals(ReverseString(str));
		}
		
}
