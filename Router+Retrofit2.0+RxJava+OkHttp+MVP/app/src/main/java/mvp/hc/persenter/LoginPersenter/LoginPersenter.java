package mvp.hc.persenter.LoginPersenter;

import mvp.hc.module.LoginModule.LoginModule;
import mvp.hc.module.LoginModule.LoginModuleImp.LoginModuleImp;
import mvp.hc.view.LoginActivity.LoginView;

/**
 * Created by Administrator on 2018/4/3.
 * design:hc
 */
public class LoginPersenter {


    private LoginView loginView;
    private LoginModuleImp loginModuleImp;


    private LoginPersenter() {

    }

    public LoginPersenter(LoginView loginView) {
        this.loginView = loginView;
        loginModuleImp = new LoginModuleImp();
    }

    public void getLogin() {
        loginModuleImp.OnLoginLister(loginView.getUserName(), loginView.getPassWord(),
                new LoginModule.LoginLister() {
                    @Override
                    public void Success(String success) {
                        loginView.setToast(success);
                    }

                    @Override
                    public void Error(String error) {
                        loginView.setToast(error);
                    }
                });
    }


}
