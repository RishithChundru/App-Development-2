package com.example.android

import android.annotation.SuppressLint
import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class JobScheduling : AppCompatActivity() {
    var jobScheduler: JobScheduler?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_job_scheduling)
        val startjob=findViewById<Button>(R.id.button5)
        val stopjob=findViewById<Button>(R.id.button8)
        startjob.setOnClickListener {
            jobScheduler=getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler
            val componentName=ComponentName(this,jobservice::class.java)
            val builder=JobInfo.Builder(123,componentName)
            builder.setMinimumLatency(8000)
            builder.setOverrideDeadline(10000)
            builder.setPersisted(true)
            builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            builder.setRequiresCharging(false)
            jobScheduler!!.schedule(builder.build())
        }
        stopjob.setOnClickListener {
            if(jobScheduler!=null){
                jobScheduler!!.cancel(123)
                jobScheduler=null
                Toast.makeText(this,"Job Cancelled",Toast.LENGTH_LONG).show()
            }
        }
    }
}