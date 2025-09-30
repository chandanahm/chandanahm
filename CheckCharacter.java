//wjp to check  the given character is upper case, lower case, digit or special character

import java.util.Scanner;

class CheckCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase letter");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } 
        else {
            System.out.println(ch + " is a special character");
        }
    }
}
