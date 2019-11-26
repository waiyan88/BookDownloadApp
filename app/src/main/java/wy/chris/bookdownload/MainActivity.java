package wy.chris.bookdownload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Add Spinner Data
        String[] arraySpinner = new String[] {
                "Agriculture", "Business"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        // Add Spinner Data


        // Add ListView Data
        ListView listView=findViewById(R.id.listView);
        listView.setAdapter();
        // Add ListView Data

    }
    private  class  GridAdapter extends BaseAdapter
    {
        ArrayList<BookModels> bookModels;

        public GridAdapter(ArrayList<BookModels> bookModels) {
            this.bookModels = bookModels;
    }

        @Override
        public int getCount() {
            return bookModels.size();
        }

        @Override
        public Object getItem(int i) {
            return bookModels.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater=getLayoutInflater();
            final BookModels movieModel=bookModels.get(i);
            View view1=inflater.inflate(R.layout.book,null);
            ImageView imageView=view1.findViewById(R.id.movieimage);
            TextView moviename=view1.findViewById(R.id.movienamegridview);
            Glide.with(getContext())
                    .load(movieModel.imagelink)
                    .into(imageView);
            moviename.setText(movieModel.moviename);
            return view1;
        }
    }
}
