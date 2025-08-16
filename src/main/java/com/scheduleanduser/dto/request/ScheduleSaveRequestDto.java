package com.scheduleanduser.dto;


import lombok.Getter;

@Getter
public class ScheduleSaveRequestDto {

    private String userName;
    private String title;
    private String description;

    public ScheduleSaveRequestDto(String userName, String title, String description) {
        this.userName = userName;
        this.title = title;
        this.description = description;
    }
}
