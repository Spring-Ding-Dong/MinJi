package com.springDingDong.minji.week2;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "안녕하세요!";
    }

    @GetMapping("name/{name}")
    public String getName(@PathVariable(value="name") final String name) {
        return name;
    }

    @GetMapping("/pda")
    public String getPart(@RequestParam(value="part",defaultValue="") final String part,
                          @RequestParam(value="age",defaultValue = "") final String age) {
        return "파트는 "+part+"이고, 나이는 "+age+"입니다.";
    }

    @PostMapping("member")
    public String postMember(@RequestBody final Member member) {
        return member.getName();
    }
}
