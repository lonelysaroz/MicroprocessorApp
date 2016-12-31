package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Chapter2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);

        final Button chapter2_1 = (Button) findViewById(R.id.chapter2_1);
        chapter2_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter2.this,Introduction8085.class);
                startActivity(i);
            }
        });

        final Button chapter2_3 = (Button) findViewById(R.id.chapter2_3);
        chapter2_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter2.this,Architecture8085.class);
                startActivity(i);
            }
        });

        final Button chapter2_4 = (Button) findViewById(R.id.chapter2_4);
        chapter2_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter2.this,InstructionSets8085.class);
                startActivity(i);
            }
        });

        final Button chapter2_5 = (Button) findViewById(R.id.chapter2_5);
        chapter2_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter2.this, AddressingModes8085.class);
                startActivity(i);
            }
        });

        final Button chapter2_6 = (Button) findViewById(R.id.chapter2_6);
        chapter2_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter2.this, TimingDiagram8085.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chapter2, menu);
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
