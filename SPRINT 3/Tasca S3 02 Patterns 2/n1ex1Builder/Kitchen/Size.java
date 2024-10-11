package n1ex1Builder.Kitchen;

public enum Size {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private String size;

    Size(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
