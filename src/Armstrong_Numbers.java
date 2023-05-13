import java.util.Scanner;

public class Armstrong_Numbers {
    public static void main(String[] args) {
        /*Try to find out if a number entered is the armstrong number.
         For example, for a 4-digit number to be an Armstrong number, it must meet the following condition.
         1634 = 1^4 + 6^4 + 3^4 + 4^4 (number of 4 digits here)
         371 = 3^3 + 7^3 + 1^3 (number of 3 digits here)
         */

        Scanner src=new Scanner(System.in);
        System.out.print("Please enter a number= ");
        int number=src.nextInt();
        System.out.print("Please enter number of digit= ");
        int numberDigit=src.nextInt();

        int tnumber=number;
        int sum=0;

        do{
            int digit=tnumber%10;
            tnumber/=10;
            sum+=Math.pow(digit,numberDigit);

        }
        while(tnumber>0);

        if(number==sum) System.out.println("This is a armstrong number!");
        else System.out.println("This is not a armstrong number!");

    }
}
