package com.example.gymdemo.data;


import jakarta.persistence.*;

@Entity
@Table(name = "gym")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String packagename;
    @Column(name = "price")
    private double price;
    @Column(name = "time")
    private int time;

    public void setId(int id) {
        this.id = id;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getPackagename() {
        return packagename;
    }

    public double getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }
}
