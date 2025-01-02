package com.example.springbootelasticsearchexample.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.annotation.processing.SupportedAnnotationTypes;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "products")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private Integer id;
    private String name;

    private Integer price ;

    private Integer qty ;

    public String getName() {
        return name;
    }
}