package com.bootcampdemo.demo_sb_customer.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bootcampdemo.demo_sb_customer.codewave.GlobalExceptionHandler;
@RestControllerAdvice

public class LocalExceptionHandler extends GlobalExceptionHandler {

}
