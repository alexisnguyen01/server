package fr.efrei.server.domain;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    private Integer id;

    private String name;

    private Double price;

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
