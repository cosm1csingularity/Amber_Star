package com.incaseofmagicx.amberstar

import android.content.Context
import com.incaseofmagicx.amberstar.Constants.Campaign1
import com.incaseofmagicx.amberstar.Constants.Deeplink1
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class JSoup (val context: Context) {
    private var jsoup: String? = "null"
    private val hawk : String? = Hawk.get(Campaign1)
    private val hawkAppLink: String? = Hawk.get(Deeplink1)

    private var forJsoupSetNaming: String = Constants.FilterUrl + Constants.subber1 + hawk
    private var forJsoupSetAppLnk: String = Constants.FilterUrl + Constants.subber1 + hawkAppLink
    suspend fun getDocSecretKey(): String?{
        withContext(Dispatchers.IO){
            if(hawk!=null) {
                val doc = Jsoup.connect(forJsoupSetNaming).get()
                jsoup = doc.text().toString()
            } else {
                val doc = Jsoup.connect(forJsoupSetAppLnk).get()
                jsoup = doc.text().toString()
            }
        }
        return jsoup
    }
}