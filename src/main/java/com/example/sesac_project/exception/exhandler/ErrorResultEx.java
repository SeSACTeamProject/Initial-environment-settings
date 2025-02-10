package com.example.sesac_project.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResultEx {
    private String code;
    private String message;
}