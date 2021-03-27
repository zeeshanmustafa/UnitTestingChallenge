package TakeHomeChallenge;

import java.util.List;


public class PaginationHelper<I> {

	
	// need to declare these globally to save items on page and size of the arraysList 
	  int totalCount = 0;
	  int itemsPerPage = 0;
	  
	  
	  
	    
	     // This constructor will save the size of array in variable and items on page.
	     
	    public PaginationHelper (List<I> arrListOfContent, int itemsOnPerPage) {
	        this.totalCount = arrListOfContent.size();
	        this.itemsPerPage = itemsOnPerPage;
	    }

	    
	    // Method return the size/length of arrList/contentList
	     
	     public int itemCount() {
	    	 
	        return totalCount;
	    }

	    
	    //  Method to return the number of pages
	     
	    public int pageCount() {
	    	
	        return (totalCount - 1) / itemsPerPage + 1;
	    }

	    // returns the number of items on the current page. page_index is zero based.
	    // this method should return -1 for pageIndex values that are out of range
	     
	    public int pageItemCount(int pageIndex) {
	    	
	        int count = pageCount();
	        
	        // Index 0 Or greater than count of pages should return -1
	        if(pageIndex < 0 || pageIndex >= count) {
	        	return -1;
	        }
	        //Index equals to pages then return the divide them per page and return remainder 
	        if(pageIndex == count - 1)
	            return totalCount % itemsPerPage;
	        else
	            return itemsPerPage;
	    }

	     //  Method for what page an item is on. also should return -1 if out of range
	     
	    public int pageIndex(int itemIndex) {
	    	
	    	//Validating if the itmeIndex is out of bound
	        if(itemIndex < 0 || itemIndex >= totalCount) {
	        	return -1;
	        }
	        
	        return (itemIndex - 1) / itemsPerPage;
	    }
	    

	    
	
}
