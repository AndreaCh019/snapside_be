package com.unisalento.snapside.generated.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "benefit", schema = "snapside", catalog = "")
public class BenefitEntity {
    private int idBenefit;
    private Timestamp checkinDate;
    private Timestamp checkoutDate;
    private Byte interested;
    private String paymentType;
    private Double paidAmount;
    private Byte paid;
    private UserEntity userByUserIdUser;
    private AdEntity adByAdIdAd;

    @Id
    @Column(name = "idBenefit", nullable = false)
    public int getIdBenefit() {
        return idBenefit;
    }

    public void setIdBenefit(int idBenefit) {
        this.idBenefit = idBenefit;
    }

    @Basic
    @Column(name = "checkin_date", nullable = true)
    public Timestamp getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Timestamp checkinDate) {
        this.checkinDate = checkinDate;
    }

    @Basic
    @Column(name = "checkout_date", nullable = true)
    public Timestamp getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Timestamp checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    @Basic
    @Column(name = "interested", nullable = true)
    public Byte getInterested() {
        return interested;
    }

    public void setInterested(Byte interested) {
        this.interested = interested;
    }

    @Basic
    @Column(name = "payment_type", nullable = true, length = 128)
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "paid_amount", nullable = true, precision = 0)
    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Basic
    @Column(name = "paid", nullable = true)
    public Byte getPaid() {
        return paid;
    }

    public void setPaid(Byte paid) {
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BenefitEntity that = (BenefitEntity) o;
        return idBenefit == that.idBenefit &&
                Objects.equals(checkinDate, that.checkinDate) &&
                Objects.equals(checkoutDate, that.checkoutDate) &&
                Objects.equals(interested, that.interested) &&
                Objects.equals(paymentType, that.paymentType) &&
                Objects.equals(paidAmount, that.paidAmount) &&
                Objects.equals(paid, that.paid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBenefit, checkinDate, checkoutDate, interested, paymentType, paidAmount, paid);
    }

    @ManyToOne
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user", nullable = false)
    public UserEntity getUserByUserIdUser() {
        return userByUserIdUser;
    }

    public void setUserByUserIdUser(UserEntity userByUserIdUser) {
        this.userByUserIdUser = userByUserIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "ad_id_ad", referencedColumnName = "id_ad", nullable = false)
    public AdEntity getAdByAdIdAd() {
        return adByAdIdAd;
    }

    public void setAdByAdIdAd(AdEntity adByAdIdAd) {
        this.adByAdIdAd = adByAdIdAd;
    }
}
