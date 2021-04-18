package cn.javano.smartweb.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangjie19558
 * Date:2016/10/30
 * Description:返回试图对象
 */
public class View {
    /**
     * 返回视图路径
     */
    private String path;
    /**
     * 返回模型数据
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        this.model = new HashMap<String, Object>();
    }

    public View(String path, Map<String, Object> model) {
        this.path = path;
        this.model = model;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    public View addModel(String key, Object object) {
        model.put(key, object);
        return this;
    }
}
