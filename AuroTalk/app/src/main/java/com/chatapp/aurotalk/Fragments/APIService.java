package com.chatapp.aurotalk.Fragments;

import com.chatapp.aurotalk.Notifications.MyResponse;
import com.chatapp.aurotalk.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARv7kPLs:APA91bF2Rq2_I7XO44sYJul6fN5ReSfGL2CTnEW-6O-bvuv3ZAcUtlmq99-T54A2CFFK0uOQa520TidZ-ocq8JUAaHYFucDg59EemO5eZCbVXxi5PoNGTB7YElR9Vv5zf93YSPi_gO1H"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
