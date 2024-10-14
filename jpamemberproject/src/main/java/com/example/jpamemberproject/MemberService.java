package com.example.jpamemberproject;

import java.util.List;

public interface MemberService {

    // member list 출력
    List<Member> getMemberList();

    // find Member by userId
    Member findMemberById(String userId);

    // email을 기반으로 사용자 조회
    Member findMemberByEmail(String email);

    // name으로 사용자 조회
    Member findMemberByName(String name);

    // 나이 역순으로 멤버 리스트 출력
    List<Member> getMemberListOrderByAgeDesc();

    // 유효 멤버 확인
    boolean validMember(String userId, String userPwd);

    // XX대 멤버 리스트 가져오기
    public List<Member> getGeneration(int generation);
}