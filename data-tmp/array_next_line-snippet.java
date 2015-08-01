
// Reading a file to a string until EoF
while(input.hasNext())
    {
        String s1 = input.nextLine();
        String s2 = s1.replaceAll(oldStr, newStr);
        output.println(s2);
    }
// Loop an array until the end of its size
for (int i =0; i < stats.legth; i++)
{
    total = total + stats[i];
    output = output + stats[i] + "\n";
}
// convert array to string and display
public void quickDisplayScores()
{
    String output = java.util.Arrays.toString(stats);
    JOptionPane.ShowMessageDialog(null, output);
}

// Check palindrome char by char from end to end for simmetry

class myclass 
{
    pivate String pal;
    public boolean checkPalindrome()
    {
        int low = 0;
        int high = pal.length() -1;
        while (low < high)
        {
            if (pal.charAt(low) != ppal.charAt(high))
                return false;
            low++;
            high--;
        }
    }
