package InflearnSpringCoreBasic.Member;

import InflearnSpringCoreBasic.member.Grade;
import InflearnSpringCoreBasic.member.Member;
import InflearnSpringCoreBasic.member.MemberService;
import InflearnSpringCoreBasic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberSerivceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}