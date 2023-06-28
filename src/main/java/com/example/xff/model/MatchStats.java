package com.example.xff.model;

import jakarta.persistence.Entity;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
//@Entity(name = "match_stats")
public class MatchStats {

    private String matchId;
    private String date;
    private TeamStats teamA;
    private TeamStats teamB;
}
