package infPrj.core;

import infPrj.core.member.Grade;
import infPrj.core.member.Member;
import infPrj.core.member.MemberService;
import infPrj.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        Member memberA = new Member(1L, "memberA", Grade.BASIC);
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);

        System.out.println("member = " + memberA.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
