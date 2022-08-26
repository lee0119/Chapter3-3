package com.example.intermediate.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Heart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long heartId;

  @Column(nullable = false)
  private Long id;


  @Column(nullable = false)
  private String nickname;

}