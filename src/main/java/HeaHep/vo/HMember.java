package HeaHep.vo;

import java.sql.Date;
import java.text.SimpleDateFormat;

//회원 VO
public class HMember {
  protected int memberNo;
  protected String memberName;
  protected String memberEmail;
  protected int memberTel;
  protected String memberPWD;
  protected boolean memberGender;
  protected String memberRank;
  protected int trainerNo;
  protected String trainerName;
  protected Date joinedDate;
  protected String joinedDate2;
  static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
  
  public int getMemberNo() {
    return memberNo;
  }
  public void setMemberNo(int memberNo) {
    this.memberNo = memberNo;
  }
  public String getMemberName() {
    return memberName;
  }
  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }
  public String getMemberEmail() {
    return memberEmail;
  }
  public void setMemberEmail(String memberEmail) {
    this.memberEmail = memberEmail;
  }
  public int getMemberTel() {
    return memberTel;
  }
  public void setMemberTel(int memberTel) {
    this.memberTel = memberTel;
  }
  public String getMemberPWD() {
    return memberPWD;
  }
  public void setMemberPWD(String memberPWD) {
    this.memberPWD = memberPWD;
  }
  public boolean isMemberGender() {
    return memberGender;
  }
  public void setMemberGender(boolean memberGender) {
    this.memberGender = memberGender;
  }
  public String getMemberRank() {
    return memberRank;
  }
  public void setMemberRank(String memberRank) {
    this.memberRank = memberRank;
  }
  public int getTrainerNo() {
    return trainerNo;
  }
  public void setTrainerNo(int trainerNo) {
    this.trainerNo = trainerNo;
  }
  public String getTrainerName() {
    return trainerName;
  }
  public void setTrainerName(String trainerName) {
    this.trainerName = trainerName;
  }
  public Date getJoinedDate() {
    return joinedDate;
  }
  public void setJoinedDate(Date joinedDate) {
    this.joinedDate = joinedDate;
    this.joinedDate2 = format.format(joinedDate);
  }
  public String getJoinedDate2() {
    return joinedDate2;
  }
  public void setJoinedDate2(String str) {
    this.joinedDate = Date.valueOf(str);
    this.joinedDate2 = str;
  }
  public static SimpleDateFormat getFormat() {
    return format;
  }
  public static void setFormat(SimpleDateFormat format) {
    HMember.format = format;
  }
}