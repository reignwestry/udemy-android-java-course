package firstlook.reignwestry.udemy.firstlook;

import android.os.Bundle;

import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;

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

        mButton = (Button) findViewById(R.id.mButton);
        mTextView = (TextView) findViewById(R.id.mTextView);

        //change the title of the button
        mButton.setText(R.string.button_name);

        //Best way to create a change -- add a event listener
        mButton.setOnClickListener(new View.OnClickListener(
                @Override
                public void onClick(View v){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(R.string.show_text);

                }
        ));


    }

//    public void ShowMe(View view){
//        mTextView.setVisibility(View.VISIBLE); //changes visibility
//        mTextView.setText(R.string.show_text); //changes textView
//    }
}