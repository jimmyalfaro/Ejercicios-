import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
   Scanner objetoNum = new Scanner (System.in);
    int valinicial, valfinal;
    
    valinicial=8;
    System.out.println ("Multiplos de 8 hasta 500");

    while(valinicial<=500)
      {
        System.out.print (valinicial + ",");
        valinicial = valinicial+8;
      }
  }
}
