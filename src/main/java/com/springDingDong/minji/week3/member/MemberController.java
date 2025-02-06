package com.springDingDong.minji.week3.member;

import com.springDingDong.minji.week2.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("members")
public class MemberController {

//    @Autowired
    private final MemberService memberService;

    @GetMapping("")
    @ResponseBody
    public List<Member> getAllMember(){
        return memberService.getAllMembers();
    }
}
