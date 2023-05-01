package com.example.hei.repository;

import com.example.hei.entity.HEI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HEIRepository extends JpaRepository<HEI, Integer> {

    List<HEI> searchHEISByNameIsContaining(String name);

}
