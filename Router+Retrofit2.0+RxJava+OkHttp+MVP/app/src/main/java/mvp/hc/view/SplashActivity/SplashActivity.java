package mvp.hc.view.SplashActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import hc.com.libs_base.ARouterManager;

/**
 * Created by Administrator on 2018/4/3.
 * developers:hc
 */
@Route(path = ARouterManager.APP_SPLASH_ACTIVITY)
public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
