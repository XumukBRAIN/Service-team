package model;

public class Team {

    private Long team_id;
    private String team_name;
    private String team_color;

    public Team(){}

    public Team(Long team_id, String team_name, String team_color) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.team_color = team_color;
    }

    public Team(String team_name, String team_color) {
        this.team_name = team_name;
        this.team_color = team_color;
    }

    public Team(Long team_id) {
        this.team_id = team_id;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_color() {
        return team_color;
    }

    public void setTeam_color(String team_color) {
        this.team_color = team_color;
    }

    @Override
    public String toString() {
        return team_id + team_name + team_color;
    }
}
