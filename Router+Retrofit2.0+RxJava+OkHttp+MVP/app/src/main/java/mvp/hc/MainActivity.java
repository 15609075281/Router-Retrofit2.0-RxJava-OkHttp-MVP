package mvp.hc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import hc.com.libs_base.ARouterManager;

@Route(path =ARouterManager.APP_MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  应用内简单的跳转(通过URL跳转在'进阶用法'中)
                ARouter.getInstance().build(ARouterManager.APP_LOGIN_ACTIVITY).navigation();
                //跳转并携带参数
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("haha", new Info(1, "黄渤中"));
//                ARouter.getInstance().build("/test/test").with(bundle).navigation();
            }
        });
    }

}
