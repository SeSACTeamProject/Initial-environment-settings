package com.example.sesac_project.converter;

import com.example.sesac_project.domain.IpPort;
import org.springframework.core.convert.converter.Converter;

public class IpToStringConverter implements Converter<IpPort,String> {

    @Override
    public String convert(IpPort ipPort) {
        StringBuilder br = new StringBuilder();
        br.append(ipPort.getIp());
        br.append(":");
        br.append(ipPort.getPort());
        return br.toString();
    }
}
