public class Main {
	public static void main(String[] args) {

		System.out.println("---------------------------------------------- TIPI PRIMITIVI --------------------------------------");

		boolean b = true;
		b = false;
		// b = "true"; // <-- Non posso mai assegnare un valore incompatibile ad un boolean

		byte numInteroMoltoPiccolo = 100;
		short numeroPiccolo = 10000;
		int numeroIntero = 1000000;
		// int numeroIntero = "1000000"; // <-- Non posso mai assegnare un valore incompatibile ad un int
		int numeroIntero2 = Integer.parseInt("1000000"); // <-- Posso però convertire un numero scritto in formato testuale in un intero usando parseInt()
		long numeroInteroGrandissimo = 10000000;

		// numeroInteroGrandissimo = numInteroMoltoPiccolo; // <--  Java qua fa una conversione implicita (CASTING IMPLICITO), ovvero una conversione automatica
		// fatta dallo stesso Java, e lo riesce a fare perché i 2 formati sono compatibili (ovvero il contenuto piccolo sta nella scatola grande)

		System.out.println(numeroInteroGrandissimo);

		byte numeroPiccolo2 = (byte) numeroInteroGrandissimo; // <-- Esempio di CASTING ESPLICITO, ovvero è lo sviluppatore che si prende la responsabilità di forzare
		// una conversione. Bisogna però utilizzare questa tecnica con massima cautela perché in tutta una serie di casi potrebbe portare ad avere dei dati corrotti
		System.out.println(numeroPiccolo2);

		// float numeroDecimale = 1.5f;
		double altroDecimale = 1.5;
		// Entrambi sono numeri decimali però utilizzeremo sempre i double in quanto i processori moderni riescono a svolgere i calcoli in maniera più efficiente con essi


		char carattereSingolo = 'Z'; // Quando devo salvare un singolo carattere sarebbe preferibile anche se non fondamentale utilizzare i char
		String testoConPiuCaratteri = "Hello world";
		System.out.println(testoConPiuCaratteri);
		System.out.println("La lunghezza della stringa è: " + testoConPiuCaratteri.length());
		System.out.println("String in upper case: " + testoConPiuCaratteri.toUpperCase());
		System.out.println("Il primo carattere della stringa è: " + testoConPiuCaratteri.charAt(0));


		System.out.println("----------------------------------------- ARRAYS -----------------------------------------------");
		String[] stagioni = {"Primavera", "Estate", "Autunno", "Inverno"};
/*		String[] stagioni = new String[4];
		stagioni[0] = "Primavera";
		stagioni[1] = "Estate";
		stagioni[2] = "Autunno";
		stagioni[3] = "Inverno";*/
		// stagioni[4] = "Quinta stagione"; <-- ArrayIndexOutOfBoundsException

		for (int i = 0; i < stagioni.length; i++) {
			System.out.println("Elemento corrente " + stagioni[i]);
		}

	}
}