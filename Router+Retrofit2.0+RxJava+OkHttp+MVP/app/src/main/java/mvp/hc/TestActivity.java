package mvp.hc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by Administrator on 2018/4/4.
 */
@Route(path = "/test/test")
public class TestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testactivity);
        Info info = (Info) getIntent().getSerializableExtra("haha");
        Log.e("ffffffffff", info.toString());

    }
}
