package DSA;
import java.util.Scanner;
public class binaryToDecimal {
    public static int binaryToDecimal1(String binary){
        int decimal = 0;
        int power =1;

        int bin = Integer.parseInt(binary);

        while(bin > 0){
            int rem = bin%10;
            decimal = decimal+power*rem;
            power *=2;
            bin /=10;
        }

        return decimal;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal =  binaryToDecimal1(binary);

        System.out.println(decimal);
        sc.close();

    }
}
