package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Chapter6 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6);

        final Button chapter6_1 = (Button) findViewById(R.id.chapter6_1);
        chapter6_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter6.this, PIC8259.class);
                startActivity(i);
            }
        });

        final Button chapter6_2 = (Button) findViewById(R.id.chapter6_2);
        chapter6_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter6.this, PPI8255.class);
                startActivity(i);
            }
        });

        final Button chapter6_3 = (Button) findViewById(R.id.chapter6_3);
        chapter6_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter6.this, PIT8254.class);
                startActivity(i);
            }
        });
        final Button chapter6_4 = (Button) findViewById(R.id.chapter6_4);
        chapter6_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter6.this, DMA.class);
                startActivity(i);
            }
        });
        final Button chapter6_5 = (Button) findViewById(R.id.chapter6_5);
        chapter6_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter6.this, USART8251.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chapter6, menu);
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
