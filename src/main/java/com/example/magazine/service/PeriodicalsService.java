package com.example.magazine.service;

import com.example.magazine.dao.PeriodicalRepository;
import com.example.magazine.domain.Periodical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodicalsService {
    @Autowired
    private PeriodicalRepository periodicalRepository;

    public Periodical save(Periodical periodical) {
        return periodicalRepository.save(periodical);
    }

    public List<Periodical> getAllPeriodicals(){
        return periodicalRepository.findAll();
    }

}
