package com.ruiqiang.sp.mapper;

import com.ruiqiang.sp.domain.ZLoan;

public interface ZLoanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZLoan record);

    int insertSelective(ZLoan record);

    ZLoan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZLoan record);

    int updateByPrimaryKey(ZLoan record);
}