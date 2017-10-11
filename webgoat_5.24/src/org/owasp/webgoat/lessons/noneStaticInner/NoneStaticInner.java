package org.owasp.webgoat.lessons.noneStaticInner;

import android.app.Activity;
import android.os.AsyncTask;



import java.lang.ref.WeakReference;

/**  
 * @Title:  NoneStaticInner.java   
 * @Package org.owasp.webgoat.lessons.noneStaticInner
 */
public class NoneStaticInner extends Activity {
    class MyTask extends AsyncTask<Void, Void, Void> {
        private final WeakReference<MainActivity> weakActivity;

        MyTask(MainActivity myActivity) {
            this.weakActivity = new WeakReference<>(myActivity);
        }

        @Override
        public Void doInBackground(Void... params) {
            return null;
        }
    }
}
