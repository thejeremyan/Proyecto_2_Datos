package Main;

import tree.EncapsulationTree;
import tree.InfixToPreFix;

import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        EncapsulationTree encapsulationTree =EncapsulationTree.getInstance();

        /**Agregar titulos al archivo .csv**/
        FileWriter csvWriter = new FileWriter("new.csv",true);

        /**csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Role");
        csvWriter.append(",");
        csvWriter.append("Topic");
        csvWriter.append("\n");**/

        /**Encapsular el archivo .csv**/
        encapsulationTree.setCsvWriter(csvWriter);

        InfixToPreFix infixtoprefix = new InfixToPreFix();
    }

}
