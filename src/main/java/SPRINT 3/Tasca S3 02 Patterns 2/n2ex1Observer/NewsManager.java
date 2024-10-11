package n2ex1Observer;

import java.util.Scanner;

public class NewsManager {

    public void marketNews() {
        Broker broker = new Broker();
        Scanner sc = new Scanner(System.in);
        int opt;

        do {
            System.out.println("Menú: \n" +
                    "1. Add Agency.\n" +
                    "2. Remove Agency\n" +
                    "3. Notify news of the stock market.\n" +
                    "4. List of agencies subscribed.\n" +
                    "0.Log out");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Write the name of the agency: ");
                    String name = sc.next();
                    broker.addAgency(new BrokerAgency(name));
                    break;
                case 2:
                    System.out.println("Write the name of the agency: ");
                    String nameAgency = sc.nextLine();
                    broker.deletAgency(nameAgency);
                    break;
                case 3:
                    System.out.println("The market is growing or falling?");
                    String answer = sc.next();
                    if (answer.equalsIgnoreCase("growing")) {
                        broker.setMarketStatus(true);
                    } else if (answer.equalsIgnoreCase("falling")) {
                        broker.setMarketStatus(false);
                    } else {
                        System.out.println("Please, write growing or falling.");
                    }
                    break;
                case 4:
                    broker.listAgencies();
                    break;
                default:
                    System.out.println("Please, choose between the options.");
            }
        }while (opt!=0);{
            System.out.println("See you soon.");
        }

    }

}
