package com.momoxiangbei.rentalcar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2015/11/4.
 */
public class MessageActivity extends BaseTitleActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MessageActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void create(Bundle bundle) {
        setContentView(R.layout.activity_message);
    }

    @Override
    public void initView() {
        super.initView();
        right.setVisibility(View.INVISIBLE);
        title.setText("我的消息");

    }

    @Override
    public void initParams() {

    }
}
