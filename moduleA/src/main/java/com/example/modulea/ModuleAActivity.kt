package com.example.modulea

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.basemodule.ARouterPath
import com.example.basemodule.BaseActivity

/**
 * date: 2021/5/3
 * desc:
 */
@Route(path = ARouterPath.PATH_MOUDULE_A)
class ModuleAActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modulea_activity_module_a)
    }

}