package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Chapter3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter3);

        final Button chapter3_2 = (Button) findViewById(R.id.chapter3_2);
        chapter3_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this, Architecture8086.class);
                startActivity(i);
            }
        });

        final Button chapter3_3 = (Button) findViewById(R.id.chapter3_3);
        chapter3_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this,AddressingModes8086.class);
                startActivity(i);
            }
        });

        final Button chapter3_4 = (Button) findViewById(R.id.chapter3_4);
        chapter3_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this,InstructionSets8086.class);
                startActivity(i);
            }
        });

        final Button chapter3_5 = (Button) findViewById(R.id.chapter3_5);
        chapter3_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this, ModesOfOperation8086.class);
                startActivity(i);
            }
        });

        final Button chapter3_6 = (Button) findViewById(R.id.chapter3_6);
        chapter3_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this, TimingDiagram8086.class);
                startActivity(i);
            }
        });

        final Button chapter3_7 = (Button) findViewById(R.id.chapter3_7);
        chapter3_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this,ALPdevelopmentTools.class);
                startActivity(i);
            }
        });

        final Button chapter3_8 = (Button) findViewById(R.id.chapter3_8);
        chapter3_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this, TypesOfAssembler.class);
                startActivity(i);
            }
        });

        final Button chapter3_9 = (Button) findViewById(R.id.chapter3_9);
        chapter3_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this, AssemblerDirectives8086.class);
                startActivity(i);
            }
        });

        final Button chapter3_10 = (Button) findViewById(R.id.chapter3_10);
        chapter3_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(Chapter3.this, ModularProgramming.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chapter3, menu);
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
