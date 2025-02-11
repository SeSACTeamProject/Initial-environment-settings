package com.example.sesac_project.example_domatin;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class IpPort {
    private String ip;
    private Integer port;

    public IpPort(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }
}
