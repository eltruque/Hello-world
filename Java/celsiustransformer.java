import java.util.Scanner;
public class celsiustransformer{

	public static void main(String[] args){
		int c, r, f, k;
		Scanner teclado = new Scanner(System.in);
		System.out.println("This program transform your celsius degrees to Farenheit, Reamur and Kelvin");
		System.out.println("Put the grades in Celsius");
		c=teclado.nextInt();
		r= (4*c/5);
		f=(9*c/5)+32;
		k=c+237;
		System.out.println("The Reamur degrees are: "+ r);
		System.out.println("The Farenheit degrees are: "+ f);
		System.out.println("The Kelvin degrees are: "+ k);
		



	}
}
