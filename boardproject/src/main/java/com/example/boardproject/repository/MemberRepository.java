package com.example.boardproject.repository;

import com.example.boardproject.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Article, Long> {
    @Override
    List<Member> findAll();
}
