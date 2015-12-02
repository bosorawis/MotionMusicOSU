package complexability.motionmusic;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import complexability.motionmusic.R;

public class MainActivity extends AppCompatActivity {

    Hands rightHand = new Hands();
    Hands leftHand  = new Hands();
    int leftEffectCount;
    int rightEffectCount;
    String LeftInstrument;
    String RightInstrument;
    String LeftEffect_1, LeftEffect_2, LeftEffect_3;
    String RightEffect_1, RightEffect_2, RightEffect_3;
    private Spinner leftInstrumentSpinner;
    private Spinner rightInstrumentSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Log.d("Selected Item", "Left Instrument:" + LeftInstrument);
        Log.d("onCreate", "leftEffectCount:" + leftEffectCount);
        Log.d("onCreate", "rightEffectCount:" + rightEffectCount);
        /**********************************************************************************************
         *Create Left Instrument spinner
         ***********************************************************************************************/
        leftInstrumentSpinner = (Spinner) findViewById(R.id.left_instrument_spinner);
        ArrayAdapter<CharSequence> leftInstrumentAdapter = ArrayAdapter.createFromResource(this, R.array.Instruments_array, android.R.layout.simple_spinner_dropdown_item);
        leftInstrumentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        leftInstrumentSpinner.setAdapter(leftInstrumentAdapter);
        leftInstrumentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /*
            Event handler for the effect dropdown menus
             */
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //LeftInstrument =  (String) parent.getItemAtPosition(position);
                leftHand.changeInstrument((String) parent.getItemAtPosition(position));
                Log.d("Selected Item", "Left Instrument:" + leftHand.getInstrument());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        /**********************************************************************************************
         *Create Right Instrument spinner
         ***********************************************************************************************/
        rightInstrumentSpinner = (Spinner) findViewById(R.id.right_instrument_spinner);
        ArrayAdapter<CharSequence> rightInstrumentAdapter = ArrayAdapter.createFromResource(this, R.array.Instruments_array, android.R.layout.simple_spinner_dropdown_item);
        rightInstrumentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rightInstrumentSpinner.setAdapter(rightInstrumentAdapter);
        rightInstrumentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //RightInstrument =  (String) parent.getItemAtPosition(position);
                //Log.d("Selected Item", "Right Instrument:" + RightInstrument);
                rightHand.changeInstrument((String) parent.getItemAtPosition(position));
                Log.d("Selected Item", "Right Instrument:" + rightHand.getInstrument());
                /*
                if(RightInstrument!=null) {
                    rightHand.changeInstrument(RightInstrument);
                    Log.d("Selected Item", "Right Instrument:" + rightHand.getInstrument());
                }
                */
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //====================================================================================================================================================================
        /**********************************************************************************************
         *Left Create effect 1 spinner
         ***********************************************************************************************/
        Spinner leftEffectSpinner_1 = (Spinner) findViewById(R.id.left_effect_1_spinner);
        ArrayAdapter<CharSequence> leftEffectAdapter_1 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        leftEffectAdapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        leftEffectSpinner_1.setAdapter(leftEffectAdapter_1);
        leftEffectSpinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //LeftEffect_1 = (String) parent.getItemAtPosition(position);
                //Log.d("Selected Item", "Left Effect_1:" + LeftEffect_1);
               // if(LeftInstrument != null){
                leftHand.changeEffect((String) parent.getItemAtPosition(position), 1);
                Log.d("Selected Item", "Left Effect_1:" + leftHand.getEffect(1));

