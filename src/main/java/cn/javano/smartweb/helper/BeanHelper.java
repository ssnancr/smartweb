package cn.javano.smartweb.helper;

import cn.javano.smartweb.util.ReflectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: wangjie19558
 * Date:2016/10/28
 * Description:bean 助手类
 */
public final class BeanHelper {
    private static final Logger logger = LoggerFactory.getLogger(BeanHelper.class);

    /**
     * 定义Bean 映射 （用于存放Bean 类与 Bean实例的映射关系）
     */
    private static Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> clazz : beanClassSet) {
            Object object = ReflectionUtil.newInstance(clazz);
            BEAN_MAP.put(clazz, object);
        }
    }

    /**
     * 获取bean 映射
     *
     * @return
     */
    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    /**
     * 获取bean实例
     *
     * @param clazz
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> clazz) {
        if (!BEAN_MAP.containsKey(clazz)) {
            logger.error("can not get bean by class :" + clazz);
            throw new RuntimeException("can not get bean by class :" + clazz);
        }
        return (T) BEAN_MAP.get(clazz);
    }
}
