package n3ex1CallBack;

public class BankAccountPayment implements PaymentMethod{
      @Override
    public void processPayment() {
        System.out.println("Processing payment with Bank Account...");
    }
}
