package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;

    private int extraCheese;
    private int extraTopping;
    private int paperBag;


    public Pizza(Boolean isVeg) {
        isBillGenerated = false;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;

        this.isVeg = isVeg;

        extraCheese = 80;
        paperBag = 20;

        // your code goes here
        if (this.isVeg) {
            price = 300;
            extraTopping = 70;
        } else {
            price = 400;
            extraTopping = 120;
        }
        bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice() {

        return this.price;
    }


    public void addExtraCheese() {
        // your code goes here
        if (!isCheeseAdded) {
            price += extraCheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isToppingsAdded) {
            price += extraTopping;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!isPaperBagAdded) {
            price += paperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBillGenerated) {
            isBillGenerated = true;

            if (isCheeseAdded)
                bill += "Extra Cheese Added: " + extraCheese + "\n";

            if (isToppingsAdded)
                bill += "Extra Toppings Added: " + extraTopping + "\n";

            if (isPaperBagAdded)
                bill += "Paperbag Added: " + paperBag + "\n";


            bill += "Total Price: " + price + "\n";


        }
        return this.bill;
    }
}