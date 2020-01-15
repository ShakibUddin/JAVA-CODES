import java.util.Scanner;
public class StrBufAppendCodePoint {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //The main difference between String and StringBuffer is String is immutable
        // while StringBuffer is mutable means you can modify a StringBuffer object once you created it
        // without creating any new object.
        System.out.println("Enter a string\n");
        String line = sc.nextLine();
        StringBuffer sbf = new StringBuffer(line);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
        sbf.appendCodePoint(num);
        System.out.println("String buffer after appending "+num+" is "+sbf);
        //OUTPUT :
        //Enter a string
        //
        //sakib
        //Enter a number
        //
        //66
        //String buffer after appending 66 is sakibB
        //The 'B' after sakib is because of the num 66...
        //Because 66 is the ASCII value for 'B'
    }
}
