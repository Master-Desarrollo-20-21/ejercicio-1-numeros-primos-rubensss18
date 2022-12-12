package primos;

public class Ejercicio_1 
{
	
	public static boolean esPrimo(int numero) 
	{
		
		boolean primo = true;
		
		// El 0, 1 y 4 no son primos
		if (numero==0 || numero==1 || numero==4) 
		{
			primo = false;
		}
		else
		{
			for (int x=2; x < numero/2 && primo; x++) 
			{
				
				// Si es divisible por cualquiera de estos números no es primo
				if (numero%x == 0)
					primo = false;
			}
		}
		
		return primo;
	}
	
	public static void main (String [ ] args) 
	{
		
		// Prog_1: suma de los primos que hay en [0-49]
		int suma1 = 0;
		
		for (int i=0; i<50; i++) 
		{
			if ( esPrimo(i) )
				suma1+=i;	
		}
		
		// Prog_2: suma de los primeros 50 primos
		int suma2 = 0;
		int cont = 0;
		int i = 0;
		
		while( cont <5 )
		{
			if ( esPrimo(i) )
			{
				cont++;
				suma2+=i;
			}
				
			
			i++;
		}
		
		System.out.println ("La suma de los primos que hay en [0-49]: " + suma1 );
		System.out.println ("La suma de los priemros 50 números primos: " + suma2 );

	}

}
