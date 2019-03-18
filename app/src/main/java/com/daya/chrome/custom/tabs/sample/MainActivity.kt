package com.daya.chrome.custom.tabs.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cookie = "userLocale=ko_KR; _ga=GA1.2.599494467.1551680759; TOAST_ID_LAST_ID=\"bPaM1CSn-VNql_qML66KVQhr4c8MYRU3WZMT-MqvGlk=\"; TOAST_ID_NEO_SES=\"AAAA9dMITl/fu97HfNRq9Yy2OElX6BFg/Muft1MLg+C2pWVfrfrN2Us71A6S4n+PAjb+Z8XxysnGyI0m5EypXvQChIXwCINCQAMmt+AGLVUdnhxxQg3gAYex5spg7OsGbBVZsAP2iaGPLgn7HL3NpasRDxXcK+cPJQhknPydBtM3LYYwtJAezirTJo1L77ZZeABqPYY7McjCrEOrtJu64LE/m33qbIwetpmOEQioopT/agMrJ6QUP8ryFO8F2wFMFROryv9r6kgdN/ppABGDjiVcU25t18q3OHBzgFjeDYe8jzxwIyf+7hzCiU2qS1egHOxUtiP+Zc85kp7B+bcahMA1MFo=\"; TOAST_ID_NEO_SES=\"AAAA9PLBt97SDcP+h1RMZYqcGaNvpWhmiwGBfO1OT3lJpWkObVKkBpSnYoGbZ7D8QRQNTmMSdoJfFynAkzWlR1wRqNoxvSP72slLACRiEd1Ub9rEV/kMPLCeCUWNIq6dL4FcxRgLsa0fRwTQQ5f8TD/vP0jhfXlGRwsLiPGXTZDlJp+0xIoNbrVSxy3ZCrl+Ig4a4MgWG/gHha2bgd44/c4sB0gQVCou+Egin8Q4muwCk9hygeSR5Kgxhz69lxCOZTlQeeEg1xab/fxSTG3D7cCAN54J8ZQRoxWlgPeBLpns5WfAv1JYDzTyfCNU84C2glUrS2HQ2PjEDF9aTh9n4VUy+uw=\"; JSESSIONID=2083A511CC8032CA092BE0AE96BD6292; TOAST_ID_NEO_CHK=AAAAeznpTYfJY5Vkkwp6iZt0zYk7TWLLEW3wWEDvND83oJPhFqgH6GKHYtRbSxwACDrI3U9vBeMT6s8WETz80RRRpAUKEwfIQxzeqwjTfS3VVYl9fB1SbHbS6jxJjY7mcVCwzijsLiCRa53c1zbuGMCDeOsrVv+cAVxNMLPVDLwy+j74; _gid=GA1.2.36651449.1552890483"
        button.setOnClickListener {
            val url = "https://alpha.toast.com/support"
            val headers = hashMapOf("Cookie" to cookie)
            CustomTabsHelper.launchUrl(this@MainActivity, url, headers)
        }
    }
}

