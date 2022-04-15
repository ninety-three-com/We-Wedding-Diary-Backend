package com.project.wewed.api.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse {
    @Getter
    private Object data;

    @Getter
    private ApiResult result;

    public ApiResponse(final Object data, final ApiResult result) {
        this.data = data;
        this.result = result;
    }

    public ApiResponse(final Object data) {
        this.data = data;
        this.result = ApiResult.builder(ApiResultEnum.SUCCESS).build();
    }
}