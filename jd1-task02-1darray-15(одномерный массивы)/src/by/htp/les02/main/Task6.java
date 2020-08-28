package by.htp.les02.main;

public class Task6 {
	public static void main(String[] args) {

		int[] mas = { 4, 32, 74, 28, 5 };
		
		System.out.println("Z = "+mas.length);
		
		int value = 0;
		
		System.out.println("Меням числа большие Z на Z");
		
		for (int i = 0; i < mas.length; i++) {
			
				
			if (mas[i] > mas.length) {
				mas[i] = mas.length;
				value++;
			}
		}
		for (int x : mas) {
			System.out.print(x + " ");

		}
		System.out.println();
		System.out.println("Количество чисел, больших Z (количество замен)=" + value);
	}
}