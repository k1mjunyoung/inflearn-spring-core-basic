package InflearnSpringCoreBasic;

import InflearnSpringCoreBasic.member.Grade;
import InflearnSpringCoreBasic.member.Member;
import InflearnSpringCoreBasic.member.MemberService;
import InflearnSpringCoreBasic.order.Order;
import InflearnSpringCoreBasic.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        //MemberService memberService = new MemberServiceImpl(null);
        //OrderService orderService = new OrderServiceImpl(null, null);
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
