package com.scheduleanduser.controller;


import com.scheduleanduser.dto.request.ScheduleSaveRequestDto;
import com.scheduleanduser.dto.response.ScheduleSaveResponseDto;
import com.scheduleanduser.entity.Schedule;
import com.scheduleanduser.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleservice;

    @PostMapping("/schedules")
    public ResponseEntity<ScheduleSaveResponseDto> save(
            @RequestBody ScheduleSaveRequestDto dto) {
        return ResponseEntity.ok(scheduleservice.save(dto));
    }

}
