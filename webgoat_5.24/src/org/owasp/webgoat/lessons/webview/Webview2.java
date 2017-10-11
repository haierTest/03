package org.owasp.webgoat.lessons.webview;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.webkit.WebView;

/**  
 * @Title:  Webview2.java   
 * @Package org.owasp.webgoat.lessons.webview   
 */
public class Webview2 extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        WebView webView1 = (WebView) findViewById(R.id.webView1);
        webView1.getSettings().setSavePassword(true);
        webView1.loadUrl("http://www.baidu.com");
    }
    
}
