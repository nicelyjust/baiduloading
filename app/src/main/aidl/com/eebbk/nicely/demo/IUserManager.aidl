package com.eebbk.nicely.demo;

import com.eebbk.nicely.demo.User;

interface IUserManager {
        List<User> getUserList();
        void addUser(in User user);
  }