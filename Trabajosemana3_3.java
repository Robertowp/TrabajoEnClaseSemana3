import java.util.Scanner;

public class Trabajosemana3_3
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int conta;
		int suma;
		int valor;
		int prom;

		conta = 1;
		suma = 0;
		System.out.println("Se le pedira que ingrese 10 valores.");
		while (conta <= 10){
			System.out.print("Ingrese un valor: ");
			valor = teclado.nextInt();
			suma = suma + valor;
			conta = conta + 1;
		}
		
		prom = suma / 10;
		System.out.println("La suma de los numeros ingresados es: " + suma);
		System.out.println("El promedio de los numeros ingresados es: " + prom);
		
	}
}