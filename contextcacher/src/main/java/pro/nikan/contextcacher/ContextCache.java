package pro.nikan.contextcacher;

import android.content.Context;
import java.util.Map;

/**
 * Created by nikan on 1/30/18.
 */

public class ContextCache {
    ContextCacheApplication application;
    public boolean bind(Context context) {
        if(context.getApplicationContext() instanceof ContextCacheApplication) {
            application = (ContextCacheApplication) context.getApplicationContext();
            return true;
        } else {
            return false;
        }
    }
    public void set(Object key,Object value) {
        application.cache.put(key,value);
    }
    public void setAll(Map<Object,Object> map) {
        application.cache.putAll(map);
    }
    public Object get(Object key) {
        return application.cache.get(key);
    }
    public boolean has(Object key) {
        return application.cache.get(key) != null;
    }
}
