package workshop.com.views;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridViewTask extends Activity implements AdapterView.OnItemClickListener {
 GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView =(GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new TaskAdapter(this));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(this,MyDialog.class);
        TaskAdapter.ViewHolder  holder= (TaskAdapter.ViewHolder) view.getTag();
        Country temp= (Country) holder.myCountry.getTag();
        i.putExtra("countryImage",temp.imageId);
        i.putExtra("countryName",temp.countryName);
        startActivity(i);
    }
}
