package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Note extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        final Button chapter1 = (Button) findViewById(R.id.chapter1);
        chapter1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Note.this, Chapter1.class);
                startActivity(i);
            }
        });

        final Button chapter2 = (Button) findViewById(R.id.chapter2);
        chapter2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Note.this, Chapter2.class);
                startActivity(i);
            }
        });
        final Button chapter3 = (Button) findViewById(R.id.chapter3);
        chapter3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Note.this, Chapter3.class);
                startActivity(i);
            }
        });
        final Button chapter4 = (Button) findViewById(R.id.chapter4);
        chapter4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Note.this, Chapter4.class);
                startActivity(i);
            }
        });
        final Button chapter5 = (Button) findViewById(R.id.chapter5);
        chapter5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Note.this, Chapter5.class);
                startActivity(i);
            }
        });
        final Button chapter6 = (Button) findViewById(R.id.chapter6);
        chapter6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Note.this, Chapter6.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_note, menu);
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
