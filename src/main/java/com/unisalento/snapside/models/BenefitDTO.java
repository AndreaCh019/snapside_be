package com.unisalento.snapside.models;

import java.sql.Timestamp;

public class BenefitDTO {
    private int idBenefit;
    private Timestamp checkinDate;
    private Timestamp checkoutDate;
    private Byte interested;
    private String paymentType;
    private Double paidAmount;
    private Byte paid;
    private int user_id_user;
    private int ad_id_ad;

    public int getIdBenefit() {
        return idBenefit;
    }

    public void setIdBenefit(int idBenefit) {
        this.idBenefit = idBenefit;
    }

    public Timestamp getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Timestamp checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Timestamp getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Timestamp checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Byte getInterested() {
        return interested;
    }

    public void setInterested(Byte interested) {
        this.interested = interested;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Byte getPaid() {
        return paid;
    }

    public void setPaid(Byte paid) {
        this.paid = paid;
    }

    public int getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(int user_id_user) {
        this.user_id_user = user_id_user;
    }

    public int getAd_id_ad() {
        return ad_id_ad;
    }

    public void setAd_id_ad(int ad_id_ad) {
        this.ad_id_ad = ad_id_ad;
    }
}
