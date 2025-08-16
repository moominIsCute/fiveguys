package com.scheduleanduser.service;


import com.scheduleanduser.dto.request.ScheduleSaveRequestDto;
import com.scheduleanduser.dto.response.ScheduleSaveResponseDto;
import com.scheduleanduser.entity.Schedule;
import com.scheduleanduser.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleSaveResponseDto save(ScheduleSaveRequestDto dto) {
        Schedule schedule = new Schedule(dto.getUserName(), dto.getTitle(), dto.getContents());
        scheduleRepository.save(schedule);
        return new ScheduleSaveResponseDto(
                schedule.getUserName(),
                schedule.getTitle(),
                schedule.getContents());
    }
}
