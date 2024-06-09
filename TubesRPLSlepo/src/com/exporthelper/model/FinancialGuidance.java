package com.exporthelper.model;

public class FinancialGuidance {
    private int guidanceInfoId;
    private String name;
    private String linkWeb;
    private String info;

    public FinancialGuidance(int guidanceInfoId, String name, String linkWeb, String info) {
        this.guidanceInfoId = guidanceInfoId;
        this.name = name;
        this.linkWeb = linkWeb;
        this.info = info;
    }
}
