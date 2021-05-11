package com.example.modulemain

import android.os.Bundle
import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.basemodule.ARouterPath
import com.example.basemodule.BaseActivity
import com.example.basemodule.BaseApplication

@Route(path = ARouterPath.PATH_MOUDULE_TEST)
class TestActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modulemain_activity_test)
    }
}