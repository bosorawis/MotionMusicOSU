package complexability.motionmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class settingsActivity extends AppCompatActivity {
    private RadioGroup radioGroup_mode;
    private RadioButton radioButton_music, radioButton_soundFX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        radioGroup_mode = (RadioGroup)findViewById(R.id.mode_radio_group);
        radioButton_music = (RadioButton)findViewById(R.id.radio_button_select_music);
        radioButton_soundFX = (RadioButton)findViewById(R.id.radio_button_select_soundFX);
    }
}
