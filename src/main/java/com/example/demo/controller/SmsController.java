package com.example.demo.controller;

import com.example.demo.entity.Sms;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author LiuCongYang
 * @Version 1.0.0
 * create at @date  2020/12/21 11:23
 * copyright Beijing Murong Information Technology Co.,Ltd.
 */
@RestController
@RequestMapping(value = "/sms")
public class SmsController {
    @RequestMapping(value = "sendCode",method = RequestMethod.POST)
    public void Sms(@RequestBody Sms sms){
        int appid = 0;
        String appkey = "";
        String templateId = "";
        String smsSign = "";//签名
        try {
            String[] param = {sms.getCode(),sms.getPhoneNm(),Integer.toString(sms.getMin())};
            SmsSingleSender sender = new SmsSingleSender(appid,appkey);
            SmsSingleSenderResult result = sender.sendWithParam("86",sms.getPhoneNm(), Integer.parseInt(templateId),param,smsSign,"","");
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }catch (JSONException e){
            e.printStackTrace();
        } catch (HTTPException e) {
            e.printStackTrace();
        }

    }
}
