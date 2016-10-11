package com.example.dell.testmvpra.retrofit;

import com.example.dell.testmvpra.modle.MainModel;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by dell on 2016/9/14.
 */

public interface ApiService {

    public String BASEURL = "http://test.tiluntai.com/userapp/json/v2/areas/";

    @GET("parentid")
    Call<ResponseBody> getCity(@Query("parentid") String parentid);

    @GET("http://www.weather.com.cn/adat/sk/{cityId}.html")
    Call<ResponseBody> getWeather(@Path("cityId") String cityId);

    //baseUrl
    String API_SERVER_URL = "http://www.weather.com.cn/";

    //加载天气
    @GET("adat/sk/{cityId}.html")
    Observable<MainModel> loadData(@Path("cityId") String cityId);
}
