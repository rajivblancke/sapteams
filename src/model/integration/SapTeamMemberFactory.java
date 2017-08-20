package model.integration;

import java.util.Date;

public class SapTeamMemberFactory {

    public SapTeamMember createTeamLeader(Integer teamId, Integer emplyeeId, Date changeDate){
        SapTeamMember teamLeader = createDefaultSapTeamMember(teamId, emplyeeId, changeDate);
        teamLeader.setTeamLeader(Boolean.TRUE);
        return teamLeader;
    }

    public SapTeamMember createTeamMember(Integer teamId, Integer emplyeeId, Date changeDate){
        SapTeamMember teamMember = createDefaultSapTeamMember(teamId, emplyeeId, changeDate);
        teamMember.setTeamLeader(Boolean.FALSE);
        return teamMember;
    }

    private SapTeamMember createDefaultSapTeamMember(Integer teamId, Integer emplyeeId, Date changeDate){
        SapTeamMember member = new SapTeamMember();
        member.setTeamId(teamId);
        member.setEmployeeId(emplyeeId);
        member.setChangeDate(changeDate);
        return member;
    }
}
