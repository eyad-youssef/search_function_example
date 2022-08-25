import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchBar;

public class SearchTest extends Setup {
    @Test(priority = 1)
    public void testvalidsearch(){

           SearchBar s =homepage.getsearch();
           s.makeValidsearch();
          Assert.assertEquals(s.getresult(),"7 results have been found.","the word used in the search is accepted to be used ");
//        Assert.assertTrue(result , " this is the new result found ");
//        Boolean result = Boolean.valueOf(s.getresult());

    }

  @Test(priority = 2)
    public void testinvalidsearch(){
        SearchBar s =homepage.getsearch();
        s.makeInvalidsearch();
        Assert.assertEquals(s.color(), "rgba(254, 145, 38, 1)"," this is a result found ");

    }
}

