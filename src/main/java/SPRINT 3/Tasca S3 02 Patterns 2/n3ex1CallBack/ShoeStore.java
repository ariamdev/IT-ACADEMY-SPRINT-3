package n3ex1CallBack;

import java.util.Scanner;

public class ShoeStore {

    public void sellShoes(){
        Scanner sc = new Scanner(System.in);
        int opt;
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod bankAccount = new BankAccountPayment();

        System.out.println("Welcome to Shoe Store.\n" +
                "Do you want to buy this shoes? (yes/no)");
        String answer = sc.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Select payment method: \n" +
                    "1.Bank Account\n" +
                    "2.Creadit Card\n" +
                    "3.Paypal");
            opt = sc.nextInt();
            switch (opt){
                case 1:
                    makePurchase(bankAccount);
                    break;
                case 2:makePurchase(creditCard);
                    break;
                case 3:makePurchase(paypal);
                    break;
            }
        }else if(answer.equalsIgnoreCase("no")) {
            System.out.println("Hope you have a great day.");
        }else {
            System.out.println("Sorry I didn't understand you.");
        }


    }

    public void makePurchase(PaymentMethod paymentMethod){
        PaymentGateway gateway = new PaymentGateway();
        gateway.processPayment(paymentMethod);
        System.out.println("Purchase successfully completed.");
    }
}
