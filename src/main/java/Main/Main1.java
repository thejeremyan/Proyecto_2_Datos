package Main;

import tree.EncapsulationTree;
import tree.InfixToPreFix;

import java.io.FileWriter;
import java.io.IOException;

public class Main1 {

    public Main1() throws IOException {
        EncapsulationTree encapsulationTree =EncapsulationTree.getInstance();

        /**Agregar titulos al archivo .csv**/
        FileWriter csvWriter = new FileWriter("new.csv",true);



        /**Encapsular el archivo .csv**/
        encapsulationTree.setCsvWriter(csvWriter);

        InfixToPreFix infixtoprefix = new InfixToPreFix();
    }
}
