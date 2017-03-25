package HeaHep.dao;

import java.util.Map;

import HeaHep.vo.HMember;

public interface HMemberDao {
  int joinMember(HMember hMember) throws Exception; //회원가입
  HMember selectOneByEmail(String memberEmail) throws Exception; //이메일 중복체크
  HMember selectOneByNick(String memberNick) throws Exception; //닉네임 중복체크
  HMember selectOneByEmailAndPassword(Map<String, Object> paramMap) throws Exception; //로그인
  int changeMemberInfo(HMember hMember) throws Exception; //회원정보 수정 
  HMember selectOneByMemberNo(int memberNo) throws Exception;
}
