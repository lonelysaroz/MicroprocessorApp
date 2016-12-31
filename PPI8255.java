package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class PPI8255 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppi8255);

        final Button chapter6_PPI1 = (Button) findViewById(R.id.chapter6_PPI1);
        chapter6_PPI1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(PPI8255.this,BlockDiagram8255.class);
                startActivity(i);
            }
        });

        final Button chapter6_PPI2 = (Button) findViewById(R.id.chapter6_PPI2);
        chapter6_PPI2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(PPI8255.this,ControlWord8255.class);
                startActivity(i);
            }
        });
        final Button chapter6_PPI3 = (Button) findViewById(R.id.chapter6_PPI3);
        chapter6_PPI3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(PPI8255.this, Modes8255.class);
                startActivity(i);
            }
        });
        final Button chapter6_PPI4 = (Button) findViewById(R.id.chapter6_PPI4);
        chapter6_PPI4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(PPI8255.this, Programming8255.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ppi8255, menu);
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
