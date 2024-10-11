package n2ex1Observer;

public interface Observable {

    void addAgency(Observer observer);
    void deletAgency(String agencyName);
    void notifyUpdate();
}
