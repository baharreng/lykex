package tr.org.linux.kamp.garbage;

public class CharacterArray {
	
	public static void main (String[] args) {
		//integer tipinde 2 boyutlu array return edicem
		int multiply[][]=new int[4][4];
		int counter=0;
		
		//matrislerin içini doldurduk 
		for(int i=1;i<multiply.length;i++) {
			for(int j=1;j<multiply[i].length;j++) {
				multiply[i][j]=counter;
				counter++;
			}
		}
		//yazdırmayı yaptık 
		for(int i=1;i<multiply.length;i++) {
			for(int j=1;j<multiply[i].length;j++)
				System.out.print(i*j+"\t");
			System.out.println(" ");
		}
	}
}

//bunları ayrı ayrı fonksiyonlarda yazmayı dene
 


