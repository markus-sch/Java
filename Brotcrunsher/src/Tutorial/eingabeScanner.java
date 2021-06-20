package Tutorial;

import java.util.Scanner;

/**
 * Tutorial vom Brotcrunsher
 * 
 * @author Markus Schlußmeier @18.05.2021
 *
 */
public class eingabeScanner {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Wie alt bist Du?");
		i = s.nextInt();

		if (i >= 18) {
			System.out.println("Du bist volljährig.");
			System.out.println("Das ist doch super!");
		} else {
			System.out.println("Du bist nicht volljährig.");
		}

	}

}
