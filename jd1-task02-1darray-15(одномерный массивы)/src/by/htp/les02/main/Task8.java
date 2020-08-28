package by.htp.les02.main;

public class Task8 {
	public static void main(String[] args) {

		int[] mas = new int[10];

		for (int i = 0; i < mas.length; i++) {
			int random = (int) (Math.random() * 10);
			mas[i] = random;

		}

		for (int x : mas) {
			System.out.print(x + " ");
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}

		}

	}

}
