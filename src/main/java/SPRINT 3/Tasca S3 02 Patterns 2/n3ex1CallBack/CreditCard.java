package n3ex1CallBack;

public class CreditCard implements PaymentMethod{

    @Override
    public void processPayment() {
        System.out.println("Processing payment with credit card...");
    }
}
