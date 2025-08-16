package com.scheduleanduser.dto.response;


import lombok.Getter;

@Getter
public class ScheduleSaveResponseDto {

    private String userName;
    private String title;
    private String contents;

    public ScheduleSaveResponseDto(String userName, String title, String contents) {
        this.userName = userName;
        this.title = title;
        this.contents = contents;
    }
}
