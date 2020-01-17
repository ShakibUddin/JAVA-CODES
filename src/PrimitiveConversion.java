public class PrimitiveConversion {
    public static void main(String[] args)
    {
        System.out.print("Y" + "O");
        System.out.print('L' + 'O');
        //At first glance, we expect “YOLO” to be printed.
        //
        //Actual Output:
        //“YO155”.
        //When we use double quotes, the text is treated as a string and “YO” is printed, but when we use single quotes,
        // the characters ‘L’ and ‘O’ are converted to int. This is called widening primitive conversion.
        // After conversion to integer,
        // the numbers are added ( ‘L’ is 76 and ‘O’ is 79) and 155 is printed.
        System.out.println();

        System.out.print("Y" + "O");
        System.out.print('L');
        System.out.print('O');

        //Output: YOLO
        //
        //Explanation: This will now print “YOLO” instead of “YO7679”.
        // It is because the widening primitive conversion happens only when a operator like ‘+’ is present
        // which expects at least integer on both side.
    }
}
