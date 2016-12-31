package np.com.sarozbista.microprocessorsandalp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class InstructionSets8085 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_sets8085);

        final Button chapter2_IS1 = (Button) findViewById(R.id.chapter2_IS1);
        chapter2_IS1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(InstructionSets8085.this,DataTransfer.class);
                startActivity(i);
            }
        });

        final Button chapter2_IS2 = (Button) findViewById(R.id.chapter2_IS2);
        chapter2_IS2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(InstructionSets8085.this, Arithematic.class);
                startActivity(i);
            }
        });

        final Button chapter2_IS3 = (Button) findViewById(R.id.chapter2_IS3);
        chapter2_IS3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(InstructionSets8085.this,Logical.class);
                startActivity(i);
            }
        });

        final Button chapter2_IS4 = (Button) findViewById(R.id.chapter2_IS4);
        chapter2_IS4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(InstructionSets8085.this, Branching.class);
                startActivity(i);
            }
        });

        final Button chapter2_IS5 = (Button) findViewById(R.id.chapter2_IS5);
        chapter2_IS5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(InstructionSets8085.this, MachineControl.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_instruction_sets8085, menu);
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
