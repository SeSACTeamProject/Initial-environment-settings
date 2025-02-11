package com.example.sesac_project.test;

import com.example.sesac_project.example_domatin.User;
import com.example.sesac_project.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ModelMapperTest {

    private final ModelMapper modelMapper = new ModelMapper();

    @Test
    public void testModelMapper() {
        // Entity → DTO 변환 테스트
        User user = new User("ModelMapper Test");
        user.setId(1L);

        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        assertThat(userDTO.getName()).isEqualTo(user.getName());

        // DTO → Entity 변환 테스트
        User convertedUser = modelMapper.map(userDTO, User.class);
        assertThat(convertedUser.getName()).isEqualTo(userDTO.getName());
    }
}