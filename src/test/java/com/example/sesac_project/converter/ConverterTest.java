package com.example.sesac_project.converter;

import com.example.sesac_project.example_domatin.IpPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ConverterTest {
    @Test
    public void testConvert() {

        StringToIpConverter converter = new StringToIpConverter();
        String source = "127.0.0.1:8080";


        IpPort result = converter.convert(source);

        assertNotNull(result);
        assertEquals(8080, result.getPort());
        assertEquals("127.0.0.1", result.getIp());

        IpToStringConverter ipToStringConverter = new IpToStringConverter();
        String convert = ipToStringConverter.convert(result);

        assertNotNull(convert);
        Assertions.assertEquals(convert, source);


    }

}