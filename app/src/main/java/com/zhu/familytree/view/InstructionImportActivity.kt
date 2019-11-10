package com.zhu.familytree.view

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.zhu.familytree.R
import com.zhu.familytree.databinding.ActivityInstructionImportBinding
import kotlinx.android.synthetic.main.activity_detail.*

/**
 * @description 导入说明
 *
 * @author QQ657036139
 * @since 2019-11-10
 */
class InstructionImportActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInstructionImportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_instruction_import)

        toolbar.run {
            setSupportActionBar(this)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
