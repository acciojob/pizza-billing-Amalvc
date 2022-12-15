package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int takeAwayPrice;
    private int toppingPrice;
     boolean isTakenAwayAdded;
     boolean isToppingAdded;
     boolean isCheeseAdded;
     boolean isBillGenerated;





    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.takeAwayPrice=20;
        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;
        }
        else{
            this.price=400;
            this.toppingPrice=120;
        }
        this.isTakenAwayAdded=false;
        this.isToppingAdded=false;
        this.isCheeseAdded=false;
        this.bill="Base Price Of The Pizza:"+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price= this.toppingPrice + this.price;
            isToppingAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isTakenAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakenAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Added:"+this.cheesePrice+"\n";
            }
            if(isToppingAdded==true){
                this.bill=this.bill+"Extra Cheese Added:"+this.toppingPrice+"\n";
            }
            if(isTakenAwayAdded==true){
                this.bill=this.bill+"Extra Cheese Added:"+this.takeAwayPrice+"\n";
            }
            this.bill=this.bill+"Total price"+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
