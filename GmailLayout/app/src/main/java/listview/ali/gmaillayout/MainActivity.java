package listview.ali.gmaillayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> title,subject;
    SimpleAdapter titleAdapter,subjectAdapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.list);

        title = new ArrayList<>();
        title.add("AliNoon@gmail.com");
        title.add("android@gmail.com");
        titleAdapter = new SimpleAdapter(this,R.layout.list_row,R.id.Title,title);
        lv.setAdapter(titleAdapter);

        subject = new ArrayList<>();
        subject.add("Google Security Alert");
        subject.add("Update Available");
        subjectAdapter = new SimpleAdapter(this,R.layout.list_row,R.id.Subject,subject);
        lv.setAdapter(subjectAdapter);


    }
}
