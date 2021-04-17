package cn.javano.smartweb.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Collection;
import java.util.Map;

/**
 * @author: wangjie19558
 * Date:2016/10/29
 * Description:集合工具类，调用org.apache.commons隐藏实现细节
 */
public class CollectionUtil {

    /**
     * 判断集合是否为空
     *
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断集合是否不为空
     *
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return CollectionUtils.isNotEmpty(collection);
    }

    /**
     * 判断Map是否为空
     *
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断Map是否不为空
     *
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return MapUtils.isNotEmpty(map);
    }

    /**
     * 判断数组是否为空
     *
     * @param objects
     * @return
     */
    public static boolean isEmpty(Object[] objects) {
        return ArrayUtils.isEmpty(objects);
    }

    /**
     * 判读数组是否不为空
     *
     * @param objects
     * @return
     */
    public static boolean isNotEmpty(Object[] objects) {
        return ArrayUtils.isNotEmpty(objects);
    }
}
