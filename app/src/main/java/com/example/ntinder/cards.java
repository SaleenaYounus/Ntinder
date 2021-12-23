package com.example.ntinder;

public class cards {
    private String userId; /*which is need to connect the DB*/
    private String name; /*which shows the current user*/
    public cards (String userId, String name){
        /* The parameter useId is different from Private String userId*,this is parameter*/
        this.userId = userId;/*The parameter userId is assigned to the DB connectivity userid*/
        this.name = name;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId =userId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
