package com.project.wewed.api.service;

import com.project.wewed.api.common.ApiResponse;
import com.project.wewed.api.common.ApiResult;
import com.project.wewed.api.common.ApiResultEnum;
import com.project.wewed.mybatis.mapper.TestMapper;
import com.project.wewed.mybatis.model.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class OjdbcConnectionService {

    @Autowired
    private TestMapper testMapper;

    public ApiResponse ojdbcConnectionTest() {
        TestVo testVo = testMapper.connectTest();
        if (testVo == null) {
            return new ApiResponse(null, ApiResult.builder(ApiResultEnum.FAIL).build());
        }
        return new ApiResponse(testVo);
    }
}
