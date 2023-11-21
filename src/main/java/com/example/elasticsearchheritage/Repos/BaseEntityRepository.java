package com.example.elasticsearchheritage.Repos;

import com.example.elasticsearchheritage.Entities.BaseEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BaseEntityRepository extends ElasticsearchRepository<BaseEntity, String> {
    // You can add custom queries here if needed
}