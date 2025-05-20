package hello.jdbc.repository;

import hello.jdbc.domain.Member;

/**
 * 언체크 예외 코드의 인터페이스
 */
public interface MemberRepository {
    Member save(Member member);
    Member findById(String memberId);
    void update(String memberId, int money);
    void delete(String memberId);
}
