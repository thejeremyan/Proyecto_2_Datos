package tree;

import java.io.FileWriter;
import java.util.List;

/**Class dedicated for methods especialized on getters and setters**/
public class EncapsulationTree{
    private String prefix;
    private String infix;
    private FileWriter csvWriter;


    private static class SingletonHolder {
        public static EncapsulationTree encapsulationTree = new EncapsulationTree();
    }

    EncapsulationTree() {
    }

    public static EncapsulationTree getInstance() {
        return SingletonHolder.encapsulationTree;
    }

    /**Getter infix**/
    public String getInfix() {
        return infix;
    }

    /**Setter infix**/
    public void setInfix(String newinfix) {
        this.infix = newinfix;
    }
    /**Getter prefix**/
    public String getPrefix() {
        return prefix;
    }

    /**Setter prefix**/
    public void setPrefix(String newprefix) {
        this.prefix = newprefix;
    }
    public FileWriter getCsvWriter() {
        return csvWriter;
    }

    public void setCsvWriter(FileWriter csvWriter) {
        this.csvWriter = csvWriter;
    }




}
/** Invoke object: EncapsulationTree encapsulationTree =EncapsulationTree.getInstance();**/

