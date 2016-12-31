package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Chapter5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5);

        final Button chapter5_1 = (Button) findViewById(R.id.chapter5_1);
        chapter5_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter5.this, IntroductionToInterrupts.class);
                startActivity(i);
            }
        });

        final Button chapter5_2 = (Button) findViewById(R.id.chapter5_2);
        chapter5_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter5.this, ClassificationOfInterrupts.class);
                startActivity(i);
            }
        });

        final Button chapter5_3 = (Button) findViewById(R.id.chapter5_3);
        chapter5_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter5.this, Interrupts8085.class);
                startActivity(i);
            }
        });
        final Button chapter5_4 = (Button) findViewById(R.id.chapter5_4);
        chapter5_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter5.this, Interrupts8086.class);
                startActivity(i);
            }
        });

        final Button chapter5_5 = (Button) findViewById(R.id.chapter5_5);
        chapter5_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter5.this, PredefinedInterrupts.class);
                startActivity(i);
            }
        });
        final Button chapter5_6 = (Button) findViewById(R.id.chapter5_6);
        chapter5_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter5.this, PrioritisingInterrupts.class);
                startActivity(i);
            }
        });
        final Button chapter5_7 = (Button) findViewById(R.id.chapter5_7);
        chapter5_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter5.this, InterruptsProcessing.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chapter5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
