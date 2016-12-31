package np.com.sarozbista.microprocessorsandalp;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.webkit.WebView;


public class Splash extends Activity {

    protected boolean _active = true;
    protected int _splashTime = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(100);
                        if (_active) {
                            waited += 100;
                        }
                    }
                }
                catch (Exception e) {

                }
                finally {

                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }
            };
        };
        splashThread.start();
    }
}
