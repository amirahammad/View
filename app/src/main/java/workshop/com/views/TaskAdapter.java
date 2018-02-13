package workshop.com.views;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Freeware Sys on 13/02/2018.
 */

public class TaskAdapter extends BaseAdapter {
    ArrayList <Country> list;
    Context context;
    TaskAdapter(Context c){
        this.context=c;
        list=new ArrayList<>();
       String[]items={"Kingdom","Austrialia","Belgium","Canada","The_Peaples","Austria","Israel","Antigue","Sao_Tome"};
        int[] countryImages ={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9};
        for(int i=0;i<10;i++)
        {
            Country tempCountry=new Country(items[i],countryImages[i]);
            list.add(tempCountry);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position)
    {
        return list.get(position);
    }
    class ViewHolder{
        ImageView myCountry;
        ViewHolder(View v) {
            myCountry = (ImageView) v.findViewById(R.id.imageView);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder= null;
        View row=convertView;

        if (row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);
            holder=new ViewHolder(row);
            row.setTag(holder);

        }
        else
        {
            holder= (ViewHolder) row.getTag();
        }
        Country temp=list.get(position);
        holder.myCountry.setImageResource(temp.imageId);
        holder.myCountry.setTag(temp);
        return row;
    }
}

