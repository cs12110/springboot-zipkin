package com.zipkin.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:13
 * <p>
 * @since 1.0.0
 */
@AllArgsConstructor
@Getter
public enum StatusEnum {

    /**
     * success:1
     */
    SUCCESS(1, "成功"),

    /**
     * failure:0
     */
    FAILURE(0, "失败");

    private final Integer value;
    private final String desc;
}
