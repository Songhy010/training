package sem.songhy.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import org.json.JSONObject;


public class ActivityMain extends AppCompatActivity {

    private final String data = "{\"menu\": {\n" +
            "    \"header\": \"SVG Viewer\",\n" +
            "    \"items\": [\n" +
            "        {\"id\": \"Open\"},\n" +
            "        {\"id\": \"OpenNew\", \"label\": \"Open New\"},\n" +
            "        null,\n" +
            "        {\"id\": \"ZoomIn\", \"label\": \"Zoom In\"},\n" +
            "        {\"id\": \"ZoomOut\", \"label\": \"Zoom Out\"},\n" +
            "        {\"id\": \"OriginalView\", \"label\": \"Original View\"},\n" +
            "        null,\n" +
            "        {\"id\": \"Quality\"},\n" +
            "        {\"id\": \"Pause\"},\n" +
            "        {\"id\": \"Mute\"},\n" +
            "        null,\n" +
            "        {\"id\": \"Find\", \"label\": \"Find...\"},\n" +
            "        {\"id\": \"FindAgain\", \"label\": \"Find Again\"},\n" +
            "        {\"id\": \"Copy\"},\n" +
            "        {\"id\": \"CopyAgain\", \"label\": \"Copy Again\"},\n" +
            "        {\"id\": \"CopySVG\", \"label\": \"Copy SVG\"},\n" +
            "        {\"id\": \"ViewSVG\", \"label\": \"View SVG\"},\n" +
            "        {\"id\": \"ViewSource\", \"label\": \"View Source\"},\n" +
            "        {\"id\": \"SaveAs\", \"label\": \"Save As\"},\n" +
            "        null,\n" +
            "        {\"id\": \"Help\"},\n" +
            "        {\"id\": \"About\", \"label\": \"About Adobe CVG Viewer...\"}\n" +
            "    ]\n" +
            "}}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        initAppUpdate();
    }

    private void initAppUpdate() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                try{
                    Intent intent = new Intent(ActivityMain.this,ActivityLogin.class);
                    final JSONObject objData = new JSONObject(data);
                    MyFunction.getInstance().setObject(objData);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                    Log.e("Err",e.getMessage()+"");
                }
            }
        }, 3000);// 1000 = 1s
    }
}