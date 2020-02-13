package com.laoxing.cloud.fallback;

import com.laoxing.cloud.model.dto.SignDto;
import com.laoxing.cloud.model.vo.R;
import com.laoxing.cloud.service.StudentSignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 16:36
 */
@Component //IOC 创建
public class MyFallBackFactory implements FallbackFactory<StudentSignService> {
    @Override
    public StudentSignService create(Throwable throwable) {
        //匿名内部类
       return new StudentSignService(){
            @Override
            public R save(SignDto dto) {
                return R.fail("服务不可用-save");
            }

            @Override
            public R names(String name) {
                return R.fail("服务不可用-names:"+name);
            }

            @Override
            public R all() {
                return R.fail("服务不可用-all");
            }
        };
    }
}
