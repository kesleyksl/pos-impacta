package mvc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        double peso = capturarValorDoublePositivo("Digite o peso em kg: ");

        double altura = capturarValorDoublePositivo("Digite a altura em metros: ");

        double imc = calcularIMC(peso, altura);

        System.out.println("O IMC é: " + df.format(imc) + "kg/m²" + " considerado " + classificarIMC(imc));

    }

    public static String classificarIMC(double imc) {
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

    public static double capturarValorDoublePositivo(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        do {
            System.out.print(mensagem);
            while (!scanner.hasNextDouble()) {
                System.out.println("Valor digitado não é um valor numérico positivo.");
                System.out.print(mensagem);
                scanner.next();
            }
            valor = scanner.nextDouble();
        } while (valor <= 0);

        return valor;
    }
}
