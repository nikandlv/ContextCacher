package pro.nikan.contextcacher;

import android.app.Application;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikan on 1/30/18.
 */

public class ContextCacheApplication extends Application {
    public HashMap<Object,Object> cache = new HashMap<>();
}
