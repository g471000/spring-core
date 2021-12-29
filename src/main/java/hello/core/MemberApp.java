package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member1 = new Member(1L, "pikachu", Grade.VIP);
        memberService.join(member1);

        Member foundMember = memberService.findMember(1L);
        System.out.println("New Member: = " + foundMember.getName());
        System.out.println("Found Member: = " + memberService.findMember(foundMember.getId()).getName());
    }
}
