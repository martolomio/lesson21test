package com.example.magazine.dao;

import com.example.magazine.domain.Periodical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodicalRepository extends JpaRepository<Periodical,Integer> {

    
}
