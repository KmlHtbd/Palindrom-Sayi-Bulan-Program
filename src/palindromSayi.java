import java.util.Scanner;
public class palindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber=0, lastNumber;
        while (temp !=0 ){
            lastNumber = temp%10;
            reverseNumber = reverseNumber*10 + lastNumber;
            temp /= 10;
            }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        if (isPalindrom(number)==true){
            System.out.print(number+" Palindrom bir sayıdır.");
        }else {
            System.out.print(number+" Palindrom bir sayı değildir.");
        }
    }
}