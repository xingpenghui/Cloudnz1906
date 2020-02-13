package com.laoxing.cloud.service.impl;

import com.laoxing.cloud.dao.StudentSignDao;
import com.laoxing.cloud.model.dto.SignDto;
import com.laoxing.cloud.model.entity.StudentSign;
import com.laoxing.cloud.model.vo.R;
import com.laoxing.cloud.service.StudentSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 11:19
 */
@Service
public class StudentSignServiceImpl implements StudentSignService {
    @Autowired
    private StudentSignDao signDao;

    @Override
    public R sign(SignDto dto) {
        StudentSign sign=new StudentSign();
        //每一堂课需要签到  9:30-9:40  第一次
        // 10:50-11:00  2:30-2:40 3:50-4:00
        sign.setClsname(dto.getClaname());
        sign.setName(dto.getName());
        sign.setType("上课前签到");
        if(signDao.insert(sign)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R queryByName(String name) {
        List<StudentSign> studentSign=signDao.selectByName(name);
        if(studentSign!=null){
            return R.ok(studentSign);
        }else {
            return R.fail("暂无签到数据");
        }
    }

    @Override
    public R queryAll() {
        return R.ok(signDao.selectAll());
    }
}
