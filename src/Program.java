import java.io.*;
import java.util.Scanner;
public class Program
{    public static void main(String[] args)
    {   Strings r = new Strings();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        try
        {
            FileInputStream fstream = new FileInputStream("C:/string/a.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
                r.trytofind(strLine,s);
                r.textchange(strLine);
            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка");
        }

     if (r.t) System.out.println("Yes");
     else System.out.println("No");
    }
}