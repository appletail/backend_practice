package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController // 주어진 Class를 Controller로 등록 (Controller: API의 진입 지점)
public class CalculatorController {

    @GetMapping("/add") // GET /add
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }
//    @GetMapping("/add") // GET /add
//    public int addTwoNumbers(
//            @RequestParam int number1,  // @RequestParam: query를 함수 파라미터에 넣음
//            @RequestParam int number2   // GET /add?number1=10&number2=20
//    ) {
//        return number1 + number2;
//    }

    @PostMapping("/multiply")  // POST /multiply
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }

}
