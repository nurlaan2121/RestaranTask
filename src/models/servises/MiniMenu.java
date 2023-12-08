package models.servises;

import java.util.Comparator;

public class MiniMenu {
    private String name;
    private  Long id;
    private double price;
    private int preperationTime;

    public MiniMenu() {
    }

    public MiniMenu(String name, Long id, double price, int preperationTime) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.preperationTime = preperationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPreperationTime() {
        return preperationTime;
    }

    public void setPreperationTime(int preperationTime) {
        this.preperationTime = preperationTime;
    }

    @Override
    public String toString() {
        return "models.servises.MiniMenu{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", preperationTime=" + preperationTime +
                '}';
    }

}
