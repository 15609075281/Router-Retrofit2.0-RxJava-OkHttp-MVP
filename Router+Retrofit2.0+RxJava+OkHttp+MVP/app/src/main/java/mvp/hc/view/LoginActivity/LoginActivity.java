package mvp.hc.view.LoginActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.android.arouter.facade.annotation.Route;
import mvp.hc.ARouterManager;
import mvp.hc.R;
import mvp.hc.persenter.LoginPersenter.LoginPersenter;
import mvp.hc.view.BaseActivity;

/**
 * Created by Administrator on 2018/4/3.
 * developers:hc
 */
@Route(path = ARouterManager.LOGIN_ACTIVITY)
public class LoginActivity extends BaseActivity implements LoginView {

    private EditText username;
    private EditText password;
    private TextView butten;

    private LoginPersenter loginPersenter;

    @Override
    public int initView() {
        return R.layout.login_activty_xml;
    }

    @Override
    public void findView() {
        findView1();
    }

    public void findView1() {
        loginPersenter = new LoginPersenter(this);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        butten = (TextView) findViewById(R.id.butten);
        butten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPersenter.getLogin();
            }
        });
    }

    @Override
    public String getUserName() {
        return username.getText().toString();
    }

    @Override
    public String getPassWord() {
        return password.getText().toString();
    }

    @Override
    public void setToast(String result) {
        Toast.makeText(LoginActivity.this, result, Toast.LENGTH_LONG).show();
    }


}
