package com.example.demobackendkc.user;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private UserDto[] userDtos = {
            new UserDto("Maxim", "Verbeeck"),
            new UserDto("Sarah", "Aouini")
    };

    @GetMapping
    public List<UserDto> getAllUsers() {
        return Arrays.asList(userDtos);
    }
}
