package com.example.elasticsearchheritage.Services;

import com.example.elasticsearchheritage.Entities.BaseEntity;
import com.example.elasticsearchheritage.Repos.BaseEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaseEntityService {
    @Autowired
    private final BaseEntityRepository baseEntityRepository;

    public BaseEntityService(BaseEntityRepository baseEntityRepository) {
        this.baseEntityRepository = baseEntityRepository;
    }
    public void saveEntity(BaseEntity entity) {
        baseEntityRepository.save(entity);
    }

    public Optional<BaseEntity> findById(String id) {
        return baseEntityRepository.findById(id);
    }

    public Iterable<BaseEntity> findAll() {
        return  baseEntityRepository.findAll();
    }
}
