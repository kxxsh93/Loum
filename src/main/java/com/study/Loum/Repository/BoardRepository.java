package com.study.Loum.Repository;


import com.study.Loum.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Entity의 기본적인 CRUD가 가능하도록 JpaRepository 인터페이스를 제공
 * JpaRepository를 상속받을 때는 사용될 Entity 클래스와 ID값이 들어가게 된다.
 * JpaRepository < Board(클래스명), Integer Id >
 */

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);
}
