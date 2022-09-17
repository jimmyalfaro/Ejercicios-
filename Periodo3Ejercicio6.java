import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int i=1;
    int potencia;
    int base;
    int calculo = 1;
    
    System.out.println("Introduzca el valor de la base: ");
    base = teclado.nextInt ();
    System.out.println("Introduzca el valor del exponente: ");
    potencia = teclado.nextInt ();

    while(i<= potencia){
      calculo = calculo * base;
     i++;
    }
    System.out.println("El resultado del calculo de la potencia es: " + calculo);
  }
}
