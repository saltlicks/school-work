/*
 * Project 4: Input & Output
 * Assignemnt Description: ${project}/requirements/reqs.txt
*/
package project4iomauricioguzman;
import javax.swing.JOptionPane;
/**
 *
 * @author mauricio
 */
public class Project4IOMauricioGuzman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* In the primary class for your package, create a main method that 
         * calls all of your methods (4 points).
         */
        String filepath = "./weblog.txt";
        WeblogUtils go = new WeblogUtils();
        go.readWeblogFile(filepath);
    }
    
}
