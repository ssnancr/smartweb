package cn.java.smartweb.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: wangjie19558
 * Date:2016/10/27
 * Description:属性文件加载工具类
 */
public class PropsUtil {
    private static final Logger logger = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     * @param filename
     * @return 返回properties 文件
     */
    public static Properties loadProps(String filename) {
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
            if (inputStream == null){
                throw  new FileNotFoundException(filename + "file not fount exception");
            }
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
           logger.error("load file exception",e);
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error("close inputstrem excption",e);
                }
            }
        }
        return properties;
    }
}
