package kr.co.tjoeun.kotlinbasic_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn.setOnClickListener {

            Log.d("메인화면", "로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 찍어보기")


        }

        toastBtn.setOnClickListener {

            Toast.makeText(this, "토스트 띄우기", Toast.LENGTH_SHORT).show()

            Toast.makeText(this, "자동완성 토스트", Toast.LENGTH_SHORT).show()


        }

        changeTextBtn.setOnClickListener {

            resultTxt.text = "문구 변경 버튼이 눌림"


        }


        okBtn.setOnClickListener {

//            Ctrl + / : 해당 줄을 주석으로 변경

//            okBtn이 눌리면
//            1) 뭐라고 입력했는지 조회 (contentEdt -> text를 get)
//             조회한 내용을 기록해둬야, 2번에서 사용한다.

           val inputcontent = contentEdt.text.toString()

//            2) 그 내용을 텍스트뷰에 반영 (contentTxt -> text를 set)
            contentTxt.text = inputcontent



//            조건문 예시 : 입력한 내용이 "안녕하세요" 라면, 토스트로 "인사메시지" 문구 출력

            if (inputcontent == "안녕하세요") {


                Toast.makeText(this, "인사메세지", Toast.LENGTH_SHORT).show()


            }
            else if (inputcontent == "안녕히가세요") {
                Toast.makeText(this, "작별인사메세지", Toast.LENGTH_SHORT).show()
            }
            else if (inputcontent == "Hello") {
                Toast.makeText(this, "영문 인사", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "그 외의 문장", Toast.LENGTH_SHORT).show()
            }

        }

    }
}