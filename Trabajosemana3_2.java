import java.util.Scanner;

public class Trabajosemana3_2
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int var1 = 0;
		System.out.println("Hasta que numero quiere contar: ");
		int var2 = teclado.nextInt();

		while (var1 < var2){
			var1++;
			System.out.print(var1 + " ");
		}
		
		
		
	}
}