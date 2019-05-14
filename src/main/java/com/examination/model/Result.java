package com.examination.model;

public class Result<T> {
    private String msg;
    private String status;
    private T data;

   public Result(String msg,String status,T data){
       this.msg = msg;
       this.status = status;
       this.data = data;
   }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public static Result success(){
        return  new Result("success","200",null);
    }
    public  static<T>  Result<T> success(T data){
        return  new Result("success","200",data);
    }
    public static Result error(String msg){
        return  new Result(msg,"400",null);
    }
}
