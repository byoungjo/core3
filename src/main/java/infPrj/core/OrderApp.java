package infPrj.core;

import infPrj.core.member.Grade;
import infPrj.core.member.Member;
import infPrj.core.member.MemberService;
import infPrj.core.member.MemberServiceImpl;
import infPrj.core.order.Order;
import infPrj.core.order.OrderService;
import infPrj.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemName", 20000);

        System.out.println("order = " + order);
        System.out.println("calculatePrice = " + order.calculatePrice());


    }
}
