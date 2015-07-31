/* Project 4: Input & Output
*
*/
package project4iomauricioguzman;
import javax.swing.JOptionPane;
/**
 *
 * @author mauricio
 */
public class WeblogUtils {
    String[] weblogData; //preferred way
    
    public void readWeblogFile(String fileLocation)
    {
        /* _1.a_ Create a method to read each line of the web log file. (4 points)
         *
         * _1.b_ Each line should then be stored in a private array created in the 
         * class, such that the first element of the array is the first line of 
         * the web log file. Because each element will hold an entire line from 
         * the file, the array should be declared as an array of strings (4 points).
         */
        //TODO: Read file from file path
        //TODO: Store on private array
        
    }
    public void sortWeblogData()
    {
       /* _1.c_ Create one more method to use the Arrays class sort method to sort 
        * the contents of the array and write the contents of the array to a file. 
        * The contents of the new file should look like the original input file 
        * once your program completes, but in sorted order (4 points).
        */
        java.util.Arrays.sort(weblogData);
        
    }
    public void writeArrayData()
    {
 
        String output = java.util.Arrays.toString(weblogData);
        //JOptionPane.showMessageDialog(null, output); replace with write to file
    }
    public void writeDarrayData()
    {
        String output = java.util.Arrays.toString(weblogData);
        JOptionPane.showMessageDialog(null, output); 
    }
}
