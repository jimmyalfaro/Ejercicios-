import java.util.Scanner;
class Main {
  public static void main(String[] args) {
byte opcion= 0;
    Scanner lectura = new Scanner(System.in);
    do {
    System.out.println("1. Mostrar 100 númeroscon un bucle for");
      System.out.println("2. Mostrar 100 númeroscon un bucle while");
      System.out.println("3. Introduce un número. ¿Es mayor que");
      System.out.println("3. Introduce un número: ");

      opcion = lectura.nextByte();

} while (opcion<1 || opcion>3);
        
switch (opcion){
  case 1: 
      System.out.println(" Opción 1 ejecutada ");
    break;

    case 2: 
      System.out.println(" Opción 2 ejecutada ");
    break;
    
    case 3: 
      System.out.println(" Opción 3 ejecutada ");
    break;
}
  }
}
