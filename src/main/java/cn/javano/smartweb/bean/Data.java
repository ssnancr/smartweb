package cn.javano.smartweb.bean;

/**
 * @author: wangjie19558
 * Date:2016/10/30
 * Description:返回数据对象
 */
public class Data {
    /**
     * 返回的模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }
}
