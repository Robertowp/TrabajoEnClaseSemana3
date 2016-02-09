import java.util.Scanner;

public class Trabajosemana3_7
{

	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

				
				System.out.print("Ingrese un Numero: ");
				int num = teclado.nextInt ();
				int n = num;
				int fact = 1;
				if (n == 0 || n ==1){
					System.out.println("El factorial de 1 es: " + "1");
				}
					 else {
					 	while(n>1){
					 		fact = fact * n;
					 		n--;
					 	}
					 	System.out.println ("El factorial de " + num + " es: " + fact);
					 }
					
					//System.out.println ("El factorial de " + num + " es: " + fact);
				}	


		}