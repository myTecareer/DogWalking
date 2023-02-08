package com.secondexample.HappyWalk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DogPic {
    private String message;
    private String status;
    public DogPic(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return "DogPic{" +
                "status='" + status + '\'' +
                ", message=" + message +
                " }";
    }
}
