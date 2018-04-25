package com.weex.app.extend;

import android.app.AlertDialog;
import android.content.DialogInterface;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/4/23.
 */

public class DialogModule extends WXModule {

    @JSMethod
    public void delDialogShow(final JSCallback callback){
        AlertDialog.Builder builder = new AlertDialog.Builder(mWXSDKInstance.getContext());
        builder.setTitle("提示");
        builder.setMessage("是否要删除？");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                HashMap<String, String> map = new HashMap<>();
                map.put("result","ok");
                callback.invoke(map);
            }
        });
        builder.setNegativeButton("取消",null);
    }
}
