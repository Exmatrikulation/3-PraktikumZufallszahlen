public class ZufallsTester {
	public static void main(String[] args) {
		// Erzeuge Startwertkonstruktor
		ZufallszahlenGenerator rand = new ZufallszahlenGenerator(84894081018168186L); // L weil Long!
		
		System.out.println("Festgelegter Startwert:");
		for(int i = 0; i <= 20; i++) {
			System.out.println(i+". :" +rand.zufallsInt(100));
		}
		
		// Erzeuge default
		ZufallszahlenGenerator rand2 = new ZufallszahlenGenerator();
		
		System.out.println("Timestamp");
		
		for(int i = 0; i <= 20; i++) {
			System.out.println(i+". :" +rand2.zufallsInt(100));
		}
	}

}
