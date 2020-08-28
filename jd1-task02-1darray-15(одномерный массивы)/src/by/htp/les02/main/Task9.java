package by.htp.les02.main;

public class Task9 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		
		int zero=0;
		int negative=0;
		int positive=0;  
		
		
		for (int i = 0; i < mas.length; i++) {
			int random = (int) (Math.random() * 20-10);
			mas[i] = random;
			if(mas[i]==0) {
				zero++;
			}
			if(mas[i]>0) {
				positive++;
			}
			if(mas[i]<0) {
				negative++;
			}

		}
		for (int x : mas) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Количество чисел равных 0 в массиве = "+zero);
		System.out.println("Количество положительных чисел в массиве= "+positive);
		System.out.println("Количество отрицательных чисел в массиве= "+negative);
	}
}
