package com.example.myweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myweb.entity.MyBoard;

public interface MyWebRepository extends JpaRepository<MyBoard, Long>{

}
