package secondModule;

import java.nio.ByteBuffer;

public class basicThings
{
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return !(a^b^c^d) && !(a&b&c&d) && (a|b|c|d);
    }

    public static int leapYearCount(int year)
    {
        int leapYear = 0;

        for(int i = 1; i <= year; i++)
        {
            if (i % 4 == 0 & !(i % 100 == 0)) {
                leapYear++;
            } else {
                if (i % 400 == 0) {
                    leapYear++;
                }

            }
        }
        return leapYear;
    }

    public static boolean doubleExpression(double a, double b, double c) {
         double epsilon = 0.0001;

        boolean isEqual = Math.abs((a + b) - c) < Math.abs(epsilon);

        return isEqual;
    }

    public static char charExpression(int a) {
        return (char)('\\' + a) ;
    }

    public static boolean isPowerOfTwo(int value)
    {

        boolean isPowerOfTwo = false;

        if(Integer.bitCount(Math.abs(value)) == 1)
        {
            isPowerOfTwo = true;
        }

        return isPowerOfTwo;
    }

    public static boolean isPalindrome(String text)
    {
        String changedWord = text.replaceAll("[^a-zA-Z0-9]","");
        changedWord = changedWord.toLowerCase();

        if(changedWord.equals(new StringBuffer(changedWord).reverse().toString()))
        {
            return true;
        }
        else
        {
            return false;
        }


    }
}
