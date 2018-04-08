package mvp.hc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import hc.com.home.R;
import hc.com.libs_base.ARouterManager;

@Route(path = ARouterManager.HOME_MAIN_ACTIVITY)
public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
