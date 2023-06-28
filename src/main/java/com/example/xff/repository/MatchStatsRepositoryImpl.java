package com.example.xff.repository;

import com.example.xff.model.MatchStats;
import com.example.xff.model.TeamStats;
import org.springframework.stereotype.Repository;

@Repository
public class MatchStatsRepositoryImpl implements MatchStatsRepository {
    public MatchStats getMatchStats(String matchId) {
        MatchStats matchStats = new MatchStats();
        matchStats.setMatchId(matchId);
        matchStats.setDate("03-05-2023");

        TeamStats teamA = new TeamStats();
        teamA.setGoals("1");
        teamA.setPossession("50%");
        teamA.setPasses("50");
        teamA.setShots("5");
        teamA.setShotsOnTarget("3");
        teamA.setCorners("6");

        TeamStats teamB = new TeamStats();
        teamB.setGoals("1");
        teamB.setPossession("50%");
        teamB.setPasses("50");
        teamB.setShots("5");
        teamB.setShotsOnTarget("3");
        teamB.setCorners("6");

        matchStats.setTeamA(teamA);
        matchStats.setTeamB(teamB);

        return matchStats;
    }
}
