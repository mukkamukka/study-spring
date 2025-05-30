package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

/**
 * 체크 예외 코드의 인터페이스
 */
public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;
    Member findById(String memberId) throws SQLException;
    void update(String memberId, int money) throws SQLException;
    void delete(String memberId) throws SQLException;
}