                //}
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /**********************************************************************************************
         *Left Create effect 2 spinner
         ***********************************************************************************************/
        Spinner leftEffectSpinner_2 = (Spinner) findViewById(R.id.left_effect_2_spinner);
        ArrayAdapter<CharSequence> leftEffectAdapter_2 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        leftEffectAdapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        leftEffectSpinner_2.setAdapter(leftEffectAdapter_2);
        leftEffectSpinner_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //LeftEffect_2 = (String) parent.getItemAtPosition(position);
                leftHand.changeEffect((String) parent.getItemAtPosition(position), 2);
                Log.d("Selected Item", "Left Effect_2:" + leftHand.getEffect(2));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /**********************************************************************************************
         *Left Create effect 3 spinner
         ***********************************************************************************************/
        Spinner leftEffectSpinner_3 = (Spinner) findViewById(R.id.left_effect_3_spinner);
        ArrayAdapter<CharSequence> leftEffectAdapter_3 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        leftEffectAdapter_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        leftEffectSpinner_3.setAdapter(leftEffectAdapter_3);
        leftEffectSpinner_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //LeftEffect_3= (String) parent.getItemAtPosition(position);
                //Log.d("Selected Item", "Left Effect_3:" + LeftEffect_3);
                leftHand.changeEffect((String) parent.getItemAtPosition(position), 3);
                Log.d("Selected Item", "Left Effect_3:" + leftHand.getEffect(3));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //====================================================================================================================================================================
        //====================================================================================================================================================================
        /**********************************************************************************************
         *Right Create effect 1 spinner
         ***********************************************************************************************/
        Spinner rightEffectSpinner_1 = (Spinner) findViewById(R.id.right_effect_1_spinner);
        ArrayAdapter<CharSequence> rightEffectAdapter_1 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        rightEffectAdapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rightEffectSpinner_1.setAdapter(rightEffectAdapter_1);
        rightEffectSpinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //RightEffect_1 = (String) parent.getItemAtPosition(position);
                //Log.d("Selected Item", "RightEffect_1:" + RightEffect_1);
                rightHand.changeEffect((String) parent.getItemAtPosition(position), 1);
                Log.d("Selected Item", "Right Effect_1:" + rightHand.getEffect(1));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /**********************************************************************************************
         *Right Create effect 2 spinner
         ***********************************************************************************************/
        Spinner rightEffectSpinner_2 = (Spinner) findViewById(R.id.right_effect_2_spinner);
        ArrayAdapter<CharSequence> rightEffectAdapter_2 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        rightEffectAdapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rightEffectSpinner_2.setAdapter(rightEffectAdapter_2);
        rightEffectSpinner_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //RightEffect_2 = (String) parent.getItemAtPosition(position);
                //Log.d("Selected Item", "RightEffect_2:" + RightEffect_2);
                rightHand.changeEffect((String) parent.getItemAtPosition(position), 2);
                Log.d("Selected Item", "Right Effect_2:" + rightHand.getEffect(2));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /**********************************************************************************************
         *Right Create effect 3 spinner
         ***********************************************************************************************/
        Spinner rightEffectSpinner_3 = (Spinner) findViewById(R.id.right_effect_3_spinner);
        ArrayAdapter<CharSequence> rightEffectAdapter_3 = ArrayAdapter.createFromResource(this, R.array.EffectName_array, android.R.layout.simple_spinner_dropdown_item);
        rightEffectAdapter_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rightEffectSpinner_3.setAdapter(rightEffectAdapter_3);
        rightEffectSpinner_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //RightEffect_3 = (String) parent.getItemAtPosition(position);
                //Log.d("Selected Item", "RightEffect_2:" + RightEffect_3);
                rightHand.changeEffect((String) parent.getItemAtPosition(position), 3);
                Log.d("Selected Item", "Right Effect_3:" + rightHand.getEffect(3));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //====================================================================================================================================================================
    }

    public void leftAddEffect(View view){
        Spinner effect_1 = (Spinner) findViewById(R.id.left_effect_1_spinner);
        Spinner effect_2 = (Spinner) findViewById(R.id.left_effect_2_spinner);
        Spinner effect_3 = (Spinner) findViewById(R.id.left_effect_3_spinner);
        leftHand.increaseEffectCount();

        switch(leftHand.getEffectCount()) {
            case 1:
                effect_1.setVisibility(view.VISIBLE);
                break;
            case 2:
                effect_2.setVisibility(view.VISIBLE);
                break;
            case 3:
                effect_3.setVisibility(view.VISIBLE);
                break;
        }

        //Log.d("hello", "leftEffectCount:" + leftEffectCount);
    }
    public void leftRemoveEffect(View view){
        Spinner effect_1 = (Spinner) findViewById(R.id.left_effect_1_spinner);
        Spinner effect_2 = (Spinner) findViewById(R.id.left_effect_2_spinner);
        Spinner effect_3 = (Spinner) findViewById(R.id.left_effect_3_spinner);
        switch(leftHand.getEffectCount()) {
            case 3:
                effect_3.setVisibility(view.GONE);
                break;
            case 2:
                effect_2.setVisibility(view.GONE);
                break;
            case 1:
                effect_1.setVisibility(view.GONE);
                break;
        }

        leftHand.decreaseEffectCount();
        //Log.d("hello", "leftEffectCount:" + leftEffectCount);
    }
    public void rightAddEffect(View view) {
        Spinner effect_1 = (Spinner) findViewById(R.id.right_effect_1_spinner);
        Spinner effect_2 = (Spinner) findViewById(R.id.right_effect_2_spinner);
        Spinner effect_3 = (Spinner) findViewById(R.id.right_effect_3_spinner);
        rightHand.increaseEffectCount();

        //if (rightHand.getEffectCount() < 3) {
        switch (rightHand.getEffectCount()) {
            case 1:
                effect_1.setVisibility(view.VISIBLE);
                break;
            case 2:
                effect_2.setVisibility(view.VISIBLE);
                break;
            case 3:
                effect_3.setVisibility(view.VISIBLE);
                break;
        }
        //}
        //Log.d("hello", "rightEffectCount:" + rightEffectCount);
    }
    public void rightRemoveEffect(View view){
        Spinner effect_1 = (Spinner) findViewById(R.id.right_effect_1_spinner);
        Spinner effect_2 = (Spinner) findViewById(R.id.right_effect_2_spinner);
        Spinner effect_3 = (Spinner) findViewById(R.id.right_effect_3_spinner);
        //if(rightEffectCount > 0) {
        switch(rightHand.getEffectCount()) {
            case 3:
                effect_3.setVisibility(view.GONE);
                break;
            case 2:
                effect_2.setVisibility(view.GONE);
                break;
            case 1:
                effect_1.setVisibility(view.GONE);
                break;
        }
        rightHand.decreaseEffectCount();
            //rightEffectCount--;

        //}
        //Log.d("hello", "leftEffectCount:" + leftEffectCount);
    }

    /*****************************************************
     * Save the instance of the data when changing orientation
     * @param outState
     ******************************************************/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("save state", "onSaveInstanceState");
        super.onSaveInstanceState(outState);
        outState.putInt("LEFT_EFFECT_COUNT", leftHand.getEffectCount());
        outState.putInt("RIGHT_EFFECT_COUNT", rightHand.getEffectCount());
    }
    /*****************************************************
     * Retrieve the saved state before recreating the activity
     ******************************************************/

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("Restore","onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        int testLeft;
        int testRight;
        testLeft = savedInstanceState.getInt("LEFT_EFFECT_COUNT");
        testRight = savedInstanceState.getInt("RIGHT_EFFECT_COUNT");

        Log.d("Restored","testLeft:" + testLeft);
        Log.d("Restored", "testRight:" + testRight);

        Spinner left_effect_1 = (Spinner) findViewById(R.id.left_effect_1_spinner);
        Spinner left_effect_2 = (Spinner) findViewById(R.id.left_effect_2_spinner);
        Spinner left_effect_3 = (Spinner) findViewById(R.id.left_effect_3_spinner);

        Spinner right_effect_1 = (Spinner) findViewById(R.id.right_effect_1_spinner);
        Spinner right_effect_2 = (Spinner) findViewById(R.id.right_effect_2_spinner);
        Spinner right_effect_3 = (Spinner) findViewById(R.id.right_effect_3_spinner);

        leftHand.setEffectCount(testLeft);
        rightHand.setEffectCount(testRight);
        for(int i = 1 ; i < testLeft+1 ; i++){
            switch (i) {
                case 1:
                    left_effect_1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    left_effect_2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    left_effect_3.setVisibility(View.VISIBLE);
                    break;
            }
        }
        for(int i = 1 ; i < testRight+1 ; i++){
            switch (i) {
                case 1:
                    right_effect_1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    right_effect_2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    right_effect_3.setVisibility(View.VISIBLE);
                    break;
            }
        }

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


