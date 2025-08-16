package com.scheduleanduser.dto.request;


import lombok.Getter;

@Getter
public class ScheduleSaveRequestDto {

    private String userName;
    private String title;
    private String contents;

    public ScheduleSaveRequestDto(String userName, String title, String contents) {
        this.userName = userName;
        this.title = title;
        this.contents = contents;
    }
}
