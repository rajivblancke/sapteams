package model.sap;

import java.util.Collection;
import java.util.Date;

public class Team {
    private Integer id;
    private Integer emplyeeIdTeamLeader;
    private String nameTeamLeader;
    private Date changeDate;
    private Collection<Member> members;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmplyeeIdTeamLeader() {
        return emplyeeIdTeamLeader;
    }

    public void setEmplyeeIdTeamLeader(Integer emplyeeIdTeamLeader) {
        this.emplyeeIdTeamLeader = emplyeeIdTeamLeader;
    }

    public String getNameTeamLeader() {
        return nameTeamLeader;
    }

    public void setNameTeamLeader(String nameTeamLeader) {
        this.nameTeamLeader = nameTeamLeader;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Collection<Member> getMembers() {
        return members;
    }

    public void setMembers(Collection<Member> members) {
        this.members = members;
    }
}
