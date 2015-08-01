/* Project 4: Input & Output
*
*/
package project4iomauricioguzman;
import javax.swing.JFileChooser;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 *
 * @author mauricio
 */
public class WeblogUtils {
    private String[] weblogData; //preferred way
    private String s1 = "";
    

    public void writeToFile(String targetFile) throws Exception
    {
        /* _1.c_ Create one more method to use the Arrays class sort method to sort 
        * the contents of the array and write the contents of the array to a file. 
        * The contents of the new file should look like the original input file 
        * once your program completes, but in sorted order (4 points).
        */
        java.util.Arrays.sort(weblogData); //updates private array
        
        PrintWriter output = new PrintWriter(targetFile);
        for (int b = 0; b < weblogData.length; b++) {
            output.println(weblogData[b]);
        }
        output.close();   
    }
    public void openFile() throws Exception
    {
        //_1.a_ Create a method to read each line of the web log file. (4 points)

        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            //Get the selected File
            java.io.File file =  fileChooser.getSelectedFile();
            //Create scanner for the file.
            Scanner input = new Scanner(file);
            while (input.hasNext())
            {
                s1 = s1 + input.nextLine() + "\n";
            }
            // convert /n delimited String to array. line.separator is platform
            // agnostic accepting crlf,lf
            weblogData = s1.split(System.getProperty("line.separator"));
            input.close();       
        }else {
            System.out.println("File not selected.");
        }
    }
}
