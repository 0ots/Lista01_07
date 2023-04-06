import java.util.Scanner;

import java.lang.Math;

public class Exercicio_7 {

    public static void main(String[] args) throws Exception {

        double lado, area, dobroarea;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");

        lado = input.nextDouble();

        input.close();

        area = Math.pow(lado, 2);

        dobroarea = area * 2;

        System.out.print("O dobro da área é: " + dobroarea);

    }
    
}
