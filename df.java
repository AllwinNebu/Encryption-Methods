package deffie;
import java.math.*;
import java.util.*;
public class df {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number (p) : ");
        BigInteger p =sc.nextBigInteger();
        System.out.println("Enter a primitive root(g) : ");
        BigInteger g =sc.nextBigInteger();
        System.out.println("Enter A's private key (it should be less than p) : ");
        BigInteger pr1=sc.nextBigInteger();
        System.out.println("Enter B's private key (it should be less than p) : ");
        BigInteger pr2 = sc.nextBigInteger();
        BigInteger pu1=g.modPow(pr1,p);
        BigInteger pu2=g.modPow(pr2,p);
        BigInteger sh1= pu2.modPow(pr1, p);
        BigInteger sh2=pu1.modPow(pr2, p);
        System.out.println("Public key of A : "+pu1);
        System.out.println("Public key of B : "+pu2);
        System.out.println("Shared key of A : "+sh1);
        System.out.println("Shared key of B : "+sh2);
        if(sh1.equals(sh2)){
            System.out.println("Shared");
        }
        sc.close();
    }
}
