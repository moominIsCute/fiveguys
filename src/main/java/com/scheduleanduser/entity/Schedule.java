package com.scheduleanduser.entity;


import com.scheduleanduser.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String title;
    private String contents;

    public Schedule(String userName, String title, String description) {
        this.userName = userName;
        this.title = title;
        this.contents = description;
    }
}

