package mvp.hc.view.LoginActivity;

/**
 * Created by Administrator on 2018/4/3.
 * design:hc
 */
public interface LoginView {

    /**
     * 获取登录账号
     * @return
     */
    public abstract String getUserName() ;

    /**
     * 获取登录密码
     * @return
     */
    public abstract String getPassWord() ;

    /**
     * 弹出吐司
     * @return
     */
    public abstract void setToast(String result);


}
