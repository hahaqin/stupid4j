package org.stupid4j.web.util;

/**
 * 转型操作工具类
 * Created by yangsiqin on 2017/7/3.
 */
public class CastUtil {

    /**
     * 转为String型
     * @param object
     * @return
     */
    public static String castString(Object object){
        return CastUtil.castString(object, "");
    }

    /**
     * 转为String型(提供默认值)
     * @param object
     * @param defaultValue
     * @return
     */
    public static String castString(Object object, String defaultValue) {
        return object != null ? String.valueOf(object) : defaultValue;
    }

    /**
     * 转为double型
     * @param object
     * @return
     */
    public static double castDouble(Object object){
        return CastUtil.castDouble(object, 0);
    }

    /**
     * 转为double型(提供默认值)
     * @param object
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object object, double defaultValue) {
        double doubleValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)){
                try {
                    doubleValue = Double.parseDouble(strValue);
                }catch (NumberFormatException e){
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为long型
     * @param object
     * @return
     */
    public static long castLong(Object object){
        return CastUtil.castLong(object, 0);
    }

    /**
     * 转为long型(提供默认值)
     * @param object
     * @param defaultValue
     * @return
     */
    public static long castLong(Object object, long defaultValue) {
        long longValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)){
                try {
                    longValue = Long.parseLong(strValue);
                }catch (NumberFormatException e){
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int型
     * @param object
     * @return
     */
    public static int castInt(Object object){
        return CastUtil.castInt(object, 0);
    }

    /**
     * 转为int型(提供默认值)
     * @param object
     * @param defaultValue
     * @return
     */
    public static int castInt(Object object, int defaultValue) {
        int intValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)){
                try {
                    intValue = Integer.parseInt(strValue);
                }catch (NumberFormatException e){
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean型
     * @param object
     * @return
     */
    public static boolean castBoolean(Object object){
        return CastUtil.castBoolean(object, false);
    }

    /**
     * 转为int型(提供默认值)
     * @param object
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object object, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (object != null) {
            booleanValue = Boolean.parseBoolean(castString(object));
        }
        return booleanValue;
    }
}
