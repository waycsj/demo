package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  //접근제한자 반환값의타입 메서드이름(매개변수)
  public void createUser(User user) {
    userRepository.save(user);
  }

  public List<User> readAllUser(){
    return userRepository.findAll();
  }

  public User readOneUser(int id){
    return userRepository.findById(id).get();
  }

  public User updateUser(int id, User user){
    User oldUser= userRepository.findById(id).get();
    oldUser.setName(user.getName());
    oldUser.setAge(user.getAge());
    userRepository.save(oldUser);
    return oldUser;
  }

  public void deleteUser(int userId){
    userRepository.deleteById(userId);
  }
}
