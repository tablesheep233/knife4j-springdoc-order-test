package com.github.tablesheep233.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "3.work", description = "3.work")
@RestController
@RequestMapping("work")
public class WorkController {

    @GetMapping
    @Operation(summary = "working")
    public String work() {
        return "work";
    }

    @PostMapping
    @Operation(summary = "mo yu")
    public void doSomething() {
    }
}
