package com.kio.kiov.mappers;

import java.util.List;
import com.kio.kiov.User;

public interface UserMapper
{
    void insertUser(User user);

    public User getUserById(Integer userId);

    public List<User> getAllUsers();

    public void updateUser(User user);

    public void deleteUser(Integer userId);
}