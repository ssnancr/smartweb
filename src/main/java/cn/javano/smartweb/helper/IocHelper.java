package cn.javano.smartweb.helper;

import cn.javano.smartweb.annotation.Inject;
import cn.javano.smartweb.util.CollectionUtil;
import cn.javano.smartweb.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author: wangjie19558
 * Date:2016/10/29
 * Description:依赖注入助手类
 */
public final class IocHelper {

    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] beanFields = beanClass.getDeclaredFields();
                if (CollectionUtil.isNotEmpty(beanFields)) {
                    for (Field field : beanFields) {
                        if (field.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = field.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, field, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
