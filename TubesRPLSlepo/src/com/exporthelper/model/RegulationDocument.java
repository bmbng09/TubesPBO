package com.exporthelper.model;

public class RegulationDocument {
    private int documentId;
    private String documentName;
    private String countryName;
    private String documentDetail;

    public RegulationDocument(int documentId, String documentName, String countryName, String documentDetail) {
        this.documentId = documentId;
        this.documentName = documentName;
        this.countryName = countryName;
        this.documentDetail = documentDetail;
    }
   
}
