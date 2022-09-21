package com.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




 //@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "PRODUCT_TABLE")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    @NotNull(message = "Name can not be null")
    @Size(min = 2, message = "Name can not be less 2 character")
    private String name;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity can not be less than 1")
    private int quantity;

    @NotNull(message = " Price is required")
    @Min(value = 100, message = "Price can not be less than 100")
    @Max(value = 1000, message = "Price can not be more than 1000")
    private double price;
}
