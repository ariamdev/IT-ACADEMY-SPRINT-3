package n3ex1CallBack;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod){
        paymentMethod.processPayment();
    }
}
