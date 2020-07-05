package com.sh.pfe.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
    @Id
    private String _id;
    private String name;
    private String price;
    private String rank_in_category;
    private String image;
    private String size;
    private String questions_answered;
    private String brand_name;
    private String seller_name;
    private String availability;
    private String sizes;
    private String asin;
    @Field("product_from")
    private String productFrom;
    private String rating;
    private String lien;
    private String num_of_reviews;
    private String category;
    private String product_url;
    private List<String> stock_day;
    private List<String> Sales;
    private List<String> Dates;

	public String getIdd() {
		return this._id;
	}
    
}
