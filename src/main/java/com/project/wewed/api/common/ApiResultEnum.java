package com.project.wewed.api.common;

import lombok.Getter;

public enum ApiResultEnum {
    SUCCESS("1000", "성공"),
    INVALID_USER("3000", "사용자 정보가 일치하지 않습니다."),
    FAIL("9999", "시스템 오류"),
    ;

    ApiResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Getter
    private String code;

    @Getter
    private String message;
}
