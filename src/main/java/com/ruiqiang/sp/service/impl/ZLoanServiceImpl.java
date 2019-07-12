package com.ruiqiang.sp.service.impl;

import com.ruiqiang.sp.domain.ZLoan;
import com.ruiqiang.sp.mapper.ZLoanMapper;
import com.ruiqiang.sp.service.IZLoanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ZLoanServiceImpl implements IZLoanService {

    @Resource
    private ZLoanMapper zLoanMapper;

    @Override
    @Transactional
    public ZLoan save(ZLoan zLoan) {
        zLoanMapper.insert(zLoan);
        int a = 1/0;
        return zLoan;
    }
}
