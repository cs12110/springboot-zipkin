package com.zipkin.common.conf.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 加载zipkin配置
 *
 * <p>
 *
 * @author cs12110 create at 2020-04-05 15:00
 * <p>
 * @since 1.0.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "zipkin")
public class ZipkinProperties {

    private String serviceName;
    private String serverUrl;
    private Integer connectTimeout;
    private Integer readTimeout;
}
