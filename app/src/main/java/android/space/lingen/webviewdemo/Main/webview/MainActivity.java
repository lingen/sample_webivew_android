package android.space.lingen.webviewdemo.Main.webview;

import android.content.Intent;
import android.os.Bundle;
import android.space.lingen.webviewdemo.Main.webview.activity.CrosswalkWebViewActivity;
import android.space.lingen.webviewdemo.Main.webview.activity.OrignalWebViewActivity;
import android.space.lingen.webviewdemo.Main.webview.activity.X5WebViewActivity;
import android.space.lingen.webviewdemo.R;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.zip.CRC32;

/**
 * Created by lingen on 5/15/16.
 */
public class MainActivity extends AppCompatActivity {


    //原生浏览器WEBVIEW
    private Button orignalWebViewButton;

    //X5内核WEBVIEW
    private Button x5WebViewButton;

    //crosswalk WebView
    private Button crosswalkButton;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        findView();
        registerListener();

    }


    private void findView(){
        this.orignalWebViewButton = (Button) findViewById(R.id.button_original);

        this.x5WebViewButton = (Button) findViewById(R.id.button_x5);

        this.crosswalkButton = (Button) findViewById(R.id.button_crosswalk);


    }

    private void registerListener(){
        this.orignalWebViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getBaseContext(),OrignalWebViewActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        this.x5WebViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getBaseContext(),X5WebViewActivity.class);
                MainActivity.this.startActivity(intent);

            }
        });

        this.crosswalkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getBaseContext(),CrosswalkWebViewActivity.class);
                MainActivity.this.startActivity(intent);

            }
        });


    }
}
