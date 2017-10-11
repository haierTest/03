package org.owasp.webgoat.lessons.webview;

import android.webkit.WebView;

/**  
 * @Title:  Webview1.java   
 * @Package org.owasp.webgoat.lessons.webview   
 */
public class Webview1 {
    // 2 bugs
    private String pattern = "file://.*";

    public void test(WebView webView) {
        webView.loadUrl(pattern);
        webView.postUrl(pattern, null);
    }
}