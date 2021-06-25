import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public class EvamSdk extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         try { 
          
            if (action.equals("start")) {
            
            }
             
            return true;
         } catch (NameNotFoundException e) {
            callbackContext.success("N/A");
            return true;
        }
    }
}
