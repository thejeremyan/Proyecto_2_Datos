package tree;



import Main.Main1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ExpressionTreeTest {
    /**Method thats constructs the expression tree**/
    public ExpressionTreeTest() throws IOException {

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
        //System.out.println("\n Expresion: " + encapsulationTree.getInfix() + " Resultado: " + et.evaluate() + " Fecha y hora: " + dtf.format(LocalDateTime.now()));


        /**Traer de vuelta al .CSV e ingresar los datos del cliente**/
        encapsulationTree.getCsvWriter().append("Expresion: " + encapsulationTree.getInfix());
        encapsulationTree.getCsvWriter().append(",");
        encapsulationTree.getCsvWriter().append(" Resultado: " + et.evaluate());
        encapsulationTree.getCsvWriter().append(",");
        encapsulationTree.getCsvWriter().append(" Fecha y hora: " + dtf.format(LocalDateTime.now()));
        encapsulationTree.getCsvWriter().append("\n");
        encapsulationTree.getCsvWriter().flush();
        encapsulationTree.getCsvWriter().close();
        //Main1 main = new Main1();

        /**55-61 imprime el archivo .csv en la pantalla**/
        Scanner sc = new Scanner(new File("C:\\Users\\febel\\OneDrive - Estudiantes ITCR\\TEC\\II Semestre\\Datos 1\\Proyecto_2_Datos\\new.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner


    }


    public void method() {
    }
}
