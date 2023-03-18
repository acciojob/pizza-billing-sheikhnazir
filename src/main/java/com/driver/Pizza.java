package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeaway;

    public Pizza(Boolean isVeg){
        // Your Code Here
        this.isVeg = isVeg;
        if (isVeg) {

            this.price = 300;
        }
        else {

            this.price = 400;
        }
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.extraCheese == false) {

            this.extraCheese = true;

            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.extraToppings)
        {
            this.extraToppings=true;
            if(this.isVeg)
            {
                this.price+=70;
            }
            else
            {
                this.price+=120;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        if (takeaway == false) {

            this.price += 20;

            this.takeaway = true;
        }
    }

    public String getBill()
    {


        if(this.isVeg)
        {
            this.bill="Base Price Of The Pizza: " +300;
        }
        else
        {
            this.bill="Base Price Of The Pizza: " +400;
        }

        if(this.extraCheese)
        {
            this.bill=this.bill+ "\n" +"Extra Cheese Added: "+80;
        }

        if(this.extraToppings)
        {
            if(this.isVeg)
            {
                this.bill=this.bill+"\n" +"Extra Toppings Added: "+70;
            }
            else
            {
                this.bill=this.bill+"\n" +"Extra Toppings Added: "+120;
            }
        }

        if(takeaway)
        {
            this.bill=this.bill+'\n'+"Paperbag Added: "+20;
        }

        this.bill=this.bill+"\n"+"Total Price: "+this.price+"\n";

        // your code goes here
        return this.bill;
    }
}
