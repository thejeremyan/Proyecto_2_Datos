package tree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExpressionTreeTest {
    /**Method thats constructs the expression tree**/
    public ExpressionTreeTest() {

        /** Creacion de arbol de expresion binaria usando la expresion que se transforma a forma pre fija**/
        ExpressionTree et = new ExpressionTree();
        EncapsulationTree encapsulationTree = EncapsulationTree.getInstance();
        et.buildTree(encapsulationTree.getPrefix());


        /**Print infix, prefix, and postfix forms of the equations**/
        System.out.print("\nPrefix  : ");
        et.prefix();
        System.out.print("\n\nInfix   : ");
        et.infix();
        System.out.print("\n\nPostfix : ");
        et.postfix();

        /**Result**/
        System.out.println("\n\nEvaluated Result : " + et.evaluate());

        /**Create data with the expression, result, and date and time of the users input**/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("\n Expresion: " + encapsulationTree.getInfix() + " Resultado: " + et.evaluate() + " Fecha y hora: " + dtf.format(LocalDateTime.now()));
    }

    public void method() {
    }
}
