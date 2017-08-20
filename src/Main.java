import model.integration.SapTeamMember;
import model.integration.SapTeamMemberFactory;
import model.sap.Member;
import model.sap.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    private static SapTeamMemberFactory factory = new SapTeamMemberFactory();

    public static void main(String[] args) {
        List<Team> teams = createTeams();
        List<SapTeamMember> sapTeamMembers = new ArrayList<>();

        teams.forEach(team -> {
            sapTeamMembers.add(createSapTeamLeader(team));
            sapTeamMembers.addAll(createSapTeamMembers(team.getId(), team.getMembers()));
        });

        System.out.println(sapTeamMembers);
        System.out.println("Teams created");
    }

    private static SapTeamMember createSapTeamLeader(Team team) {
        return factory.createTeamLeader(team.getId(), team.getEmplyeeIdTeamLeader(), team.getChangeDate());
    }

    private static List<SapTeamMember> createSapTeamMembers(Integer teamId, Collection<Member> teamMembers) {
        return teamMembers.stream()
                .map(member -> factory.createTeamMember(teamId, member.getId(), member.getChangeDate()))
                .collect(Collectors.toList());
    }

    private static List<Team> createTeams(){
        List<Team> teams = new ArrayList<>();

        for (int count = 0; count < 5; count++){
            Team team = new Team();
            team.setId(count);
            team.setEmplyeeIdTeamLeader(new Random().nextInt(10));
            team.setNameTeamLeader(String.format("Teamleader team %s", count));
            team.setMembers(createMembers());
            teams.add(team);
        }
        return teams;
    }

    private static List<Member> createMembers(){
        List<Member> members = new ArrayList<>();

        for(int count = 0; count < 3; count++){
            Member member = new Member();
            member.setId(count);
            member.setEmployeeId(new Random().nextInt(10));
            member.setName(String.format("Member %s", count));
            members.add(member);
        }
        return members;
    }
}
