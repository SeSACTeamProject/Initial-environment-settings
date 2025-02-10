package com.example.sesac_project.exception.exhandler.advice;
import com.example.sesac_project.exception.exhandler.ErrorResultEx;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ControllerAdviceEx {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public ErrorResultEx exHandle(Exception e) {
        log.error("[exceptionHandle] ex", e);
        return new ErrorResultEx("EX", "오류 예시");
    }
}
