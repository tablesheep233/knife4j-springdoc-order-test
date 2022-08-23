package com.github.tablesheep233.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "1.hello", description = "1.hello")
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    @Operation(summary = "acquire hello")
    public String hello() {
        return "hello";
    }

    @PostMapping
    @Operation(summary = "set hello")
    public Boolean setHello() {
        return true;
    }
}
