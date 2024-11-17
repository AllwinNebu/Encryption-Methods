package hash;
import java.util.*;
public class haash 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text  : ");
        String message = sc.nextLine();
        int length = message.length();
        int res=0;
        for(int i=0;i<length;i++)
        {
            char c = (char)(message.charAt(i)^0);
            res=res+c;
        }
        System.out.printf("After xor : %x",res);
        sc.close();
    }
}
