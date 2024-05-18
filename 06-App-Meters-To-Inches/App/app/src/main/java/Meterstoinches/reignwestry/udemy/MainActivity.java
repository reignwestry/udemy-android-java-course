package Meterstoinches.reignwestry.udemy;

import static Meterstoinches.reignwestry.udemy.R.id.convertButtonID;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    /*
        1m = 39.3701in
     */

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);
        convertButton =  (Button) findViewById(convertButtonID);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversion Logic
                double multiplier = 39.37;
                double result = 0.0;




                //if input is blank
                if(enterMeters.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                    resultTextView.setTextSize(30);
                } else {

                    //note Double.parseDouble() === converts a double to a string
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue * multiplier;

                    //note round up to 2 decimal places only
                    //note (C++) " %.2f " locks & rounds the string to only 2 decimal places
                    resultTextView.setText(String.format("%.2f", result) + " inches");
                    resultTextView.setTextColor(Color.DKGRAY); // changes color
                }

                //note Double.toString() === converts to string
//                resultTextView.setText(Double.toString(result) + " inches");

                //todo CONVERT TO FEET AND INCHES
//                int feetAmt = 0;
//                int inchesAmt = 0;
//
//                int feetAmt = result / 12;
//                System.out.println(feetAmt);
            }
        });
    }
}

