package firstModule;

import java.awt.*;
import java.lang.reflect.Field;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class warmUp
{
    public static void fizzBuzz(int i)
    {
        if(i % 3 == 0 && i % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else
        {
            if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                if(i % 3 == 0 )
                {
                    System.out.println("Fizz");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }

    public static void polyndrom(String s)
    {
        String changedWord = s.replaceAll("\\W","");
        changedWord = changedWord.toLowerCase();

        if(changedWord.equals(new StringBuffer(changedWord).reverse().toString()))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }

    public static void printFibonacci(long n)
    {
        long a0 = 0;

        long a1 = 1;

        long res = 0;

        if(n == 0)
        {
            res = 0;
        }
        else
        {
            if(n == 1)
            {
                res = 1;
            }
            else
            {
                for(int i = 2; i <= n; i++)
                {
                    res = a0 + a1;

                    a0 = a1;

                    a1 = res;
                }
            }
        }

        System.out.println(res);
    }

    public static void calculateAndPrint(int n)
    {
        if(((n / 100) % 10) % 2 == 0)
        {
            System.out.println(n + 100);
        }
        else
        {
            System.out.println(n * 2);
        }
    }

    public static void checkSortArrayLength(int[] array)
    {
        int temp = 1;

        int maxSubLength = 1;

        for(int i = 0; i < array.length - 1; i++ )
        {
            if(array[i] <= array[i + 1])
            {
                temp ++;
            }
            else
            {
                temp = 1;
            }
            if(temp >= maxSubLength)
            {
                maxSubLength = temp;
            }
        }
        System.out.println(maxSubLength);
    }

    public static void checkFruitCount(Object[] objects)
    {
        int appleCount = 0;

        int bananaCount = 0;

        for(int i = 0; i < objects.length; i++)
        {
            if(objects[i] instanceof Apple)
            {
                appleCount++;
            }

            if(objects[i] instanceof Banana)
            {
                bananaCount++;
            }
        }

        System.out.println("banana=" + bananaCount + ", apple=" + appleCount);
    }

    public static int reverse(int n)
    {

        // enter your code

        String nString = Integer.toString(n);

        String res = new StringBuffer(nString).reverse().toString();

        return Integer.valueOf(res);
    }

    public static <T> void printAllClassFields(Class<T> aClass) {

        Field[] fs = aClass.getDeclaredFields();
        String[] fields = new String[fs.length];
        for(int i = 0; i < fs.length; i++)
        {
            fields[i] = fs[i].getName();
        }

        Arrays.sort(fields);

        for (int i = 0; i < fields.length; i++)
        {
            System.out.println(fields[i]);
        }
    }

    public static Node1 merge(Node1 head1, Node1 head2)
    {
        if(head1 == null){
            return head2;
        }else if(head2 == null){
            return head1;
        }
        Node1 mHead = null;
        if(head1.getData() < head2.getData()){
            mHead = head1;
            mHead.setNext(merge(head1.getNext(), head2));
        }else{
            mHead = head2;
            head2.setNext(merge(head1, head2.getNext()));
        }
        return mHead;
    }

    public static int treeDepth(Node root) {
        // enter your code
        if (root == null)
        {
            return 0;
        }
        int nLeft = treeDepth(root.getLeft());
        int nRight = treeDepth(root.getRight());

        return (nLeft > nRight) ? (nLeft + 1) : (nRight + 1);


    }

    public static int treeLeafCount(Node root) {
        // enter your code

        if (root == null) return 0;
        if (root.getLeft() == null && root.getRight() == null)
        {
            return 1;
        }
        else {
            return treeLeafCount(root.getLeft()) + treeLeafCount(root.getRight());
        }


    }

    public static void findAllUrl(String text) {
        // enter your code
        ArrayList<String> list = new ArrayList<String>();

        String regex
                =  "(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)"
                + "(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*"
                + "[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)";

        // Compile the Regular Expression
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);


        Matcher m = p.matcher(text);


        while (m.find()) {

            list.add(text.substring(m.start(0), m.end(0)).trim());
        }


        if (list.size() == 0) {
            System.out.println("-1");
            return;
        }


        for (String url : list) {
            System.out.println(url);
        }
    }

    public static Box<Integer> boxingValue(double value) {

        Box rawBox = new Box<>(value);


        // enter your code
        return rawBox;

    }









}
