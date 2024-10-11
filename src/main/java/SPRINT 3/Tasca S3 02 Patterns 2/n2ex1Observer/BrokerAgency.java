package n2ex1Observer;

public class BrokerAgency implements Observer{
    private String name;

    public BrokerAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(boolean stockMovement) {
        String news = (stockMovement) ? "The stock market is growing up." : "The stock market is falling down.";
        System.out.println("Sending stock market news: " + news);
    }
}
