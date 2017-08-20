package model.integration;

import java.util.Date;

public class SapTeamMember {
    private Integer teamId;
    private Integer employeeId;
    private Boolean teamLeader;
    private Date changeDate;

    public Integer getTeamId() {
        return teamId;
    }

    void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Boolean getTeamLeader() {
        return teamLeader;
    }

    void setTeamLeader(Boolean teamLeader) {
        this.teamLeader = teamLeader;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
}
