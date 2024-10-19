package com.design.patterns.creational.builder;

public class Laptop {
    private String company;
    private Long price;
    private String ram;
    private String processor;

    public Laptop setCompany(String company) {
        this.company = company;
        return this;
    }

    public Laptop setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Laptop setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public Laptop setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
