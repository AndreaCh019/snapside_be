package com.unisalento.snapside.generated.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "snapside", catalog = "")
public class CategoryEntity {
    private int idcategory;
    private String categoryname;
    private String description;
    private Collection<AttributeEntity> attributesByIdcategory;
    private Collection<ItemEntity> itemsByIdcategory;

    @Id
    @Column(name = "idcategory", nullable = false)
    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    @Basic
    @Column(name = "categoryname", nullable = false, length = 127)
    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 5000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return idcategory == that.idcategory &&
                Objects.equals(categoryname, that.categoryname) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcategory, categoryname, description);
    }

    @OneToMany(mappedBy = "categoryByCategoryIdcategory")
    public Collection<AttributeEntity> getAttributesByIdcategory() {
        return attributesByIdcategory;
    }

    public void setAttributesByIdcategory(Collection<AttributeEntity> attributesByIdcategory) {
        this.attributesByIdcategory = attributesByIdcategory;
    }

    @OneToMany(mappedBy = "categoryByCategoryIdcategory")
    public Collection<ItemEntity> getItemsByIdcategory() {
        return itemsByIdcategory;
    }

    public void setItemsByIdcategory(Collection<ItemEntity> itemsByIdcategory) {
        this.itemsByIdcategory = itemsByIdcategory;
    }
}
