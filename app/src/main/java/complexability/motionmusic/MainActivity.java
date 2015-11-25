package complexability.motionmusic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import complexability.motionmusic.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //Create Instrument spinner
        Spinner instrumentSpinner = (Spinner) findViewById(R.id.intrument_spinner);
        ArrayAdapter<CharSequence> instrumentAdapter = ArrayAdapter.createFromResource(this, R.array.Instruments_array, android.R.layout.simple_spinner_dropdown_item);
        instrumentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        instrumentSpinner.setAdapter(instrumentAdapter);

        //Create mode spinner
        Spinner modeSpinner = (Spinner) findViewById(R.id.mode_spinner);
        ArrayAdapter<CharSequence> modeAdapter = ArrayAdapter.createFromResource(this, R.array.Modes_array, android.R.layout.simple_spinner_dropdown_item);
        modeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        modeSpinner.setAdapter(modeAdapter);

        //Create effect 1 spinner
        Spinner effectSpinner_1 = (Spinner) findViewById(R.id.effect_1_spinner);
        ArrayAdapter<CharSequence> effectAdapter_1 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        effectAdapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        effectSpinner_1.setAdapter(effectAdapter_1);

        //Create effect 2 spinner
        Spinner effectSpinner_2 = (Spinner) findViewById(R.id.effect_2_spinner);
        ArrayAdapter<CharSequence> effectAdapter_2 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        effectAdapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        effectSpinner_2.setAdapter(effectAdapter_2);

        //Create effect 3 spinner
        Spinner effectSpinner_3 = (Spinner) findViewById(R.id.effect_3_spinner);
        ArrayAdapter<CharSequence> effectAdapter_3 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        effectAdapter_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        effectSpinner_3.setAdapter(effectAdapter_3);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
