package com.albert.kitchapi.Item;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "item_name", nullable = false)
    private String name;

    @Column(name = "measurement")
    private String measurement;

    @Column(name = "quantity")
    private float quantity;

    public Item(){}

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

    public String getMeasurement(){
        return measurement;
    }

    public float getQuantity() {
        return quantity;
    }
}
