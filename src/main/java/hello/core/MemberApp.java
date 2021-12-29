package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);

        Member member1 = new Member(1L, "pikachu", Grade.VIP);
        memberService.join(member1);

        Member foundMember = memberService.findMember(1L);
        System.out.println("New Member: = " + foundMember.getName());
        System.out.println("Found Member: = " + memberService.findMember(foundMember.getId()).getName());
    }
}
