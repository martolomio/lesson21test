package com.example.magazine.dao;

import com.example.magazine.domain.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket,Integer> {
}
