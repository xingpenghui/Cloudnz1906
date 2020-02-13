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
 * @create: 2020-02-13 11:28
 */
@RestController
public class StudentSignController {
    @Autowired
    private StudentSignService signService;

    //新增
    @PostMapping("/provider/sign/save.do")
    public R save(@RequestBody SignDto dto){
        return signService.sign(dto);
    }
    @GetMapping("/provider/sign/queryname.do")
    public R names(@RequestParam String name){
        return signService.queryByName(name);
    }
    @GetMapping("/provider/sign/all.do")
    public R all()
    {
        int i=1/0;
        return signService.queryAll();
    }
}
