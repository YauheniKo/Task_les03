package by.htp.les02.main;

import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
		int[] mas = new int[7];
		
		Random random = new Random();
		
		int multiple = 5;
		int sum=0;
		
		for (int i = 0; i < mas.length; i++) {
			int ran = random.nextInt(50);
			mas[i] = ran;
			if (mas[i] % multiple == 0) {
				sum = sum + mas[i];

			} 
		}
		for (int m : mas) {
			System.out.print(m + " ");

		}
		System.out.println();
		
		if(sum==0) {
			System.out.print("Числа кратные "+multiple+" отсутствуют");	
		}
		else {
		System.out.print("Сумма чисел кратных "+multiple+"= "+sum);
		}

	}

}
