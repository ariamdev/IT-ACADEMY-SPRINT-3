package n3ex1CallBack;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Processing payment with PayPal...");
    }
}