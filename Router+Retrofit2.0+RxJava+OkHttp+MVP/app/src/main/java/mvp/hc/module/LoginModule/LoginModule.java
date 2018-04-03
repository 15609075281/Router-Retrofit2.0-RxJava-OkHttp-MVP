package mvp.hc.module.LoginModule;

/**
 * Created by Administrator on 2018/4/3.
 * design:hc
 */
public interface LoginModule {

    void OnLoginLister(LoginSuccec loginSuccec);

    interface LoginSuccec {

        String Succec();

        String Error();


    }
}
