package infPrj.core;

import infPrj.core.discount.FixDiscountPolicy;
import infPrj.core.member.MemberService;
import infPrj.core.member.MemberServiceImpl;
import infPrj.core.member.MemoryMemberRepository;
import infPrj.core.order.OrderService;
import infPrj.core.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
