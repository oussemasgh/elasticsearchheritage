package com.example.elasticsearchheritage.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "myindex")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    @Id
    private String id;

    private String commonField;
}
