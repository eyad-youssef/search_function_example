package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver d ;
    public HomePage(WebDriver d ){
        this.d =d ;
    }


    public SearchBar getsearch(){
        return new SearchBar(d);

    }

}
