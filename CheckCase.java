//wjp to check the given character is upper case or lower case
import java.util.Scanner;

class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an UPPERCASE letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a LOWERCASE letter.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
