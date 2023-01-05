package Lesson9;

public class Cafe {
    private String name;
    private String address;
    private int quantitySeats;

    public Cafe(String name, String address, int quantitySeats) {
        this.name = name;
        this.address = address;
        this.quantitySeats = quantitySeats;
    }

    public Cafe() {
    }

    @Override
    public String toString() {
        return "\n" + "Cafe{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", quantitySeats=" + quantitySeats +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getQuantitySeats() {
        return quantitySeats;
    }

    public void setQuantitySeats(int quantitySeats) {
        this.quantitySeats = quantitySeats;
    }
}
