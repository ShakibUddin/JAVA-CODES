//Encapsulation is data hiding(information hiding)
//Encapsulation is defined as the wrapping up of data under a single unit.
// It is the mechanism that binds together code and the data it manipulates.
//Encapsulation can be achieved by: Declaring all the variables in the class as private
// and writing public methods in the class to set and get the values of variables.

public class EncapsulatedData {
    private int amount=0;
    private double discount;//discount is 8% of amount
    private double serviceCharge;//service charge is 5% of amount
    public void getPrice(int amount){
        this.amount=amount;
        this.discount=(amount*0.08);
        this.serviceCharge=(amount*0.05);
        System.out.println("Price is "+(amount-discount+serviceCharge));
    }
}
class Customer{

    public static void main(String[] args){
        EncapsulatedData obj = new EncapsulatedData();
        obj.getPrice(100);//Price is 97

    }
}
//Advantages of Encapsulation:
//
//=>>Data Hiding: The user will have no idea about the inner implementation of the class.
// It will not be visible to the user that how the class is storing values in the variables.
//=>>Increased Flexibility: We can make the variables of the class as read-only or write-only depending on our requirement.
// Here we only want user to get price.He doesn't need to know how its calculated