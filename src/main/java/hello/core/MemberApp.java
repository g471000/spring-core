package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member1 = new Member(1L, "pikachu", Grade.VIP);
        memberService.join(member1);

        Member foundMember = memberService.findMember(1L);
        System.out.println("New Member: = " + member1.getName());
        System.out.println("Found Member: = " + memberService.findMember(member1.getId()).getName());
    }
}
