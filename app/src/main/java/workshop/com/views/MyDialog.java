package workshop.com.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);
        Intent intent=getIntent();
        if(intent!=null)
        {
            int imageId=intent.getIntExtra("countryImage",R.drawable.image1);
            String countryName= intent.getStringExtra("countryName");
            ImageView image= (ImageView) findViewById(R.id.myImageView);
            image.setImageResource(imageId);
            TextView text= (TextView) findViewById(R.id.dailogText);
            text.setText("this flag belong to"+countryName);


        }
    }
    public  void closeDailog(View v){
        finish();
    }
}
