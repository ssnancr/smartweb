package cn.javano.smartweb.helper;

import cn.javano.smartweb.ConfigConstant;
import cn.javano.smartweb.util.PropsUtil;

import java.util.Properties;

/**
 * @author: wangjie19558
 * Date:2016/10/27
 * Description:属性文件加载助手类
 */
public final class ConfigHelper {
    private static final Properties CONFGI_FILE_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     *
     * @return
     */
    public static String getJdbcDriver() {
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取JDBC URL
     *
     * @return
     */
    public static String getJdbcUrl() {
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.JDBC_URL);
    }

    /**
     * 获取JDBC 用户名
     *
     * @return
     */
    public static String getJdbcUsername() {
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取 JDBC 密码
     *
     * @return
     */
    public static String getJdbcPassword() {
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用的基础包名
     *
     * @return
     */
    public static String getAppBasePackage() {
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取应用JSP路径 （默认/WEB-INF/view/）
     *
     * @return
     */
    public static String getAppJspPath() {
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * 获取应用静态静态资源路径
     *
     * @return
     */
    public static String getAppAssetPath() {
        return CONFGI_FILE_PROPS.getProperty(ConfigConstant.APP_ASSET_PATH, "/asset/");
    }

}
