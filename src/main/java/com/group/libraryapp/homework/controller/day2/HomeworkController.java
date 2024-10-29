package com.group.libraryapp.homework.controller.day2;

import com.group.libraryapp.homework.domain.day2.Calculator;
import com.group.libraryapp.homework.dto.day2.request.CalculatorRequest;
import com.group.libraryapp.homework.dto.day2.request.SumNumbersRequest;
import com.group.libraryapp.homework.dto.day2.response.DayOfTheWeekResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class HomeworkController {

    @GetMapping("/api/v1/calc")
    public Calculator calculate(CalculatorRequest request) {
        return new Calculator(request.getNum1(), request.getNum2());
    }

    @GetMapping("/api/v1/day-of-the-week")
    public DayOfTheWeekResponse dayOfTheWeek(@RequestParam String date) {
        LocalDate day = LocalDate.parse(date);
        DayOfTheWeekResponse response = new DayOfTheWeekResponse(day.getDayOfWeek());

        return response;
    }

    @PostMapping("/api/v1/sum")
    public int sumNumbers(@RequestBody SumNumbersRequest request) {
        return request.getNumbers().stream().mapToInt(Integer::intValue).sum();
    }
}
