package cn.lcsy.com.mooneventbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by liqingguo on 17/12/21.
 */

public class SecondActivity extends AppCompatActivity{

    private Button bt_message;
    private TextView tv_message;
    private Button bt_subscription;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_message=(TextView)this.findViewById(R.id.tv_message);
        tv_message.setText("SecondActivity");
        bt_subscription=(Button)this.findViewById(R.id.bt_subscription);
        bt_subscription.setText("发生粘性事件");
        bt_subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().postSticky(new MessageEvent("粘性事件"));
                finish();
            }
        });
        bt_message= (Button) this.findViewById(R.id.bt_message);
        bt_message.setText("发送事件");
        bt_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent("欢迎关注的博客"));
                finish();
            }
        });
    }
}
