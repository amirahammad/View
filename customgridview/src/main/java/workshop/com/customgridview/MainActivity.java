package workshop.com.customgridview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


       GridView gridView;

        static final String[] media = new String[] {
                "Linkedin", "Skype","Sound_cloud", "Twiter","Camera","WatsUp","Yahoo","Youtube","Windows" };

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            gridView = (GridView) findViewById(R.id.gridView1);

            gridView.setAdapter(new ImageAdapter(this,media));

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  Toast.makeText(
                            getApplicationContext(),
                            ((TextView) view.findViewById(R.id.grid_item_label))
                                    .getText(), Toast.LENGTH_SHORT).show();

                }
            });

        }

    }

