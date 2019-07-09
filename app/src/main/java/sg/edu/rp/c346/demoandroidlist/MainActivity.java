package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<AndroidVersion> AndroidVersion;
    ArrayAdapter<AndroidVersion> arrTp;
    CustomAdapter ca;
    ListView andVersion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        andVersion =findViewById(R.id.listViewMovie);
        AndroidVersion =new ArrayList<AndroidVersion>();
        AndroidVersion.add(new AndroidVersion("Pie","9.0"));
        AndroidVersion.add(new AndroidVersion("Oreo","8.0"));
        AndroidVersion.add(new AndroidVersion("Nougat","7.0"));
        AndroidVersion.add(new AndroidVersion("Marshmallow","6.0"));
        AndroidVersion.add(new AndroidVersion("Lollipop","5.0"));
        AndroidVersion.add(new AndroidVersion("KitKat","4.4"));
        AndroidVersion.add(new AndroidVersion("Jelly Bean","4.1"));

        ca=new CustomAdapter(this,R.layout.row, AndroidVersion);


        andVersion.setAdapter(ca);
    }
}
