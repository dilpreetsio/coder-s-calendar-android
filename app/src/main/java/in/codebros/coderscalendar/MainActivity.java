package in.codebros.coderscalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import in.codebros.scraper.*;
import in.codebros.entity.*;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        Scrape sol = new Scrape();
        ArrayList<Data> data = new ArrayList<>();
        data = sol.crawl();
        //data = sol.fData;
        Data d ;
        Iterator i = data.iterator();
        String text ="";
        while(i.hasNext() && !i.equals(null))
        {
            d = (Data)i.next();
            text += d.getName()+"\n";
        }
        data = sol.fData;
        i = data.iterator();
        while(i.hasNext() && !i.equals(null))
        {
            d = (Data)i.next();
            text += d.getName()+"\n";
        }
        textView.setText(text);
    }
}
