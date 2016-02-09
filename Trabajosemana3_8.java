
public class Trabajosemana3_8
{

	public static void main (String[] args){

		for (int num = 1; num <=10; num++)
			{
 			int fact = 1;
 			for (int n = 2; n<=num; n++)
 			{
 				fact = fact * n;
			}
			 System.out.println("El factorial de " + num + " es: " + fact);
				
			}
						
		}	

}