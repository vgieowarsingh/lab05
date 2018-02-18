import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);  //  First get the number to convert
        String hexNum;
        int c,                                  //  To act as counter for loop
            exp = 0;                            //  Acts as incremented exponent as go from R to L in hex num
        long decimal = 0;                       //  To hold decimal representation of hex number inputted
        char temp;                              //  Temporarily holds the characters in user's input string
        boolean ignore = false;                 //  If this is true, then user has input 0x in beginning, and
                                                //  you ignore it.

        System.out.print("Enter a hexadecimal");
        System.out.print(" number: ");
        hexNum = scnr.next();
        c = hexNum.length() - 1;                //  So you can start from rightmost value of inputted hex number

        while (c >= 0) {
            temp = hexNum.charAt(c);
            if (c == 1) {                       //  If user entered 0x, then x would be at this position.
                if (temp == 'x') {
                    ignore = true;
                }
            }
            if (!ignore) {
                if (Character.isDigit(temp)) {
                    if (temp == '0') {
                        decimal += (0 * Math.pow(16, exp));
                    }
                    if (temp == '1') {
                        decimal += (1 * Math.pow(16, exp));
                    }
                    if (temp == '2') {
                        decimal += (2 * Math.pow(16, exp));
                    }
                    if (temp == '3') {
                        decimal += (3 * Math.pow(16, exp));
                    }
                    if (temp == '4') {
                        decimal += (4 * Math.pow(16, exp));
                    }
                    if (temp == '5') {
                        decimal += (5 * Math.pow(16, exp));
                    }
                    if (temp == '6') {
                        decimal += (6 * Math.pow(16, exp));
                    }
                    if (temp == '7') {
                        decimal += (7 * Math.pow(16, exp));
                    }
                    if (temp == '8') {
                        decimal += (8 * Math.pow(16, exp));
                    }
                    if (temp == '9') {
                        decimal += (9 * Math.pow(16, exp));
                    }
                }
                else if (Character.isLetter(temp)) {
                    if (Character.toUpperCase(temp) == 'A') {
                        decimal += (10 * Math.pow(16, exp));
                    }
                    if (Character.toUpperCase(temp) == 'B') {
                        decimal += (11 * Math.pow(16, exp));
                    }
                    if (Character.toUpperCase(temp) == 'C') {
                        decimal += (12 * Math.pow(16, exp));
                    }
                    if (Character.toUpperCase(temp) == 'D') {
                        decimal += (13 * Math.pow(16, exp));
                    }
                    if (Character.toUpperCase(temp) == 'E') {
                        decimal += (14 * Math.pow(16, exp));
                    }
                    if (Character.toUpperCase(temp) == 'F') {
                        decimal += (15 * Math.pow(16, exp));
                    }
                }
            }
            exp++;
            c--;
        }
        System.out.print("Your number is " + decimal + " in decimal");
    }
}
