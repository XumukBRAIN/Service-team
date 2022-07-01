package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import model.Team;
import model.User;




@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface SOAPTeamService {

    @WebMethod
    User createUser(User user);

    @WebMethod
    Team createGroup(Team team);

    @WebMethod
    void addUser(User user, Team team);

    //список всех пользователей
    //при создании команды должны быть права доступа
    //сущность пользователей без трека и привязанного лида

}
