package com.company;

public class Dog {
        private String nickName;
        private String color;
        private String theFamily;
        private short age;
        private double theWeight;

        void setNickName(){
            nickName = "Bobik";
        }
        public String getNickName() {
            return nickName;
        }
        void setColor(){
            color = "коричневый";
        }
        public String getColor() {
            return color;
        }
        void setTheFamily(){
            theFamily = "овчарка";
        }
        public String getTheFamily(){
            return theFamily;
        }
        void setAge(){
            age = 5;
        }
        public short getAge() {
            return age;
        }
        void setTheWeight(){
            theWeight = (double) 5.5;
        }
        public double getTheWeight() {
            return theWeight;
        }
}
