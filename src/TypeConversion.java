public class TypeConversion {
    public static void main(String[] args){
        //widening or automatic conversion
        short num=100;
        int inum=num;
        long lnum=num;
        float fnum=num;
        double dnum=num;
        //When you assign value of one data type to another,
        // the two types might not be compatible with each other.
        // If the data types are compatible,
        // then Java will perform the conversion automatically known as Automatic Type Conversion and
        // if not then they need to be casted or converted explicitly.
        //this happens only when
        //The two data types are compatible.
        //When we assign value of a smaller data type to a bigger data type.(byte<short<int<long<float<double)
        //For Example, in java the numeric data types are compatible with each other
        // but no automatic conversion is supported from numeric type to char or boolean.
        // Also, char and boolean are not compatible with each other.
        System.out.println("num is "+num);
        System.out.println("inum is "+inum);
        System.out.println("lnum is "+lnum);
        System.out.println("fnum is "+fnum);
        System.out.println("dnum is "+dnum);

        //Narrowing or Explicit conversion
        dnum=323.142;
        byte bnum=(byte)dnum;//converting bigger data type o smaller data type
        //so explicit conversion is needed
        System.out.println("dnum converted to bnum(byte) is "+bnum);

    }
}
