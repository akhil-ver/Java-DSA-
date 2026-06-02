package DSA;
import java.util.Scanner;
public class DecimalToBinary {


    public static String DecimalToBinary1 (int decimal){
        StringBuilder s = new StringBuilder();
        if (decimal == 0) {
        return "0";
    }

        while(decimal > 0){
            int rem = decimal%2;
            decimal /=2;
            s.append(rem);
        }

        s.reverse();
        return s.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();


        String binary = DecimalToBinary1 (decimal) ;
        System.out.println(Integer.parseInt(binary)+1);

        sc.close();
;
    }
}
