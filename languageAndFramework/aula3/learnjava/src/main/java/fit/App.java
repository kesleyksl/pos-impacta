package fit;

import fit.basics.FlowControl;
import fit.basics.Operators;
import fit.basics.Variables;
import fit.collections.Collections;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Variables.exec();
        Operators.exec();
        FlowControl.exec();
        Collections.exec();
    }
}
