public class ZufallszahlenGenerator {
	// Attribute
	private long aktuellerWert;
	
	private static final long A = 9301 ;
	private static final long C = 49297 ;
	private static final long M = 233280 ;
	
	// KOnstruktoren
	public ZufallszahlenGenerator(long startWert) {
		aktuellerWert = startWert;
	}
	
	public ZufallszahlenGenerator() {
		aktuellerWert = System.currentTimeMillis();
	}
	
	public double zufallsDouble() {
        aktuellerWert = (aktuellerWert * A + C) % M;      // xn+1 = (xn * a + c) % m
        return (double) aktuellerWert / M;    // yn = xn / m

	}
	
	public double zufallsDouble(double max) {
		double min = 0;
		double temp = zufallsDouble();
		return (double) temp * (max - min) + min;
	}
	
	public int zufallsInt(int max) {
		return (int) Math.round(zufallsDouble(max));

	}
	
	public String toString() {
		return "";
	}
}
