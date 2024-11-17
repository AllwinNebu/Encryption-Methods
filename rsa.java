package RSA;
import java.lang.Math;
import java.util.*;
public class rsa 
{
    public static double gcd(double e, double phi)
    {
        double temp;
        while(true)
        {
            temp=e%phi;
            if(temp==0)
            {
                return phi;
            }
            e=phi;
            phi=temp;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two prime number : ");
        double p =sc.nextDouble();
        double q =sc.nextDouble();
        double n =p*q;
        double e =2,k=2;
        double phi =(p-1)*(q-1);
        while(p<phi)
        {
            if(gcd(e,phi)==1)
            {
                break;
            }
            else
            {
                e++;
            }
        }
        double d=(1+(k*phi))/e;
        System.out.println("Enter the number : ");
        double num = sc.nextDouble();
        double c=Math.pow(num,e)%n;
        System.out.println("Encrypted message : "+c);
        double m =Math.pow(c,d)%n;
        System.out.println("Decrypted message : "+m);
        sc.close();
    }
}
