package android.space.lingen.webviewdemo.Main.webview.activity;

import android.space.lingen.webviewdemo.Main.BaseFragmentActivity;
import android.space.lingen.webviewdemo.Main.webview.fragment.CrosswalkWebViewFragment;
import android.support.v4.app.Fragment;

/**
 * Created by lingen on 5/15/16.
 */
public class CrosswalkWebViewActivity extends BaseFragmentActivity {
    @Override
    public Fragment getFragment() {
        return new CrosswalkWebViewFragment();
    }
}
