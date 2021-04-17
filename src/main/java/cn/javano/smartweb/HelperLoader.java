package cn.javano.smartweb;

import cn.javano.smartweb.annotation.Controller;
import cn.javano.smartweb.helper.BeanHelper;
import cn.javano.smartweb.helper.ClassHelper;
import cn.javano.smartweb.helper.ControllerHelper;
import cn.javano.smartweb.helper.IocHelper;
import cn.javano.smartweb.util.ClassUtil;

/**
 * @author: wangjie19558
 * Date:2016/10/30
 * Description:加载对应的Helper 类
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };

        for (Class<?> clazz : classList) {
            ClassUtil.loadClass(clazz.getName(), true);
        }
    }
}
