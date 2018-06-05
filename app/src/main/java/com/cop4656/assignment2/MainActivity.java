package com.cop4656.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int currentImage = R.drawable.nole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //register the button with the click listener
        final Button clickButton = findViewById(R.id.button);

        OnClickListener changeButtonListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Determine what the present view is
                ImageView imageView = findViewById(R.id.imageView);

                int noleImage = R.drawable.nole;
                int gatorImage = R.drawable.gator;

                //button starts with "show me a gator" text
                if (currentImage == noleImage)
                {
                    imageView.setImageResource(R.drawable.gator);
                    clickButton.setText(R.string.ShowMeANole);
                    currentImage = gatorImage;
                }
                else
                {
                    imageView.setImageResource(R.drawable.nole);
                    clickButton.setText(R.string.ShowMeAGator);
                    currentImage = noleImage;
                }

            }
        };

        clickButton.setOnClickListener(changeButtonListener);
    }

}
