package tr.org.linux.kamp.garbage;

public class Garbage {
	
	public static void main (String[]args) {
		
		Runtime rt = Runtime.getRuntime();// programın akışını gösteren obje
		System.out.println("Toplam bellek : " + rt.totalMemory());
		
		String str = new String ("linux yaz kampı");
		String str1 = new String ("java programlama");
		System.out.println(str);
		str = str1;
		str = null;
		// System.gc();
		GarbageTest GarbageTest = new GarbageTest();
		GarbageTest.value = 1;
		GarbageTest = null;
		//System.out.println(gcTest.value);
		//System.out.println(GarbageTest);
		
		System.out.println("boş bellek: " + rt.freeMemory());
		
		System.gc();
		//System.out.println(gcTest.value);
		System.out.println("boş bellek: " + rt.freeMemory());
		
	}
	

}
