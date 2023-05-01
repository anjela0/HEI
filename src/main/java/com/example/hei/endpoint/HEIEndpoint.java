package com.example.hei.endpoint;

import com.example.hei.dto.HEIRequestDto;
import com.example.hei.dto.HEIResponseDto;
import com.example.hei.entity.HEI;
import com.example.hei.mapper.HEIMapper;
import com.example.hei.repository.HEIRepository;
import com.example.hei.service.HEIService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HEIEndpoint {

    private final HEIService heiService;

    private final HEIMapper heiMapper;

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestBody HEIRequestDto heiRequestDto) {
        List<HEIResponseDto> heis = heiMapper.map(heiService.searchHEISByNameIsContaining(heiRequestDto.getName()));
        return ResponseEntity.ok(heis);
    }

}
