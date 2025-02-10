package com.example.sesac_project.exception.exhandler.advice;

import com.example.sesac_project.controller.HelloController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice(assignableTypes = {HelloController.class})
public class TargetControllerAdviceEx {
}
