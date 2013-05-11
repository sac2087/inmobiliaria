/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.User;
import java.util.List;

/**
 *
 * @author lprone
 */
public class UserController {
    
     public static int insert(String[] tags, String[] values) {
        try {
            User aux = new User();
            aux.set(tags, values);
            aux.saveIt();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int update(int id, String[] tags, String[] values) {
        try {
            User e = User.findFirst("id = ?", id);
            for (int i = 0; i < tags.length; i++) {
                e.set(tags[i], values[i]).saveIt();
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int delete(int id) {
        try {
            User e = User.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static List<User> list() {
        return User.findAll();
    }

    public static int getId(String first_name, String last_name) {
        try {
            return (Integer) User.findFirst("first_name = ? and last_name = ?", first_name, last_name).get("id");
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }    
}