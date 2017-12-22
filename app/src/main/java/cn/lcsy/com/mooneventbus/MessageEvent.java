package cn.lcsy.com.mooneventbus;

/**
 * Created by liqingguo on 17/12/21.
 */

public class MessageEvent  {
    private String message;
    public MessageEvent(String message){
        this.message =message;
    }
    public String getMessage(){return  message;}
    public void setMessage(String message){
        this.message=message;
    }
}
