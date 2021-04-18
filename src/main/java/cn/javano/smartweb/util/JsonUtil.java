package cn.javano.smartweb.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: wangjie19558
 * Date:2016/10/30
 * Description: json 工具类
 */
public final class JsonUtil {
    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 将bean 转化成JSON
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.error("bean to json fail", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将json 转化 POJO
     *
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        T pojo;
        try {
            pojo = OBJECT_MAPPER.readValue(json, clazz);
        } catch (Exception e) {
            logger.error("json to bean fail", e);
            throw new RuntimeException(e);
        }
        return pojo;
    }
}
