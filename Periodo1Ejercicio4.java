import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Entrada = new Scanner (System.in);
    int reglas;
    double nota;
    System.out.println ("Ustes cumple las reglas de la universidad: ");
    System.out.println ("Ingrese un numero: \n 1. Siempre \n 2. Aveces \n 3. Nunca")
    reglas = Entrada.nextInt ();
    System.out.println ("Que nota obtuvo en el laboratorio: ");
    nota = Entrada.nextDouble ();
    if (reglas == 1){
      if (nota >= 8 & nota <= 10) {
        nota = 10;
      } else {
        System.out.println ("Nota invalida");
      }
    } else if (reglas == 2){
      if (nota  < 6) {
           nota = nota + 0.5;
      } else if ( nota >= 6 & nota < 8) {
           nota = nota + 0.7;
       } else {
           System.out.println("Nota invalida");
       } 
    } else {
       System.out.println("Usted debe cumplir las reglas");
    }
    System.out.println("La nueva nota es: " + nota); 
  }}
    
    
  }
}
