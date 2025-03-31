package hello.inflearn_spring_beginner;

import hello.inflearn_spring_beginner.repository.MemberRepository;
import hello.inflearn_spring_beginner.repository.MemoryMemberRepository;
import hello.inflearn_spring_beginner.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
