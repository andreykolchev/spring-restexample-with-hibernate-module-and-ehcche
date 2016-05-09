package com.example.model;

import org.springframework.cache.annotation.*;

import javax.persistence.*;

/**
 * Created by artyo on 08.05.2016.
 */
@Entity
@org.springframework.cache.annotation.Cacheable
@Table(name = "item_attr")
public class ItemAttributes implements GeneralEntity{
    @Id
    @GeneratedValue
    @Column(name = "attr_id")
    private Integer id;

    @Column(name = "itemId",nullable = false)
    private Integer itemId;

    @Column(name = "attr_value")
    private String value;

    public Integer getItemId() {
        return itemId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
