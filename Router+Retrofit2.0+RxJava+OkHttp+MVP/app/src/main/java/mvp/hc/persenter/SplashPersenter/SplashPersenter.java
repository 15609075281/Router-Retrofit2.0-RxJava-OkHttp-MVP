package mvp.hc.persenter.SplashPersenter;

import com.alibaba.android.arouter.facade.annotation.Route;
import mvp.hc.ARouterManager;
import mvp.hc.view.BaseActivity;

/**
 * Created by Administrator on 2018/4/3.
 */

@Route(path = ARouterManager.SPLASH_ACTIVITY)
public class SplashPersenter extends BaseActivity{


    @Override
    public int initView() {
        return 0;
    }

    @Override
    public void findView() {

    }
}
