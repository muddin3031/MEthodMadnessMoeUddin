package MUddin;

public class MuddinLib {
    public static String fooBarBaz(int num1) {
        String output = "";
        int x = 1;
        while (x <= num1)                                   //This is to check incrementally the number between num1 and ) are multiples of 5 or 3
        //  I put if alse statements to make it check at each value since x increments by 1
        {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                output = output + "," + "baz";

            } else if (x % 3 == 0) {
                output = output + "," + "foo";
            } else if (x % 5 == 0) {
                output = output + "," + "bar";

            } else {
                output = output + "," + x;
            }

            x++;
        }
        String output3 = output.substring(1, output.length());            // I put this here to take out the "," at the beginning of the string"
        return output3;

    }

    public static boolean isPalindrome(String input) {
        String output1 = "";

        int x = 0;
        int y = input.length();
        while (input.length() > x) {
            String s2 = input.substring(y - 1, y);           //This puts the letters from the end of the word in a variable and then compares them to a letter in the beginning
            String s1 = input.substring(x, x + 1);         // of the word
            if (!s1.equals(s2)) {
                return false;             // If the letter from the beginning and end of the word  don't match it will return automatically return false
            }
            x++;
            y--;


        }
        return true;
    }

    public static String dateSTR(String date) {
        String output;
        output = date.substring(3, 5) + "-" + date.substring(0, 2) + "-" + date.substring(6, 10);      // t simplify the program I merely just rearranged the date by using  substrings
        return output;
    }

    public static int sumUpTo(int num) {
        int output = 0;
        int x = 1;
        while (x <= num)                         // This while loop adds x which gets bigger by 1 every time and then adds it to output
        {                                     // It stops when the number is not equal to or less than it. If it were less than then it wouldn't add the input number, num
            output = output + x;
            x++;
        }
        return output;
    }

    public static boolean isFibonacci(int num) {

        int output = 1;
        int i = 0;
        int temp = 0;
        while (output < num) {
            temp = output;                // This temporarily puts in the previous output variable and saves so when the next iteration comes it can add it,
            // which then creates the next number in the fibonacci sequence
            output = output + i;
            i = temp;

        }
        if (output != num)                 // Once the while loop is done the output is eiher gonna be bigger than num or equal to causing it to stop. So i put an if else statement
        {

            return false;
        }

        return true;
    }
}
