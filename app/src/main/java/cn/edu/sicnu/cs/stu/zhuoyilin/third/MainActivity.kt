package cn.edu.sicnu.cs.stu.zhuoyilin.third

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import cn.edu.sicnu.cs.stu.zhuoyilin.third.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // ViewBinding，和课件写法一模一样
    private lateinit var binding: ActivityMainBinding
    // MVC模型实例
    private val adviserModel = ProgramAdviserModel()
    private var textCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 课件标准两行初始化binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ========== 区1：点击按钮动态添加TextView ==========
        // 区1按钮
        binding.btnAddText.setOnClickListener {
            textCount++
            val newTv = TextView(this@MainActivity)
            // 使用字符串资源格式化
            newTv.text = String.format(getString(R.string.text_line_prefix), textCount)
            newTv.textSize = 16f
            newTv.setPadding(0,8,0,8)
            binding.llContainer.addView(newTv)
        }

// 区2按钮
        binding.btnQuery.setOnClickListener {
            val userInput = binding.etInput.text.toString()
            // 传入context给model读取字符串资源
            val result = adviserModel.getAdvice(userInput, this@MainActivity)
            binding.tvResult.text = result
        }

    }
}
