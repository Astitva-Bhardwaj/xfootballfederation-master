package com.example.xff.model;

import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamStats {
    private String goals;
    private String possession;
    private String passes;
    private String shots;
    private String shotsOnTarget;
    private String corners;
}