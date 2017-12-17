public class Strings
{
    boolean t=false;
    public void trytofind(String a,String find )
    {
        char[] Mass = a.toCharArray();
        char[] Find = find.toCharArray();
        int i=0,j;
        boolean temp;
        while ((!t)&&(i<Mass.length))
        {
            temp=true;
            j=0;

            while ((temp)&&(j<Find.length))
            {
            temp=Mass[i]==Find[j];
            i++;
            j++;
            }
            if (temp) t =true;
        }
    }
    public void textchange(String a)
    {
        char [] Mass = a.toCharArray();
        int temp=1;
        if (Mass.length%2==0) temp++;
        int i=0;
        while (i<Mass.length)
        {
            System.out.print(Mass[i]);
            i=i+temp;

        }
        System.out.println();
    }
}
