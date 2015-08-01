/*
 * Project 4: Input & Output
 * Assignemnt Description: requirements/reqs.txt
*/
package project4iomauricioguzman;

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
        
        WeblogUtils go = new WeblogUtils();
        try 
        {
            go.openFile(); //_1.a_ Create a method to read each line of the web log file. (4 points)
            go.writeToFile("sortedWeblog.txt"); /*_1.c_ Create one more method to use the Arrays class sort method to sort 
        the contents of the array and write the contents of the array to a file. 
        The contents of the new file should look like the original input file 
        once your program completes, but in sorted order (4 points).*/
      
            
        }catch(Exception Ex)
        {
            System.out.println(Ex);
        }
        
    }
    
}
