package org.owasp.webgoat.lessons.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Log;

/**  
 * @Title:  UseRealseBitmap.java   
 * @Package org.owasp.webgoat.lessons.bitmap   
 */
public class UseRealseBitmap {
    private static final String TAG = "Test";

    public void addWatermark(final byte[] data) {
        final Bitmap bmp = loadBitmap(data);
        if (bmp != null) {
            final int width = bmp.getWidth();
            for (int i = 0; i < width; i++) {
                bmp.setPixel(i, i, Color.argb(255, 0, 0, 0));
            }
        }
    }

    private Bitmap loadBitmap(byte[] data) {
        final Bitmap bmp = BitmapFactory.decodeByteArray(data, 0, data.length);
        if (bmp == null) {
            Log.d(TAG, "Was not able to decode an image");
        }

        final int width = bmp.getWidth();
        final int height = bmp.getHeight();
        if (width <= 3 || height <= 3) {
            bmp.recycle();
        }
        return bmp;
    }
}

