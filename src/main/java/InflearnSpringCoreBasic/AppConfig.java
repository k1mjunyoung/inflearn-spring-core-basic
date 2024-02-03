package InflearnSpringCoreBasic;


import InflearnSpringCoreBasic.discount.FixDiscountPolicy;
import InflearnSpringCoreBasic.member.MemberService;
import InflearnSpringCoreBasic.member.MemberServiceImpl;
import InflearnSpringCoreBasic.member.MemoryMemberRepository;
import InflearnSpringCoreBasic.order.OrderService;
import InflearnSpringCoreBasic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
