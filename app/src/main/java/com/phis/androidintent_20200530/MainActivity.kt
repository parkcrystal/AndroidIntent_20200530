package com.phis.androidintent_20200530

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        dialBtn.setOnClickListener {

            val inputPhoneNum = phoneNumEdt.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNum}")
           // val myUri = Uri.parse("tel:01012345678")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        callBtn.setOnClickListener {

//             타이핑 해둔 폰번을 받아오자. (String 으로)
            val phoneNum = phoneNumEdt.text.toString()

//            어디로 전화를 걸지 정보를 저장하는 Uri를 만들자
            val myUri = Uri.parse("tel:${phoneNum}")

//            전화를 걸어줄 안드로이드 전화앱 화면 호출
//            어떤 종류의 행동 + 어디로 보낼지를 Intent에 넣어주자.
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)

        }
    }
}
