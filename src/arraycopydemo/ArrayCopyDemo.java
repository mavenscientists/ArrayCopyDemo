package arraycopydemo;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 22, 2013 10:03:06 AM 
 */
class ArrayCopyDemo
{     
    public static void main(String[] args)
    {
        char[] copyFrom = { 'a', 'w', 'm', 'a', 'v', 'e', 'n', 'i', 'n', 'a', };
        char[] copyTo = new char[5];    // empty character array
        String string1;                         
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 5);

        string1 = new String(copyTo);
        System.out.println(string1);
    }
} 