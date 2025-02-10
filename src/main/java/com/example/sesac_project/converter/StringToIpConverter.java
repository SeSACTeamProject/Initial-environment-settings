package com.example.sesac_project.converter;

import com.example.sesac_project.domain.IpPort;
import org.springframework.core.convert.converter.Converter;

public class StringToIpConverter implements Converter<String, IpPort> {
    @Override
    public IpPort convert(String source) {
        String[] split = source.split(":");
        return new IpPort(split[0], Integer.valueOf(split[1]));
    }
}
