package by.htp.les02.main;

public class Task5 {
	public static void main (String [] args) {
		
		int [] mass= {5,7,11,4,11,11};
		
		int max=mass[0];
		for(int i=1;i<mass.length;i++) {
			if(mass[i]>max) {
				max=mass[i];
			}
			
		}
		System.out.println("Наименьшая длина числовой оси, содержащая все элеинты массива="+max);
		
	}

}
