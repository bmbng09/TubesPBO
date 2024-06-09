package com.exporthelper.model;

public class Buyer {
    private int buyerId;
    private String name;
    private String email;
    private String whatsappNumber;
    private String companyName;
    private String country;
    private String commodityImport;

    
    public Buyer(int buyerId, String name, String email, String whatsappNumber, String companyName, String country, String commodityImport) {
        this.buyerId = buyerId;
        this.name = name;
        this.email = email;
        this.whatsappNumber = whatsappNumber;
        this.companyName = companyName;
        this.country = country;
        this.commodityImport = commodityImport;
    }
}
