package com.company;

public class Ball {
    private String ballName;
    private int ballSize;
    public void setBallName(){
        //new OrangeBall().setUpOrangeBall();
    }

    @Deprecated
    public void bounce (){
        System.out.println("bouncing");
    }

//    class OrangeBall{
//        public void setUpOrangeBall(){
//            ballName = "inside Inner Class";
//            ballSize = 23;
//            System.out.println(ballName + "," + ballSize);
//        }
//    }
}
