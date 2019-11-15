package com.unisalento.snapside.generated.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "item", schema = "snapside", catalog = "")
public class ItemEntity {
    private int idItem;
    private String name;
    private String description;
    private Collection<AdEntity> adsByIdItem;
    private CategoryEntity categoryByCategoryIdcategory;

    @Id
    @Column(name = "id_item", nullable = false)
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 127)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        ItemEntity that = (ItemEntity) o;
        return idItem == that.idItem &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItem, name, description);
    }

    @OneToMany(mappedBy = "itemByItemIdItem")
    public Collection<AdEntity> getAdsByIdItem() {
        return adsByIdItem;
    }

    public void setAdsByIdItem(Collection<AdEntity> adsByIdItem) {
        this.adsByIdItem = adsByIdItem;
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
