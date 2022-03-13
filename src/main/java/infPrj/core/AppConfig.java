package infPrj.core;

import infPrj.core.discount.DiscountPolicy;
import infPrj.core.discount.FixDiscountPolicy;
import infPrj.core.discount.RateDiscountPolicy;
import infPrj.core.member.MemberRepository;
import infPrj.core.member.MemberService;
import infPrj.core.member.MemberServiceImpl;
import infPrj.core.member.MemoryMemberRepository;
import infPrj.core.order.OrderService;
import infPrj.core.order.OrderServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
