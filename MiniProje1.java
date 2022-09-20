package intro;

public class MiniProje1 {

	public static void main(String[] args) {
		// Sayı Asal Mı?
		int number = -5;
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("1 asal değildir");
			return;
		}
		if (number < 1) {

			System.out.println("Geçersiz sayı girdiniz.");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime == true) {
			System.out.println("Sayı Asaldır");

		} else {
			System.out.println("Sayı Asal Değildir");
		}

	}

}
