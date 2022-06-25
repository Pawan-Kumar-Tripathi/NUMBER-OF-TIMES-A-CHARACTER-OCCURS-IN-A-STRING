import java.io.*;
import java.util.*;
class repwithoccr
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plxz enter the string ");
        String str = sc.nextLine();
        System.out.println("plxz enter the string you want to find the ooccurance of" );
        char ch = sc.next().charAt(0);
        
        
        
        
        int COUNT = 1,i;
        for( i=0; i<str.length();i++)
        {
            char chr = str.charAt(i);
            
            if ( chr == ch)
            {
                str = str.replaceFirst(String.valueOf(ch),String.valueOf(COUNT));
            }
        }
        System.out.println(str);
    }
}
        