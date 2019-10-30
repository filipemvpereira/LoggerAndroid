package agentifai.com.logger

import android.util.Log

class Logger {

    companion object {

        fun log(tag: String, message: String) {
            Log.i(tag, message)
        }

    }

}