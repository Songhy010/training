package sem.songhy.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class ActivityLogin extends AppCompatActivity {

    private StaticFunction obj  = new StaticFunction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        try{
            final JSONObject object = MyFunction.getInstance().getObject();
            final JSONObject objMenu = object.getJSONObject("menu");

            final JSONArray arr = objMenu.getJSONArray("items");

            for(int i =0;i<arr.length();i++){
                Toast.makeText(this,arr.getJSONObject(i).getString("id"), Toast.LENGTH_SHORT).show();
            }


        }catch (Exception e){
            Log.e("Err",e.getMessage()+"");
        }
    }
}
