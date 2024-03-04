package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getListUsers();
    public User getUser(int id);
    void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
}
