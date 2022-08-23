package com.github.tablesheep233.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "2.bey", description = "2.bey")
@RestController
@RequestMapping("bey")
public class BeyController {

    @GetMapping
    @Operation(summary = "acquire bey")
    public String bey() {
        return "bey";
    }

    @PostMapping
    @Operation(summary = "set bey")
    public Boolean setBey() {
        return true;
    }
}
