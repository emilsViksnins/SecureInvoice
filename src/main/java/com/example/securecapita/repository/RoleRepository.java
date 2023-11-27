package com.example.securecapita.repository;

import com.example.securecapita.domain.Role;
import org.apache.catalina.User;

import java.util.Collection;

public interface RoleRepository <T extends Role> {
        /*Basic crud operations */
        T create (T data);
        Collection<T> list(int page, int pageSize);
        T get(Long id);
        T update(T data);
        Boolean delete(Long id);

    /*BMore Complex operations */

    void addRoleToUser(Long userId, String roleName);
    Role getRoleByUserId(Long userId);
    Role getRoleByUserEmail(String email);
    void updateUserRole(Long  userId, String roleName);
}
