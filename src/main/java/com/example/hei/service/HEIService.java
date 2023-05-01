package com.example.hei.service;

import com.example.hei.entity.HEI;
import com.example.hei.repository.HEIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HEIService {
    @Autowired
    private HEIRepository heiRepository;

    public List<HEI> searchHEISByNameIsContaining(String name) {
        return heiRepository.searchHEISByNameIsContaining(name);
    }
}
