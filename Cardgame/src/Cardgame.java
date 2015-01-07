import java.util.*;

public class Cardgame {
	public static void main(String[] args) {
		// Creating object of class Random
		Random random = new Random();
		// Creating object of class Scanner
		Scanner in = new Scanner(System.in);

		// Fields
		int b = 0; // stores your points
		int c = 0; // stores the computer's points
		double d; // stores the number of games

		System.out.println("Dobre doshli v Kartovata mi igra!");
		System.out
				.println("Ima edno teste s karti razprasnato na igralnata masa.");
		System.out
				.println("Vie i vashiat oponent ste izteglite po edna karta, ot koqto po-golqmata ste pobedi.");
		System.out
				.println("Sled vseki rund izteglenite karti se vrastat obratno v testeto ot razpilqni karti na masata.");
		System.out
				.println("Igracha, koito ima nai-mnogo specheleni rundove v kraq na igrata - pecheli.");
		System.out
				.println("Sled kato ste gotovi s cheteneto na instrukciite, molq natisnete Enter!");
		System.out
				.println("*********************************************************************************************");
		System.out.println("Kolko runda bihte zelali da izigraete?");

		// Creating object of class Scanner
		Scanner onin = new Scanner(System.in);
		d = onin.nextInt();

		System.out
				.println("*********************************************************************************************");

		while (d > 0) {
			// inicializing a variable that will store a random number from 2-13
			int a = random.nextInt(13) + 2;
			if (a == 2) {
				// if a=2 then the card that you took is 2
				System.out.println("Vie izteglihte dvoika!");
				// inicializing a variable that will store a random number from
				// 1-13
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika i napravi runda raven!");
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika i specheli runda!");
					d--;
					c++;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka i specheli runda!");
					d--;
					c++;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica i specheli runda!");
					d--;
					c++;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica i specheli runda!");
					d--;
					c++;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica i specheli runda!");
					d--;
					c++;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica i specheli runda!");
					d--;
					c++;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 3) {
				System.out.println("Vie izteglihte troika!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che tozi rund e raven!");
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka i specheli runda!");
					d--;
					c++;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica i specheli runda!");
					d--;
					c++;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica i specheli runda!");
					d--;
					c++;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica i specheli runda!");
					d--;
					c++;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica i specheli runda!");
					d--;
					c++;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 4) {
				System.out.println("Vie izteglihte chetvorka!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica i specheli runda!");
					d--;
					c++;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica i specheli runda!");
					d--;
					c++;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica i specheli runda!");
					d--;
					c++;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica i specheli runda!");
					d--;
					c++;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 5) {
				System.out.println("Vie izteglihte petica!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica i specheli runda!");
					d--;
					c++;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica i specheli runda!");
					d--;
					c++;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica i specheli runda!");
					d--;
					c++;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 6) {
				System.out.println("Vie izteglihte shestica!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli  shestica, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica i specheli runda!");
					d--;
					c++;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica i specheli runda!");
					d--;
					c++;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 7) {
				System.out.println("Vie izteglihte sedmica!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica i specheli runda!");
					d--;
					c++;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 8) {
				System.out.println("Vie izteglihte osmica!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 9) {
				System.out.println("Vie izteglihte devqtka!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka i specheli runda!");
					d--;
					c++;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 10) {
				System.out.println("Vie izteglihte desqtka!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale i specheli runda!");
					d--;
					c++;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 11) {
				System.out.println("Vie izteglihte Vale");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka,koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama i specheli runda!");
					d--;
					c++;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 12) {
				System.out.println("Vie izteglihte Dama!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka,koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama, koeto oznachava che runda e raven!");
					d--;
				} else if (e == 12) {
					System.out
							.println("Vashia oponent iztegli Pop i specheli runda!");
					d--;
					c++;
				} else if (e == 13) {
					System.out
							.println("Vashia oponent iztegli Aso i specheli runda!");
					d--;
					c++;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			} else if (a == 13) {
				System.out.println("Vie izteglihte Pop!");
				int e = random.nextInt(13) + 1;
				if (e == 1) {
					System.out
							.println("Vashia oponent iztegli dvoika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 2) {
					System.out
							.println("Vashia oponent iztegli troika, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 3) {
					System.out
							.println("Vashia oponent iztegli chetvorka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 4) {
					System.out
							.println("Vashia oponent iztegli petica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 5) {
					System.out
							.println("Vashia oponent iztegli shestica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 6) {
					System.out
							.println("Vashia oponent iztegli sedmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 7) {
					System.out
							.println("Vashia oponent iztegli osmica, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 8) {
					System.out
							.println("Vashia oponent iztegli devqtka, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 9) {
					System.out
							.println("Vashia oponent iztegli desqtka,koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 10) {
					System.out
							.println("Vashia oponent iztegli Vale, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				} else if (e == 11) {
					System.out
							.println("Vashia oponent iztegli Dama, koeto oznachava che vie spechelihte runda!");
					b++;
					d--;
				}
				Scanner keyboard = new Scanner(System.in);
				keyboard.nextLine();

			}
		}
		System.out
				.println("***********************************************************************************************");
		System.out.println("Vashia finalen rezultat e " + b);
		System.out.println("Finalnia rezultat na oponenta vi e " + c);
		if (b > c) {
			System.out.println("Bravo na vas!Spechelihte igrata!");
			System.out
					.println("*******************Krai na igarata!********************************************************");

		} else if (b < c) {
			System.out.println("Vashia oponent specheli igrata!");
			System.out
					.println("*******************Krai na igarata!****************************************************");

		} else if (b == c) {
			System.out.println("Vie zavarshihte naravno s vashia oponent!");
			System.out
					.println("*******************Krai na igarata!****************************************************");

		}

	}

}
