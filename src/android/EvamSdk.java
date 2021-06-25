import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EvamSdk extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         try { 
             Log.e("calis");
            if (action.equals("start")) {
             Log.e("The Dark Side of the Force is a pathway to many abilities some consider to be unnatural.");
            }
             
            return true;
         } catch (NameNotFoundException e) {
            callbackContext.success("N/A");
            return true;
        }
    }
}