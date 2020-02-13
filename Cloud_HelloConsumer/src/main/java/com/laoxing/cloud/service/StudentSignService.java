package com.laoxing.cloud.service;

import com.laoxing.cloud.fallback.MyFallBackFactory;
import com.laoxing.cloud.model.dto.SignDto;
import com.laoxing.cloud.model.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 11:46
 */
@FeignClient(value = "xph-provider",fallbackFactory = MyFallBackFactory.class)
public interface StudentSignService {
    //新增
    @PostMapping("/provider/sign/save.do")
    R save(@RequestBody SignDto dto);
    @GetMapping("/provider/sign/queryname.do")
     R names(@RequestParam String name);
    @GetMapping("/provider/sign/all.do")
     R all();
}