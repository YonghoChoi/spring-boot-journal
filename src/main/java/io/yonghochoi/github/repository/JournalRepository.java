package io.yonghochoi.github.repository;

import io.yonghochoi.github.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA를 사용하므로 JpaRepository를 상속한 인터페이스가 필요
 * JpaRepository는 marker interface로 스프링 데이터 리포지터리 엔진이 자동 인지한다
 * CRUD 뿐만 아니라 커스텀 메서드 구현에 필요한 프락시 클래스를 적용하기 위해 사용됨
 */
public interface JournalRepository extends JpaRepository<Journal, Long>{

}
