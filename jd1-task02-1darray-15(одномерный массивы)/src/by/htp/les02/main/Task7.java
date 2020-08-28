package by.htp.les02.main;

import java.util.Random;

public class Task7 {

	public static void main(String[] args) {
		int[] mas = new int[7];

		Random random = new Random();
// заполняем массив рандомными числами от 0 до 10;
		for (int i = 0; i < mas.length; i++) {
			int ran = random.nextInt(10);
			mas[i] = ran;
		}
		for(int x:mas) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Поменяем максимальное и минимальное числа массива местами ");
		int min=mas[0];
		int max=mas[0];
		int maxInd=0;
		int minInd=0;
		
		// находим максимальное число и его индекс
		for(int i=1;i<mas.length;i++) {
			if(mas[i]>max) {
				max=mas[i];
				maxInd=i;
			}
			
		}
		// находим минимальное число и его индекс
		for(int i=1;i<mas.length;i++) {
			if(mas[i]<min) {
				min=mas[i];
				minInd=i;
			}
		}
		System.out.println("индекс="+ maxInd+" max=" +max);
		System.out.println("индекс="+ minInd+" min=" +min);
		
		// меняем местами максимальное и минимальное числа
		mas[maxInd]=min;
		mas[minInd]=max;
		
		for(int x:mas) {
			System.out.print(x+" ");
		}
	}

}
