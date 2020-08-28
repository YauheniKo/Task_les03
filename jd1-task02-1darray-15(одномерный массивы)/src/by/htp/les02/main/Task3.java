package by.htp.les02.main;

public class Task3 {
	public static void main(String[] args) {

		int[] mas = { 1, 25, 27, 36, 39 };
			
		  int j=0; 
		  
			for (int i = 1; i < mas.length; i++) {
				if (mas[i - 1] < mas[i]) {
					j++;
				}
			}
			
			if (j == mas.length - 1) {
				System.out.println("Элементы массива расположены по возрастающей");
			} else {
				System.out.println("Элементы массива НЕ расположены по возрастанию");
			}

/*
 * немного короче
 * for (int i = 1; i < mas.length; i++) {
			if (mas[i - 1] < mas[i]) {

			} else
				System.out.println("Элементы массива НЕ расположены по возрастанию");

		}
 */
	}

}
