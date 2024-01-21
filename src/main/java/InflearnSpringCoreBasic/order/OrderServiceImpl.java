package InflearnSpringCoreBasic.order;

import InflearnSpringCoreBasic.discount.DiscountPolicy;
import InflearnSpringCoreBasic.discount.FixDiscountPolicy;
import InflearnSpringCoreBasic.member.Member;
import InflearnSpringCoreBasic.member.MemberRepository;
import InflearnSpringCoreBasic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
