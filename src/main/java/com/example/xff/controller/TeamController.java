package com.example.xff.controller;

import com.example.xff.model.MatchStats;
import com.example.xff.service.MatchStatsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Slf4j
@RequestMapping
@RestController
public class TeamController {
    @Autowired
    private MatchStatsService matchStatsService;

    @GetMapping("/getMatchStats")
    public ModelAndView getMatchStats(@RequestParam String matchId, Model model) {
        ModelAndView modelAndView = new ModelAndView("match-stats");
        MatchStats matchStats = matchStatsService.getMatchStats(matchId);
        modelAndView.addObject("matchStats", matchStats);
        return modelAndView;
    }
}
