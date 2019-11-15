package com.unisalento.snapside.generated.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comment", schema = "snapside", catalog = "")
public class CommentEntity {
    private int idComment;
    private String text;
    private Integer rating;

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
}
