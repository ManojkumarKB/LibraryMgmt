package com.library.pract.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.pract.model.Member;

public interface MemberRepository extends JpaRepository<Member,Integer>{
	
	List<Member> findAll();

}
