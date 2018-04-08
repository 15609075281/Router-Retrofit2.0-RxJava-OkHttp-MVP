package mvp.hc.persenter.SplashPersenter;

import com.alibaba.android.arouter.facade.annotation.Route;
import hc.com.libs_base.ARouterManager;
import mvp.hc.view.BaseActivity;

/**
 * Created by Administrator on 2018/4/3.
 */

@Route(path = ARouterManager.APP_SPLASH_ACTIVITY)
public class SplashPersenter extends BaseActivity{


    @Override
    public int initView() {
        return 0;
    }

    @Override
    public void findView() {

    }
}
