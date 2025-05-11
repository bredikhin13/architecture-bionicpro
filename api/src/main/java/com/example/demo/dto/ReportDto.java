package com.example.demo.dto;


public class ReportDto {
    private final String event;
    private final String source;
    private final long amount;

    public ReportDto(String event, String source, long amount) {
        this.event = event;
        this.source = source;
        this.amount = amount;
    }

    public String getEvent() {
        return event;
    }

    public String getSource() {
        return source;
    }

    public long getAmount() {
        return amount;
    }
}
