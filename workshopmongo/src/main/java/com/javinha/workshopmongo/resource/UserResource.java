package com.javinha.workshopmongo.resource;

import com.javinha.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User gustavo = new User("1","Gustavo","paivinha@paivinha.com");
        User paivinha = new User("2","Paivinha","gusatvo@gusatvo.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(gustavo,paivinha));
        return ResponseEntity.ok().body(list);
    }
}
