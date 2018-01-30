# ContextCacher
A Simple Library to store objects into application context to pass between activities 
# Download
Download aar from release tab
with android studio import the library
File >  New > New Module > Import .JAR/.AAR 
# Usage
Create an Application class Extending `ContextCacheApplication`
make sure you add the name to application in manifest `code`
Then bind the Cache in your activity
You can set a value like so
```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ContextCache cache = new ContextCache();
        if(cache.bind(this)) {
            // this is a cache context
            cache.set("message_from_context","hi");
        } else {
            // the context is not from ContextCacheApplication
        }

    }
```
And to read it back in another activity/service
```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String message;
        ContextCache cache = new ContextCache();
        if(cache.bind(this)) {
            message = (String) cache.get("message_from_context");
        } else {
            // the context is not from ContextCacheApplication
            message = "no message";
        }

    }
```
