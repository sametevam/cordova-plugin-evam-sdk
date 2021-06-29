package org.apache.cordova.evamsdk;
import org.apache.cordova.CordovaPlugin;

// import org.apache.cordova.CallbackContext;
// import org.json.JSONArray;
import org.json.JSONException;
// import org.json.JSONObject;
import org.apache.cordova.LOG;
import org.json.JSONException;
// import java.util.Arrays;
// import android.app.Activity;

// import android.content.pm.PackageManager.NameNotFoundException;
// import android.content.pm.PackageManager;

public class EvamSdk extends CordovaPlugin {
    // @Override
    // public void initialize(String action) throws JSONException {
    public boolean execute(String action) throws JSONException {
        // if (action.equals("start")) {
          LOG.v("", "Executing haha ");
        // }
        //  try { 
          
        //     if (action.equals("start")) {
            
        //     }
             
        //     return true;
        //  } catch (NameNotFoundException e) {
        //     callbackContext.success("N/A");
        //     return true;
        // }
        return true;
    }
}
