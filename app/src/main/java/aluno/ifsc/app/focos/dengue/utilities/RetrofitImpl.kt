package aluno.ifsc.app.focos.dengue.utilities

import aluno.ifsc.app.focos.dengue.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitImpl(private val url: String = BuildConfig.WS_URL) {

    fun buildRetrofit(): Retrofit {
        val lInterceptor = HttpLoggingInterceptor()
        lInterceptor.level =
            if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE

        val lBuild = OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(lInterceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .client(lBuild)
            .build()
    }
}