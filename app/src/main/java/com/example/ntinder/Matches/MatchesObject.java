package com.example.ntinder.Matches;

public class MatchesObject {
    private String userId; /*which is need to connect the DB*/

    public MatchesObject(String userId) {
      this.userId= getUserId();
 }

    /*public void MatchesActivity(String userId){
        /* The parameter useId is different from Private String userId*,this is parameter*/
        //this.userId = userId;/*The parameter userId is assigned to the DB connectivity userid*/
    //}


    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId =userId;
    }
}
