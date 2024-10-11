package n2ex1Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Broker implements Observable{
    private boolean stockMovement;
    private List<Observer> agencies = new ArrayList<>();

     public boolean getMarketStatus(){
       return stockMovement;
     }

     public void setMarketStatus(boolean movement){
         this.stockMovement = movement;
         notifyUpdate();
     }

    @Override
    public void addAgency(Observer agency) {
        agencies.add(agency);
    }

    @Override
    public void deletAgency(String agencyName) {
        if (agencies.isEmpty()) {
            System.out.println("There's no agencies subscribed to the news.");
        } else {
            Iterator<Observer> iterator = agencies.iterator();
        while (iterator.hasNext()) {
            Observer agency = iterator.next();
            if (agency instanceof BrokerAgency && ((BrokerAgency) agency).getName().equals(agencyName)) {
                iterator.remove();
                System.out.println("Agency " + agencyName + " removed of the list.");
            }
        }
    }
    }

    @Override
    public void notifyUpdate() {
        for(Observer agency : agencies){
            agency.update(stockMovement);
        }
    }

    public void listAgencies() {
        if (agencies.isEmpty()) {
            System.out.println("There's no agencies subscribed to the news.");
        } else {
            System.out.println("Agencies subscribed:");
            for (Observer observer : agencies) {
                if (observer instanceof BrokerAgency) {
                    BrokerAgency agency = (BrokerAgency) observer;
                    System.out.println(agency.getName());
                } else {
                    System.out.println("An error ocurred: " + observer.toString());
                }
            }
        }
    }
}

