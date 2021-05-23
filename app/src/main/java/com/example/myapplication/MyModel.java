package com.example.myapplication;

public class MyModel {
    String uname,umail,upass,uphn,upin;

    public String getName(){
        return uname;
    }

    public String getMail() {
        return umail;
    }

    public String getPass() {
        return upass;
    }
    public String getPhn()
    {
        return uphn;
    }
    public String getPin()
    {
        return upin;
    }
    public MyModel() {
    }

    public MyModel(String uname, String umail, String upass,String uphn,String upin) {
        this.uname = uname;
        this.umail = umail;
        this.upass = upass;
        this.uphn=uphn;
        this.upin=upin;
    }
}
