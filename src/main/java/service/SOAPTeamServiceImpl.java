package service;

import jakarta.jws.WebService;
import model.Team;
import model.User;


import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "TeamService")
public class SOAPTeamServiceImpl<V> implements SOAPTeamService {

    //Simple DataBase
    private Map<Long, User> usersDB = new HashMap<>();
    private Map<Long, V> teamDB = new HashMap<>();

    @Override
    public User createUser(User user) {
        usersDB.put(user.getUser_id(), user);
        return user;
    }

    @Override
    public Team createGroup(Team team) {
        teamDB.put(team.getTeam_id(), (V) team);
        return team;
    }

    @Override
    public void addUser(User user, Team team) {
        teamDB.put(team.getTeam_id(), (V) user);
    }

}
