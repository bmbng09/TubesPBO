package com.exporthelper.model;

public class Commodity {
    private int commodityId;
    private String commodityName;
    private String exportPotential;
    private String commodityInfo;

    public Commodity(int commodityId, String commodityName, String exportPotential, String commodityInfo) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.exportPotential = exportPotential;
        this.commodityInfo = commodityInfo;
    }
}
