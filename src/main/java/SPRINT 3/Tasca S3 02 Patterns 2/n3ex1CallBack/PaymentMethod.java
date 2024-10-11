package n3ex1CallBack;

import java.util.Optional;

public interface PaymentMethod {

    public default void issuePayment(Callback callback) {
        processPayment();
        Optional.ofNullable(callback).ifPresent(Callback::paymentComplete);
    }

    void processPayment();
}
