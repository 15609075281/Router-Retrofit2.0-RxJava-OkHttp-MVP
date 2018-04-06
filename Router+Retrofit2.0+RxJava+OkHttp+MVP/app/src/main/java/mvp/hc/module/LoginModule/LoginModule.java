package mvp.hc.module.LoginModule;

/**
 * Created by Administrator on 2018/4/3.
 * design:hc
 */
public interface LoginModule {

    /**
     * 登录接口触发器
     *
     * @param loginLister
     */
    void OnLoginLister(String username, String password, LoginLister loginLister);

    interface LoginLister {

        void Success(String success);

        void Error(String error);


    }
}
