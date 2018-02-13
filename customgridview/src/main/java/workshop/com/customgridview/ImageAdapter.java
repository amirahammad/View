package workshop.com.customgridview;

/**
 * Created by Freeware Sys on 13/02/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class ImageAdapter extends BaseAdapter {
    private Context context;
    private final String[] Values;

    public ImageAdapter(Context context, String[] Values) {
        this.context = context;
        this.Values = Values;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);


            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.single_row, null);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_label);
            textView.setText(Values[position]);

            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            String item = Values[position];

             if ( item.equals("Linkedin")) {
                imageView.setImageResource(R.drawable.linkedin);
            } else if (item.equals("Skype")) {
                imageView.setImageResource(R.drawable.skype);
            } else if (item.equals("Sound_cloud")) {
                imageView.setImageResource(R.drawable.sound_cloud);
            } else if(item.equals("Twiter"))
            {
                imageView.setImageResource(R.drawable.twiter);
            }
            else if(item.equals("Camera"))
            {
                imageView.setImageResource(R.drawable.camera);
            }
            else if(item.equals("WatsUp"))
            {
                imageView.setImageResource(R.drawable.watesup);
            }
            else if(item.equals("Yahoo"))
            {
                imageView.setImageResource(R.drawable.yahoo);
            }
            else if(item.equals("Youtube"))
            {
                imageView.setImageResource(R.drawable.youtube);
            }
            else
            {
                imageView.setImageResource(R.drawable.windows);
            }


        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return Values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}

