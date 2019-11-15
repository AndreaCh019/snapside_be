package com.unisalento.snapside.generated.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "snapside", catalog = "")
public class UserEntity {
    private int idUser;
    private String name;
    private String surname;
    private Date dob;
    private String email;
    private String username;
    private String password;
    private String address;
    private Byte enabled;
    private Byte online;
    private String userType;
    private int id;
    private Collection<AdEntity> adsByIdUser;
    private Collection<BenefitEntity> benefitsByIdUser;
    private Collection<CommentEntity> commentsByIdUser;

    @Id
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = true, length = 255)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "dob", nullable = true)
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "enabled", nullable = true)
    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "online", nullable = true)
    public Byte getOnline() {
        return online;
    }

    public void setOnline(Byte online) {
        this.online = online;
    }

    @Basic
    @Column(name = "user_type", nullable = true, length = 45)
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return idUser == that.idUser &&
                id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(dob, that.dob) &&
                Objects.equals(email, that.email) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(address, that.address) &&
                Objects.equals(enabled, that.enabled) &&
                Objects.equals(online, that.online) &&
                Objects.equals(userType, that.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, name, surname, dob, email, username, password, address, enabled, online, userType, id);
    }

    @OneToMany(mappedBy = "userByUserIdSeller")
    public Collection<AdEntity> getAdsByIdUser() {
        return adsByIdUser;
    }

    public void setAdsByIdUser(Collection<AdEntity> adsByIdUser) {
        this.adsByIdUser = adsByIdUser;
    }

    @OneToMany(mappedBy = "userByUserIdUser")
    public Collection<BenefitEntity> getBenefitsByIdUser() {
        return benefitsByIdUser;
    }

    public void setBenefitsByIdUser(Collection<BenefitEntity> benefitsByIdUser) {
        this.benefitsByIdUser = benefitsByIdUser;
    }

    @OneToMany(mappedBy = "userByUserIdUser")
    public Collection<CommentEntity> getCommentsByIdUser() {
        return commentsByIdUser;
    }

    public void setCommentsByIdUser(Collection<CommentEntity> commentsByIdUser) {
        this.commentsByIdUser = commentsByIdUser;
    }
}
