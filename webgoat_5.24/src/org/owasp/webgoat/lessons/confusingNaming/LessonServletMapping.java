package org.owasp.webgoat.lessons.confusingNaming;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**  
 * @Title:  LessonServletMapping.java   
 * @Package org.owasp.webgoat.lessons.confusingNaming   
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LessonServletMapping {

    String path();
    
    String method();
}
