package InflearnSpringCoreBasic;

import InflearnSpringCoreBasic.member.Grade;
import InflearnSpringCoreBasic.member.Member;
import InflearnSpringCoreBasic.member.MemberService;
import InflearnSpringCoreBasic.member.MemberServiceImpl;
import InflearnSpringCoreBasic.order.Order;
import InflearnSpringCoreBasic.order.OrderService;
import InflearnSpringCoreBasic.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
