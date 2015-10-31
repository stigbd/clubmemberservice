package stigbd.clubmemberservice.repository;

import stigbd.clubmemberservice.domain.Member;

import java.util.List;

public interface Repository {

    List<Member> listMembers();

    String createMember(Member member);

    Member retrieveMemberById(String id);

    Member updateMemberById(String id, Member member);

    String deleteMemberById(String id);
}
