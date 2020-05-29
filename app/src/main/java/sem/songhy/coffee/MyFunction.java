package sem.songhy.coffee;

import android.content.Context;
import android.widget.Toast;

import org.json.JSONObject;

public class MyFunction {
    private static MyFunction single_instance = null;

    // variable of type String

    // private constructor restricted to this class itself
    private MyFunction()
    {

    }

    // static method to create instance of Singleton class
    public static MyFunction getInstance()
    {
        if (single_instance == null)
            single_instance = new MyFunction();

        return single_instance;
    }

    public void TestSingle(Context context){
        Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
    }

    private JSONObject object ;

    public JSONObject getObject() {
        return object;
    }

    public void setObject(JSONObject object) {
        this.object = object;
    }
}
