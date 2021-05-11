package com.example.modulemain

import android.os.Bundle
import android.widget.Button
import com.alibaba.android.arouter.launcher.ARouter
import com.example.basemodule.ARouterPath
import com.example.basemodule.BaseActivity


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modulemain_activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener {
            ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_A).navigation()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
//            ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_B).navigation()
            ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_B)
                .withString("key", "传递的数据").navigation()
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_TEST).navigation()
        }
    }
}