public class WuerfelTester {
	public static void main(String[] args) {
		// Anzahl Wuerfe
		int wuerfe = 30;
		
		int summe = 0;
		
		// Array zum tracken von den wuerfen
		int[] anzahl = new int[6]; // 0:1 1:2!!!
		
		// Erzeuge Objekt ZufallszahlenGenerator
		ZufallszahlenGenerator rand = new ZufallszahlenGenerator();
		
		// Gehe alle Wuerfe durch
		for(int i = 1; i <= wuerfe; i++) {
			// "wuerfle"
			int ran = rand.zufallsInt(5)+1;
			
			// Addiere zur Summe fuer Durchschnitt
			summe += ran;
			
			// Inkrementiere array auf pos ran
			anzahl[ran-1]++;
			
			// Gebe Zufallszahl aus
			System.out.println(i+": "+ran);
		}
		
		// Berechne Durchschnitt
		System.out.printf("Durchschnitt: %.2f%n",(double)summe/wuerfe);
		
		// for fuer absolute
		System.out.println("Absolute Haeufigkeit:");
		for(int i = 0; i<=5; i++) {
			System.out.println(i+1+": "+anzahl[i]);
		}
		
		// for fuer relativ
		System.out.println("Relative Haeufigkeit:");
		for(int i = 0; i<=5; i++) {
			System.out.printf("%d: %.2f%s%n", i+1, ((double)anzahl[i]/wuerfe)*100," %");
		}
	}

}
