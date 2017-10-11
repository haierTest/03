package org.owasp.webgoat.lessons.ssl;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**  
 * @Title:  SSLParser.java   
 * @Package org.owasp.webgoat.lessonss.ssl   
 */
public class SSLParser {
    WebView webView;

    public void test() {
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
    }
}