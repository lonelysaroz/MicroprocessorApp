package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Tutorials extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        final Button chapterT_1 = (Button) findViewById(R.id.chapterT_1);
        chapterT_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial1.class);
                startActivity(i);
            }
        });
        final Button chapterT_2 = (Button) findViewById(R.id.chapterT_2);
        chapterT_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial2.class);
                startActivity(i);
            }
        });
        final Button chapterT_3 = (Button) findViewById(R.id.chapterT_3);
        chapterT_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial3.class);
                startActivity(i);
            }
        });
        final Button chapterT_4 = (Button) findViewById(R.id.chapterT_4);
        chapterT_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial4.class);
                startActivity(i);
            }
        });
        final Button chapterT_5 = (Button) findViewById(R.id.chapterT_5);
        chapterT_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial5.class);
                startActivity(i);
            }
        });
        final Button chapterT_6 = (Button) findViewById(R.id.chapterT_6);
        chapterT_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial6.class);
                startActivity(i);
            }
        });
        final Button chapterT_7 = (Button) findViewById(R.id.chapterT_7);
        chapterT_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial7.class);
                startActivity(i);
            }
        });
        final Button chapterT_8 = (Button) findViewById(R.id.chapterT_8);
        chapterT_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Tutorials.this, Tutorial8.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tutorials, menu);
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
