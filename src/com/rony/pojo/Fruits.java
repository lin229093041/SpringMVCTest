package com.rony.pojo;

import com.rony.controller.ValidationB;
import com.rony.controller.VallidationA;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class Fruits {
//    校验name的长度是否为5~10之间
//    @Size(min = 5,max = 10,message = "{fruits.name.length.error}")
    @Size(min = 3,max = 10,message = "{fruits.name.length.error}" ,groups = {VallidationA.class})
    private String name;
    private double price;
    @NotEmpty(message = "{fruits.produce.area.isEmpty}",groups = {ValidationB.class})
    private String producing_area;

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", producing_area='" + producing_area + '\'' +
                '}';
    }

    public Fruits() {
    }

    public Fruits(String name, double price, String producing_area) {
        this.name = name;
        this.price = price;
        this.producing_area = producing_area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducing_area() {
        return producing_area;
    }

    public void setProducing_area(String producing_area) {
        this.producing_area = producing_area;
    }
}

