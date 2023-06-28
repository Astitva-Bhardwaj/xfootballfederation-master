package com.example.xff.service;

import com.example.xff.model.MatchStats;
import com.example.xff.repository.MatchStatsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MatchStatsService {

    @Autowired
    private MatchStatsRepository matchStatsRepository;

    public MatchStats getMatchStats(String matchId) {
        return matchStatsRepository.getMatchStats(matchId);
    }
}
