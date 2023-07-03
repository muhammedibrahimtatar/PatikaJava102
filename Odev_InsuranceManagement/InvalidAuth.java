package Odev_InsuranceManagement;

public class InvalidAuth extends Throwable {

    public InvalidAuth(String msg){
        super(msg);
        System.out.println("Invalid password !");
    }
}
