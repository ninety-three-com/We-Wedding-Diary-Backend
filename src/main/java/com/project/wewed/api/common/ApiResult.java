package com.project.wewed.api.common;

import lombok.Getter;

public class ApiResult {
    @Getter
    private final String code;

    @Getter
    private final String message;

    private final String message2;

    private ApiResult(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.message2 = builder.message2;
    }

    public static Builder builder(ApiResultEnum resultEnum) {
        return new Builder(resultEnum);
    }

    public static class Builder {
        private final String code;
        private final String message;
        private String message2;

        Builder(ApiResultEnum resultEnum) {
            this.code = resultEnum.getCode();
            this.message = resultEnum.getMessage();
        }

        public Builder message2(String message2) {
            this.message2 = message2;
            return this;
        }

        public ApiResult build() {
            return new ApiResult(this);
        }
    }
}
