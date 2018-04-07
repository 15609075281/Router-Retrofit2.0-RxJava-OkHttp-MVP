package mvp.hc.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018/4/3.
 * developers:hc
 */
public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initView());
        findView();
    }

    /**
     * 获取view
     *
     * @return
     */
    public abstract int initView();

    /**
     * 初始化
     */
    public abstract void findView();


}
