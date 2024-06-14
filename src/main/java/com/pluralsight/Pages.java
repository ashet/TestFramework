package com.pluralsight;

public class Pages {
    public static HomePage homePage(){
        HomePage homePage = new HomePage();

        return homePage; //or simple return new HomePage();
    }
    public static AuthorPages authorPages(){
        return new AuthorPages(); //you can return the new class instead of declaring an authorPages variable
    }
}
