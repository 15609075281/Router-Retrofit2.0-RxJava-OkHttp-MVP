package mvp.hc.module.LoginModule.LoginModuleImp;

import mvp.hc.module.LoginModule.LoginModule;

/**
 * Created by Administrator on 2018/4/3.
 * design:hc
 */
public class LoginModuleImp implements LoginModule {


    @Override
    public void OnLoginLister(String username, String password, LoginLister loginLister) {

        if (username.equals(password)) {
            loginLister.Success("成功");
        } else {
            loginLister.Error("失败");
        }
    }
}
