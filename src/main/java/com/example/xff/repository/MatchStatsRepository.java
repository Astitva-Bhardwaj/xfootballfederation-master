package com.example.xff.repository;

import com.example.xff.model.MatchStats;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchStatsRepository{

    MatchStats getMatchStats(String matchId);
}
