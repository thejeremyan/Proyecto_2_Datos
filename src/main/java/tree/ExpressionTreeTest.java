package tree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * class ExpressionTreeTest
 **/
public class ExpressionTreeTest {
    public ExpressionTreeTest() {
        //Scanner scan = new Scanner(System.in);
        // System.out.println("Expression Tree Test");

        /** Creacion de arbol de expresion binaria **/
        ExpressionTree et = new ExpressionTree();

        //System.out.println("\nEnter equation in prefix form");
        //et.buildTree(scan.next());
        EncapsulationTree encapsulationTree = EncapsulationTree.getInstance();
        et.buildTree(encapsulationTree.getPrefix());

        System.out.print("\nPrefix  : ");
        et.prefix();
        System.out.print("\n\nInfix   : ");
        et.infix();
        System.out.print("\n\nPostfix : ");
        et.postfix();
        System.out.println("\n\nEvaluated Result : " + et.evaluate());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


        System.out.println("Expresion: " + encapsulationTree.getInfix() + " Resultado: " + et.evaluate() + " Fecha y hora: " + dtf.format(LocalDateTime.now()));
    }

    public void method() {
    }
}
