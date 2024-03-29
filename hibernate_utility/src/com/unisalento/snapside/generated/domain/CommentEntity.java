package com.unisalento.snapside.generated.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "comment", schema = "snapside", catalog = "")
public class CommentEntity {
    private int idComment;
    private String text;
    private Integer rating;
    private UserEntity userByUserIdUser;
    private CommentEntity commentByCommentIdcomment;
    private Collection<CommentEntity> commentsByIdComment;
    private AdEntity adByAdIdAd;

    @Id
    @Column(name = "id_comment", nullable = false)
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    @Basic
    @Column(name = "text", nullable = true, length = 5000)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "rating", nullable = true)
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntity that = (CommentEntity) o;
        return idComment == that.idComment &&
                Objects.equals(text, that.text) &&
                Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComment, text, rating);
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
    @JoinColumn(name = "comment_idcomment", referencedColumnName = "id_comment", nullable = false)
    public CommentEntity getCommentByCommentIdcomment() {
        return commentByCommentIdcomment;
    }

    public void setCommentByCommentIdcomment(CommentEntity commentByCommentIdcomment) {
        this.commentByCommentIdcomment = commentByCommentIdcomment;
    }

    @OneToMany(mappedBy = "commentByCommentIdcomment")
    public Collection<CommentEntity> getCommentsByIdComment() {
        return commentsByIdComment;
    }

    public void setCommentsByIdComment(Collection<CommentEntity> commentsByIdComment) {
        this.commentsByIdComment = commentsByIdComment;
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
