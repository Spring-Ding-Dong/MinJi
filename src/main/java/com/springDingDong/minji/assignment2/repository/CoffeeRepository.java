package com.springDingDong.minji.assignment2.repository;

import com.springDingDong.minji.assignment2.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository => CRUD를 용이하게 하기 위해 
// save, findById(id), findAll(), delete(entity), deleteById(id) 제공
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    Coffee findByName(String name);
}
