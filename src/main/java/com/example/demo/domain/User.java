package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
  @Id // primary key
  private int id;
  private String name;
  private int age;
//  public void setId(Long id) {
//    this.id = id;
//  }
//
//  public Long getId() {
//    return id;
//  }  : @Getter와 @Setter가 있으면 Getter,Setter설정을 하지 않아도 된다.
//  public User() {} 생성자
  //@NoArgsConstructor,@AllArgsConstructor가 있는 경우 생성자를 쓰지 않아도 된다.
//@NoArgsConstructor, @AllArgsConstructor 의 역할에 대해서 숙제
}
