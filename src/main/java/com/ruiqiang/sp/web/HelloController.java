package com.ruiqiang.sp.web;

import com.ruiqiang.sp.domain.ZLoan;
import com.ruiqiang.sp.mapper.ZLoanMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Resource
    ZLoanMapper zLoanMapper;

    @RequestMapping("/hello")
    public int hello() {
        ZLoan zloan = zLoanMapper.selectByPrimaryKey(1);
        return zloan.getId();
    }
}