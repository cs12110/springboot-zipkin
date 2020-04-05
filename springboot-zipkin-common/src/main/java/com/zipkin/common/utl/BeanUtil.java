package com.zipkin.common.utl;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:33
 * <p>
 * @since 1.0.0
 */

public class BeanUtil {

    public static Map<String, Object> bean2Map(Object bean) {
        if (null == bean) {
            return Collections.emptyMap();
        }

        Map<String, Object> map = new HashMap<>();
        try {
            Class<?> targetClass = bean.getClass();
            Field[] fields = targetClass.getDeclaredFields();

            for (Field f : fields) {
                map.put(f.getName(), f.get(bean));
            }
        } catch (Exception e) {
            throw new RuntimeException("Can't parse bean to map,message:" + e.getMessage());
        }
        return map;
    }
}
