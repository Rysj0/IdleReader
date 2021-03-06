package com.example.administrator.idlereader.Http;

import com.example.administrator.idlereader.Bean.MoviesBean;
import com.example.administrator.idlereader.Bean.NewsBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2018/5/19.
 */

public interface RetrofitService {
    /*
    * http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html
    * */
    @GET("nc/article/{type}/{id}/{startPage}-20.html")
    Call<NewsBean> getNews(@Path("type") String type,
                           @Path("id") String id,
                           @Path("startPage") int startPage);
    @GET("/v2/movie/{total}")
    Call<MoviesBean> getMovie(@Path("total") String total);

}
