package org.owasp.webgoat.lessons.PendingIntent;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**  
 * @Title:  PendingIntent.java   
 * @Package org.owasp.webgoat.lessons.PendingIntent   
 */
public class PendingIntentTest extends AppCompatActivity {
	
    public void test1()
    {
        PendingIntent.getActivity(this,0,new Intent("bigbaldy.ABC"),0);

        ClipboardManager clipboardManager=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip1 = ClipData.newPlainText("simple text", "Hello, World!");
        clipboardManager.setPrimaryClip(clip1);

        WebView webView1 = (WebView)findViewById(0);
        webView1.loadUrl("http://www.baidu.com");
    }
    
}
