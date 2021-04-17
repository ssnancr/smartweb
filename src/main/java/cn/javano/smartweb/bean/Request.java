package cn.javano.smartweb.bean;

/**
 * @author: wangjie19558
 * Date:2016/10/29
 * Description:封装请求信息
 */
public class Request {
    /**
     * 请求方法
     */
    private String requestMethod;
    /**
     * 请求路径
     */
    private String RequestPath;

    public Request(String requestMethod, String requestPath) {
        this.requestMethod = requestMethod;
        RequestPath = requestPath;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestPath() {
        return RequestPath;
    }

    public void setRequestPath(String requestPath) {
        RequestPath = requestPath;
    }
}
