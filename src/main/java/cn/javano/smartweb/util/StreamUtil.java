package cn.javano.smartweb.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author: wangjie19558
 * Date:2016/10/30
 * Description:流操作工具类
 */
public final class StreamUtil {
    private static final Logger logger = LoggerFactory.getLogger(StreamUtil.class);

    /**
     * 从流中获取字符串
     *
     * @param inputStream
     * @return
     */
    public static String getString(InputStream inputStream) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (IOException e) {
            logger.error("get String fail", e);
            throw new RuntimeException(e);
        }
        return stringBuffer.toString();
    }
}
