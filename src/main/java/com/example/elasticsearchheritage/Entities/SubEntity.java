package com.example.elasticsearchheritage.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "myindex")

@AllArgsConstructor
@NoArgsConstructor
public class SubEntity  extends BaseEntity{
    private String subField;
}
