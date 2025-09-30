//wjp to find smallest among 3 numbers by using if else
class Smallest3 {
    public static void main(String[] args) {
        int a = 85, b = 78, c = 56;

        int small;

        if (a < b) {
            if (a < c) {
                small = a;
            } else {
                small = c;
            }
        } else {
            if (b < c) {
                small = b;
            } else {
                small = c;
            }
        }

        System.out.println("Smallest number is: " + small);
    }
}

