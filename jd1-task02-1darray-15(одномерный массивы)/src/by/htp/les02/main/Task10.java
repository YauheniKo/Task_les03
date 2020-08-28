package by.htp.les02.main;

public class Task10 {
	public static void main(String[] args) {

		int[] mas = new int[8];

		for (int i = 0; i < mas.length; i++) {
			int random = (int) (Math.random() * 10);
			mas[i] = random;

		}
		for (int x : mas) {
			System.out.print(x + " ");
			
		}
		
		System.out.println();
		
		
	
		int max = mas[0] + mas[mas.length - 1];

		for (int i = 1; i <mas.length/2+1; i++) {
			System.out.print(mas[i-1] + mas[mas.length - i]+" ");
			
			if (mas[i-1] + mas[mas.length - i] > max) {
				
				max = mas[i-1] + mas[mas.length - i];
			}

		}
		System.out.println();
		System.out.println("max="+max);

	}
}
