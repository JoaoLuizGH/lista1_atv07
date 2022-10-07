import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        Scanner teclado = new Scanner(System.in);

        double lado, area, dobro;
  
        System.out.println("Informe o valor do lado do quadrado: ");
        lado = teclado.nextDouble();
  
        area =  lado * lado;

        dobro = area * 2;
  
        teclado.close();
  
        System.out.println(" O dobro da área de um quadrado com lado de: "+ lado + " metros, é igual a: " + dobro + "m²");  
    }
}
