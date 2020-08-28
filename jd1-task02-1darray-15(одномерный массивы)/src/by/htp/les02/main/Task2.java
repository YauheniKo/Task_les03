package by.htp.les02.main;

import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		int[] mas = new int[50];

		Random random = new Random();

		// переменная счетчик для определения размера второго массива
		// в нее будет заноситься количество элементов=0

		int valZero = 0; 

		// заполняем первый массив псевдослучайными числами

		for (int i = 0; i < mas.length; i++) {
			int rn = random.nextInt(20);
			mas[i] = rn;

			if (mas[i] == 0) {
				valZero++;
			}
		}
						// выводим на экран первый массив
		for (int x : mas) {
			System.out.print(x + " ");
		}
		System.out.println();
					/*
					* создаем переменну для заполнения второго массива(будет увеличиваться при
					* каждом усепшном занесении индекса нулевого элеменат с первого массива
					*/

		int d = 0;

		int[] mas2 = new int[valZero];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				mas2[d] = i;
				
				d++;
			}
		}

		for (int x : mas2) {
			System.out.print(x + " ");
		}

	}

}
