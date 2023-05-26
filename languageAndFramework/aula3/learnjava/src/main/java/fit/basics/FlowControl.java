package fit.basics;

public class FlowControl {
    public static void exec() {
        boolean valTrue = true;
        int num = 10;
        final String monday = "segunda";
        if (valTrue) {
            switch (num) {
                case (2):
                    System.out.println("Valor é dois");
                    break;
                case (10):
                    System.out.println("Valor 10");
                default:
                    System.out.println("outra opção");
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
}
