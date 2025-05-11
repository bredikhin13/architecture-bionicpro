package com.example.demo.controller;

import com.example.demo.dto.ReportDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

    @PreAuthorize("hasAuthority('prothetic_user')")
    @GetMapping("/reports")
    public List<ReportDto> getReports() {
        return List.of(
                new ReportDto("ACCESS", "API", 1000),
                new ReportDto("PUT", "API", 100)
        );

    }
}
