package tr.org.linux.kamp.garbage;

public class Hobbits {
	
		String name;
		
		public static void main(String[] args) {
			//sınıfımızın tipinde array oluşturduk
			Hobbits[] hobbits = new Hobbits[3];
			int z=0;
			
			while(z<3) {
				//3 tane yeni obje yarattık
				hobbits[z]=new Hobbits();
				hobbits[z].name="Frodo";
				
				if(z==1) {
					hobbits[z].name="Hello";
				}
				
				if(z==2) {
					hobbits[z].name="Sam";
				}
				System.out.println(hobbits[z].name +"" + "İlerliyor");
				z=z+1;
			}
		}
	}

