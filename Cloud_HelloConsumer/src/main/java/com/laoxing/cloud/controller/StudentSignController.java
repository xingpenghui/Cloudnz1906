package com.laoxing.cloud.controller;

import com.laoxing.cloud.model.dto.SignDto;
import com.laoxing.cloud.model.vo.R;
import com.laoxing.cloud.service.StudentSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 11:48
 */
@RestController
public class StudentSignController {

    @Autowired
    private StudentSignService signService;
    //新增
    @PostMapping("/api/sign/save.do")
    public R save(@RequestBody SignDto dto){
        return signService.save(dto);
    }
    @GetMapping("/api/sign/queryname.do")
    public R names(@RequestParam String name){
        return signService.names(name);
    }
    @GetMapping("/api/sign/all.do")
    public R all(){
        return signService.all();
    }
}
