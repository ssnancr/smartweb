package cn.javano.smartweb.bean;

import java.util.Map;

/**
 * @author: wangjie19558
 * Date:2016/10/30
 * Description:请求参数对象
 */
public class Param {

    private Map<String, Object> paramMap = null;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 获取所有字段信息
     *
     * @return
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
