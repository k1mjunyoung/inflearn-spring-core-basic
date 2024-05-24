package InflearnSpringCoreBasic;


import InflearnSpringCoreBasic.discount.DiscountPolicy;
import InflearnSpringCoreBasic.discount.FixDiscountPolicy;
import InflearnSpringCoreBasic.member.MemberRepository;
import InflearnSpringCoreBasic.member.MemberService;
import InflearnSpringCoreBasic.member.MemberServiceImpl;
import InflearnSpringCoreBasic.member.MemoryMemberRepository;
import InflearnSpringCoreBasic.order.OrderService;
import InflearnSpringCoreBasic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
