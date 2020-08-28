package by.htp.les02.main;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		int[] mas = new int[10];

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < mas.length; i++) {
			int random = (int) (Math.random() * 9);
			mas[i] = random;
			if (mas[i] % 2 == 0 & mas[i] != 0) {
				arr.add(mas[i]);
			}
		}
		for (int x : mas) {
			System.out.print(x + " ");
		}
		System.out.println();
		if (arr.size() == 0) {
			System.out.print("Четных элементов в массиве mas НЕТ");
		} else
			System.out.print("Четных элементов в массиве mas " + arr.size() + " шт.");

	}

}
