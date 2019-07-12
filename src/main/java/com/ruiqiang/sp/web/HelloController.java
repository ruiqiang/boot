package com.ruiqiang.sp.web;

import com.ruiqiang.sp.domain.ZLoan;
import com.ruiqiang.sp.service.IZLoanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Resource
    private IZLoanService zLoanService;

    @RequestMapping("/hello")
    public int hello() {
        ZLoan entity = new ZLoan();
        entity.setUserid(1006);
        entity.setAddtime(new Date());
        entity.setLoanamount(BigDecimal.TEN);
        entity.setStatus(2);
        entity.setUpdatetime(new Date());
        zLoanService.save(entity);
        return entity.getId();
    }
}