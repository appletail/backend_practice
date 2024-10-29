package com.group.libraryapp.homework.dto.day2.response;


import java.time.DayOfWeek;

public class DayOfTheWeekResponse {

    private DayOfWeek dayOfTheWeek;

    public DayOfTheWeekResponse(DayOfWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek.toString().substring(0, 3);
    }
}
