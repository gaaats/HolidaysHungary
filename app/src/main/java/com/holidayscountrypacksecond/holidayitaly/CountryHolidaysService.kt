package com.holidayscountrypacksecond.holidayitaly

import com.holidayscountrypacksecond.holidayitaly.entity.ListHolidays
import okhttp3.Interceptor
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CountryHolidaysService {

    companion object {
        const val BASE_URL = BuildConfig.API_PATH
        const val API_KEY = BuildConfig.API_KEY
        const val COUNTRY = "Italy"
        const val YEAR = "2022"
    }

    @GET("holidays")
    suspend fun getHolidays(
        @Query("country") country : String = COUNTRY,
        @Query("year") year : String = YEAR,
    ): Response<ListHolidays>


}

class MyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("X-Api-Key", CountryHolidaysService.API_KEY)
            .build()
        return chain.proceed(request)
    }
}