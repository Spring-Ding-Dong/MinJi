package com.springDingDong.minji.week3.member;

import com.springDingDong.minji.week2.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional()
@RequiredArgsConstructor
public class MemberService {
        private final MemberRepository memberRepository;

        public List<Member> getAllMembers(){
            return memberRepository.findAll();
        }
}
