package com.unisalento.snapside.generated.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "attribute", schema = "snapside", catalog = "")
public class AttributeEntity {
    private int idattribute;
    private String attributeName;
    private String attributeValue;
    private CategoryEntity categoryByCategoryIdcategory;

    @Id
    @Column(name = "idattribute", nullable = false)
    public int getIdattribute() {
        return idattribute;
    }

    public void setIdattribute(int idattribute) {
        this.idattribute = idattribute;
    }

    @Basic
    @Column(name = "attribute_name", nullable = true, length = 45)
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Basic
    @Column(name = "attribute_value", nullable = true, length = 127)
    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeEntity that = (AttributeEntity) o;
        return idattribute == that.idattribute &&
                Objects.equals(attributeName, that.attributeName) &&
                Objects.equals(attributeValue, that.attributeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idattribute, attributeName, attributeValue);
    }

    @ManyToOne
    @JoinColumn(name = "category_idcategory", referencedColumnName = "idcategory", nullable = false)
    public CategoryEntity getCategoryByCategoryIdcategory() {
        return categoryByCategoryIdcategory;
    }

    public void setCategoryByCategoryIdcategory(CategoryEntity categoryByCategoryIdcategory) {
        this.categoryByCategoryIdcategory = categoryByCategoryIdcategory;
    }
}
