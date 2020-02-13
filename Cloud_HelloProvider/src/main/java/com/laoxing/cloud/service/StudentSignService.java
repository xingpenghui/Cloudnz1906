package com.laoxing.cloud.service;

import com.laoxing.cloud.model.dto.SignDto;
import com.laoxing.cloud.model.vo.R;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 11:18
 */
public interface StudentSignService {
    R sign(SignDto dto);
    R queryByName(String name);
    R queryAll();
}
