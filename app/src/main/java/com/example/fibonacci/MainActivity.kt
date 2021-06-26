package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BlockedNumberContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
    }
    fun castView(){
        rvNumbers = findViewById(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numsAdapter = Number_Fibonacci(showNumbers(100))
        rvNumbers.adapter=numsAdapter
    }
    fun showNumbers(last:Int):List<BigInteger>{
        var start = BigInteger.ZERO
        var next = BigInteger.ONE
        var nums = MutableList<BigInteger>(last,{BigInteger.ZERO})
        nums [0] = start
        nums [1] = next
            for (x in 1..last){
                var nums1 = start+next
                start=next
                next=nums1
                nums[x-1]=start
            }
        return nums
    }
}