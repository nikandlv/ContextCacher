package pro.nikan.contextcacherexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pro.nikan.contextcacher.ContextCache;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContextCache cache = new ContextCache();
        if(cache.bind(this)) {
            // loaded
            cache.set("message_from_context","hi");
            startActivity(new Intent(this,MessageReader.class));
        } else {
            // the context is not from ContextCacheApplication
        }

    }
}
