package com.albert.kitchapi.Item;

import com.albert.kitchapi.User.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "item_name", nullable = false)
    private String name;

    @Column(name = "measurement")
    private String measurement;

    @Column(name = "quantity")
    private float quantity;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Item(){}

    public Item(String name, String measurement, float quantity, User user){
        this.name = name;
        this.measurement = measurement;
        this.quantity = quantity;
        this.user = user;
    }

    public Item(String name, String measurement, float quantity){
        this.name = name;
        this.measurement = measurement;
        this.quantity = quantity;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurement(){
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
