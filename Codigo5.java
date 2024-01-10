package revisionCodigo5;

import java.util.Scanner;

/*
 * El codigo permite al usuario agregar un numero y realiza una serie de operaciones
 * que eligen si el numero introducido cumple con las caracteristicas para ser
 * afortunado o no
 * */
public class Codigo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cambio en nombre de variables 
		//s por myScan 
		// ni por numberIntroduced
	    Scanner myScan = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    Short numberIntroduced = myScan.nextShort();
	    myScan.nextLine();
	    
	    
	    //Cambio nombre variables
	    int number = numberIntroduced;
	    int afo = 0;
	    int noAfo = 0;
	    
	    
	    // Cambio ciclo while por if
	    while (number > 0) {
			int digito = (int)(numberIntroduced % 10);
			
		    if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
				break;
		    } else {
				noAfo++;
			  
			  number /= 10;
		    }

		    
		  }
	    
		    if (afo > noAfo) {
		    	System.out.println("El " + numberIntroduced + " es un número afortunado.");
		    } else {
		    	System.out.println("El " + numberIntroduced + " no es un número afortunado.");
		    }
	}

}
