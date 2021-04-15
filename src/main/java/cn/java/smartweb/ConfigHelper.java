package cn.java.smartweb;

import cn.java.smartweb.util.PropsUtil;

import java.util.Properties;

/**
 * @author: wangjie19558
 * Date:2016/10/27
 * Description:属性文件加载助手类
 */
public class ConfigHelper {
    private static final Properties CONFGI_FILE_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     * @return
     */
    public static String getJdbcDriver(){
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.JDBC_DRIVER);
    }
}
