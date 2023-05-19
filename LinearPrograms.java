package Lab5_6;

public class LinearPrograms {
	public static void main (String [] args){
		//Завдання 1
		int a = 23;
		int b = 5;
        double c = (double) a / b;
        int d = a % b;
        System.out.printf("Результат:" + c + " Залишок:" + d);
        
        //Завдання 2
        int num = 54;
        if (num >= 10 && num <= 99) {
        	int e = num % 10;
        	int f = (num / 10) % 10;
        	System.out.println(" Сума цифр числа дорівнює" + (e+f));
        }
        
      //Завдання 3
        double x = 3.47;
        double res = (double)Math.floor(x);
        System.out.println("Округлене число:" + res);
       }
}
