package Assertion;

import java.util.ArrayList;


import org.testng.Assert;
import org.testng.annotations.Test;

import TakeHomeChallenge.PaginationHelper;

public class PaginationHelperClassAssertions {
	

	@Test
	 public void ValidationForPaginationHelperClassTest (){
    	ArrayList<Character> arrList = new ArrayList<Character>();
    
    	//Need this advanced for loop to get all the value from array and add them into list
    	char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    	for(char c : arr) {
    		arrList.add(c);
    	}
    			
	    PaginationHelper <Character> helper = new PaginationHelper<Character> (arrList, 4);
	    
	    //should == 2
	    Assert.assertEquals(2, helper.pageCount(), "Test Failed was Expected  " + helper.pageCount());
	    
	    //should == 8
        Assert.assertEquals(8, helper.itemCount(), "Itmes count should be the lengnth of array where as first index is 1 : ");
        
        //should == 4
        Assert.assertEquals(4, helper.pageItemCount(0), "Items per page should be divide by arrLis over itmesPerpage : "); //should == 4
        
        
        // last page - should == 0
        Assert.assertEquals(0, helper.pageItemCount(1));
        
        // should == -1 since the page is invalid
        Assert.assertEquals(-1, helper.pageItemCount(2), "Failed becuase page is out of bound/index : ");

        //should == 1 (zero based index)
        Assert.assertEquals(1, helper.pageIndex(5), "Expected result not matching the argument: "); 
       
        //should == 0
        Assert.assertEquals(0, helper.pageIndex(2));
        
        //should == -1
        Assert.assertEquals(-1, helper.pageIndex(20), "Not Out of bound : "); 
        
        //should == -1
        Assert.assertEquals(-1, helper.pageIndex(-10), "Not out of bound : "); 
        
        
        }

}
