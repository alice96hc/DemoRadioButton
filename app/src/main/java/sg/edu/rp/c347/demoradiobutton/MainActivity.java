package sg.edu.rp.c347.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View arg0){
                    //get the radioGroup obj
                    RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);

                    //get the id of the selected radio button in the RadioGroup
                    int selectedButtonId = rg.getCheckedRadioButtonId();

                    //get the radio button obj from the Id we had gotten above
                    RadioButton rb = (RadioButton)findViewById(selectedButtonId);

                    // show a toast that display the text on the selected radio button
                    Toast.makeText(getBaseContext(),rb.getText(),
                            Toast.LENGTH_LONG).show();
                }});
    }
}