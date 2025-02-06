package com.springDingDong.minji.week3.member;

import com.springDingDong.minji.week2.Member;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final EntityManager em;

    @Transactional
    public List<Member> findAll(){
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
}
