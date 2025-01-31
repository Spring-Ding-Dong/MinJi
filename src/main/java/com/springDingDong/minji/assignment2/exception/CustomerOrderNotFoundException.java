package com.springDingDong.minji.assignment2.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "해당 고객의 주문이 없습니다")
public class CustomerOrderNotFoundException extends IllegalArgumentException {
}