package com.example.elasticsearchheritage.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "indexesSub")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubEntity  extends BaseEntity{
    private String subField;
}
