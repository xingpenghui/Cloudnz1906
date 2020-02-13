package com.laoxing.cloud.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 10:57
 */
@Data
public class StudentSign {
    private Integer id;
    private String name;
    private String clsname;//班级
    private Date stime;//签到时间
    private String type;//类型 ：第一节签到 第二节签到
}