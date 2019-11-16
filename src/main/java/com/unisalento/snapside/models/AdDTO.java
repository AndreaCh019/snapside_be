package com.unisalento.snapside.models;

import java.sql.Timestamp;

public class AdDTO {
    private int idAd;
    private String title;
    private String description;
    private Double sellPrice;
    private String address;
    private String coordinates;
    private Integer approved;
    private Byte active;
    private Timestamp beginDate;
    private Timestamp endDate;
    private String adType;
    private int user_id_seller;

    public byte[] getFiles() {
        return files;
    }

    public void setFiles(byte[] files) {
        this.files = files;
    }

    private int item_id_item;
    private byte[] files;

    public int getIdAd() {
        return idAd;
    }

    public void setIdAd(int idAd) {
        this.idAd = idAd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public Timestamp getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Timestamp beginDate) {
        this.beginDate = beginDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public int getUser_id_seller() {
        return user_id_seller;
    }

    public void setUser_id_seller(int user_id_seller) {
        this.user_id_seller = user_id_seller;
    }

    public int getItem_id_item() {
        return item_id_item;
    }

    public void setItem_id_item(int item_id_item) {
        this.item_id_item = item_id_item;
    }
}
