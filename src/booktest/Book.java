/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktest;


/**
 *
 * @author myComputer
 */
public class Book implements Comparable<Book>{
    
    //initialising variables 
    private String bookTitle;
    private int ISBN;
    private double originalPrice;
    private double discountedPrice ;
   
    //constructor
    Book( String bookTitle, int ISBN, double originalPrice, double discountedPrice)
    {
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.originalPrice = originalPrice;
        this.discountedPrice = originalPrice/(discountedPrice);
    }

    /*
     *
     *Getter and setters
     *
     **/
    public String getBookTitle()
    {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }
    
     public int getISBN()
    {
        return ISBN;
    }
    public void setISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }
    
      public double getOriginalPrice()
    {
        return originalPrice;
    }
    public void setOriginalPrice(double orginalPrice)
    {
        this.originalPrice = orginalPrice;
    }
    
     public double getDiscountPrice()
    {
        return discountedPrice;
    }
    public void setDiscountedPrice(double Anyprice)
    {
        this.discountedPrice = Anyprice;
    }
    
    
    /*
     *function to compare string and sort out Book title in ascending order
     */
    public String toString() {
        return (" " + bookTitle + ", " + ISBN + ", " + originalPrice + ", " + discountedPrice + "\n");
    }
    @Override
    public int compareTo(Book o) {
        return toString().compareTo(o.toString());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

}
