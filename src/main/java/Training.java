package main.java;

public class Training {
    private TrainingType type;
    private Place place;
    private double price;
    private Client client;

    public Training(TrainingType type, Place place, double price, Client client) {
        this.type = type;
        this.place = place;
        this.price = price;
        this.client = client;
    }

    public void displayInfo() {
        System.out.println("���: " + type);
        System.out.println("�����: " + place);
        System.out.println("����: " + price);
        if (type == TrainingType.PERSONAL && client != null) {
            System.out.println("������: " + client.getName() + ", " + client.getPhone() + ", " + client.getEmail());
        }
    }

    public TrainingType getType() {
        return type;
    }

    public void setType(TrainingType type) {
        this.type = type;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
