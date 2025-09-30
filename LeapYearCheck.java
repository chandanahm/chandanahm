// WJP to check the year is leap year or not


class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024; // change the year here

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } 
        else if (year % 100 == 0) {
            System.out.println(year + " is Not a Leap Year");
        } 
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } 
        else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}
