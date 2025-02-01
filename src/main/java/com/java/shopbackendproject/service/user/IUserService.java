package com.java.shopbackendproject.service.user;

import com.java.shopbackendproject.dto.UserDto;
import com.java.shopbackendproject.model.User;
import com.java.shopbackendproject.request.CreateUserRequest;
import com.java.shopbackendproject.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
    User getAuthenticatedUser();
}

