package tr.org.linux.kamp.garbage;


	public class StringEx {
		public static void main(String[] args) {
			//String str="Hello Wolrd";
			//System.out.println(str);
			
			
			//String str=Integer.toString(115);
			//System.out.println(str);
			
			
			//String str ="hello wolrd";
			//System.out.println(str.charAt(1));
		
			//String a=new String("Hello");
			//String b=new String("Hello");
			//System.out.println(a==b);
			
			
			//String str ="hello wolrd";
			//System.out.println(str.substring(0,4));
			
			//ifade nerde başlıyorsa onun indexinden itibarebare başlıyor
			String str ="hello wolrd";
			//referans verdiği için eşit sayılmıyor
			System.out.println(str.substring(0, 2)=="he");
			//içerik olduğu için eşit döndürüyor
			System.out.println(str.substring(0, 2).equals("he"));
			
			
			
		}
	}



