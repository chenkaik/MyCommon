package com.example.moduleb

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.basemodule.ARouterPath
import com.example.basemodule.BaseActivity

/**
 * date: 2021/5/3
 * desc:
 */
@Route(path = ARouterPath.PATH_MOUDULE_B)
class ModuleBActivity : BaseActivity() {

    @Autowired(name = "key")
    @JvmField var data: String = "默认值"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.moduleb_activity_module_b)
        ARouter.getInstance().inject(this)
        val textView = findViewById<TextView>(R.id.moduleb_textview)
        textView.text = data
    }

}