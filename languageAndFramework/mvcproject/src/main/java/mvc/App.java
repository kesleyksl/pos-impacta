package mvc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("O IMC é: " + df.format(imc) + " considerado " + classificaIMC(imc));

    }

    public static String classificaIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

}
