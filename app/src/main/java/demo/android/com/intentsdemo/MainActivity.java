package demo.android.com.intentsdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button startActivityButton;
    Button getPhotosButton;
    Button openMapsButton;
    EditText editText;
    ImageView imageView;

    public static final String EXTRA_MESSAGE = "extraMessage";
    public static final int SELECT_IMAGE = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 10/24/15 Bind the variables to views in the layout

        startActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 10/24/15 Insert code here 
            }
        });

        getPhotosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                // TODO: 10/24/15 Start the activity
            }
        });

        openMapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=34.99,-106.61(Treasure)"));
                startActivity(intent);
            }
        });

        // TODO: 10/24/15 Fully implement a button that sets an alarm for any time (use this resource for help: http://developer.android.com/guide/components/intents-common.html)

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (requestCode == SELECT_IMAGE) {
                Uri selectedImageUri = data.getData();
                // TODO: 10/24/15 Something 
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
