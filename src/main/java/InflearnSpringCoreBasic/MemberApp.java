package InflearnSpringCoreBasic;

import InflearnSpringCoreBasic.member.Grade;
import InflearnSpringCoreBasic.member.Member;
import InflearnSpringCoreBasic.member.MemberService;
import InflearnSpringCoreBasic.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        //MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        
        Member findMember = memberService.findMember(1L);
        System.out.println("new member.getName() = " + member.getName());
        System.out.println("findMember.getName() = " + findMember.getName());
    }
}
