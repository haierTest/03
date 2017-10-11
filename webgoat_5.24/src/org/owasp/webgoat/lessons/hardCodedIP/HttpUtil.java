package org.owasp.webgoat.lessons.hardCodedIP;

/**  
 * @Title:  HttpUtil.java   
 * @Package org.owasp.webgoat.lessons   
 */
public class HttpUtil {
	
    public static String getNetProxy(String apn) {
           String ret = "";

                if ("cmwap".equals(apn) || "uniwap".equals(apn) || "3gwap".equals(apn)) {
                    ret = "10.0.0.189";
                } else if ("ctwap".equals(apn)) {
                	ret = "10.0.0.190";
                }
            
        
        return ret;
    }

}
