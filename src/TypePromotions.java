public class TypePromotions {
    public static void main(String[] args){
        //Type promotion is done while doing method overloading in Java.
        // When the datatype is not the same then we promote one datatype to another datatype.
        // We cannot de-promote one datatype to another datatype.
        int i=200;
        float f= 1.20f;
        char c='b';
        double result1 = (i*2);
        double result2 = (f+i);
        double result3 = (i/c);
        //byte can be promoted to <byte - short - int - long - float - double>.
        //short can be promoted to <short - int - long - float - double>.
        //int can be promoted to <int - long - float - double>.
        //long can be promoted to <long - float - double>.
        //char can be promoted to <char - int - long - float - double>.
        //float can be promoted to <float - double>.
        System.out.println("Result1 is "+result1);
        System.out.println("Result2 is "+result2);
        System.out.println("Result3 is "+result3);
        System.out.println("Result after all type promotions is "+(result1+result2+result3));
    }
}
