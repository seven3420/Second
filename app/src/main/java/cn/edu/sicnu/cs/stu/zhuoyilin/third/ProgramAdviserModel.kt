package cn.edu.sicnu.cs.stu.zhuoyilin.third
import android.content.Context

class ProgramAdviserModel {
    fun getAdvice(input: String, context: Context): String {
        val trimInput = input.trim()
        if (trimInput.isEmpty()) {
            return context.getString(R.string.tip_empty)
        } else if (trimInput.lowercase().contains("bug")) {
            return context.getString(R.string.tip_bug)
        } else if (trimInput.lowercase().contains("内存")) {
            return context.getString(R.string.tip_memory)
        } else {
            return String.format(context.getString(R.string.tip_default), input)
        }
    }
}
