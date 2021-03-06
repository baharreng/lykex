package tr.org.linux.kamp.garbage;



import java.util.Random;

public class RandomArray {
	private static Random rgen=new Random();
	private static int board=10;
	private static int[] array=new int[board];
	
	public static void main(String[] args) {
		generateArray();
		printArray();
		sortArray();
		
		System.out.println("\n"+"Sıralanmış dizi:");
		printArray();
		
		int item = 5;
		if(searchItem(item)) {
			System.out.println("\n"+"Item dizinin içinde bulundu");
		}
		else {
			System.out.println("\n"+"Item dizinin içinde yok");
		}
		
		int index=lastIndexOfItem(item);
		if(index!=-1) {
			System.out.println(item + " elemanı "+ index+". indexte "  );
		}
	}
	
	private static boolean searchItem(int item) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==5) {
				return true;
			}
		}
		return false;
	}

	public static void generateArray() {
		int item;
		for(int i=0;i<array.length;i++) {
			item=rgen.nextInt(10);
			array[i]=item;
		}
	}
	
	public static void printArray() {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i] +" ");
		}
	}
	
	public static void sortArray() {
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++)
				if(array[j-1] > array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
		}
	}
	
	public static int lastIndexOfItem(int item) {
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
