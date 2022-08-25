package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchBar {
    private WebDriver d ;
    public SearchBar(WebDriver d ){
        this.d =d ;
    }


    String[] arrayOfValidSearchWords= new String[]{"DRESS","Dress","dress"};
    String [] arrayOfInvalidSearchWords= new String[]{ "!@@#!$#@$","    ","123456789","فستان "};



       public  void makeValidsearch(){


        for(int i =0 ; i<arrayOfValidSearchWords.length;i++){

            d.findElement(By.cssSelector("#search_query_top")).sendKeys(arrayOfValidSearchWords[i]);
            d.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
            d.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
            d.findElement(By.cssSelector("#search_query_top")).clear();

             }}

        public  void makeInvalidsearch(){


            for(int i =0 ; i<arrayOfInvalidSearchWords.length;i++){

                d.findElement(By.cssSelector("#search_query_top")).sendKeys(arrayOfInvalidSearchWords[i]);
                d.findElement(By.cssSelector("button.btn:nth-child(5)")).click();
                d.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
                d.findElement(By.cssSelector("#search_query_top")).clear();

            }}





    public String getresult(){
        String resultdata;
        return   resultdata = d.findElement(By.cssSelector(".heading-counter")).getText();

    }
    public  String color (){
        String  bgcolor =   d.findElement(By.cssSelector(".alert")).getCssValue("background-color");
        return bgcolor;
    }

}
