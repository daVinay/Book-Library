/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktest;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author myComputer
 */
public class BookTest {

    public static void main(String[] args) {
        // TODO code application logic here
        int totalBooks = 8;
        
        //made object with Book with 8 arrays starting from 0 and gave them default value
        Book[] AllBooks = new Book[8];
        AllBooks[0] = new Book("Rockie Road", 1234,155,10);
        AllBooks[1] = new Book("Risky business", 5432,75.5,10);
        AllBooks[2] = new Book("Java", 3546,64 ,10);
        AllBooks[3] = new Book("Programming for dummies", 432,165 ,10);
        AllBooks[4] = new Book("High mountains", 6432,144 ,10);
        AllBooks[5] = new Book("Become Rich Fast", 94738,199,10);
        AllBooks[6] = new Book("How long it is going to take", 28274,50,10);
        AllBooks[7] = new Book("Last one Finally!", 29755,90,10);

        //loop to ask user input and work on all options
        Scanner input = new Scanner(System.in);
        boolean optionLoop = false;
        while(!optionLoop){
            //output user options
            System.out.println("\n\n******************************************\nPlease select from the below options\n"+
                    "\t1. Read, validate, and store book Title, ISBN and original price for 8 books.\n"+
                    "\t2. Calculate, store and display the discounted price(price after 10% discount) for all books\n"+
                    "\t3. Display all ISBN numbers which have over $100 original price\n"+
                    "\t4. Find and display the book title with the lowest original price\n"+
                    "\t5. Find and display the ISBN number with the highest discounted price\n"+
                    "\t6. Sort and display the book titles in ascending order\n"+
                    "\t7. Search and display the accounts which have ISBN equal to the given ISBN\n"+
                    "\t8. Exit from the application\n"+
                    "Enter your choice:");

                    try{  
                    //convert user choice to int 
                    int userInput = input.nextInt();
                    
                    //if choice is not between 1-8, show warning
                    if((userInput<0) || (userInput>9))
                    {
                        System.out.println("Wrong choice! Please choose from option between 1 to 8");
                        optionLoop = false;

                    }
                    //if user entered between 1-8
                    else
                    {
                        //used switch as per teacher instruction
                        switch (userInput) {
                            
                            //Case 1 for read, validate and store Book Details 
                           case 1:
                               int bn =1;
                                    bn =1;
                                    for(int l= 0; l<AllBooks.length; l++)
                                    {   
                                        System.out.println("Below are the details of Book "+bn);
                                        System.out.println("\tBook title is: "+AllBooks[l].getBookTitle());
                                        System.out.println("\tBook ISBN is: "+AllBooks[l].getISBN());
                                        System.out.println("\tOriginal value is: "+AllBooks[l].getOriginalPrice());
                                        System.out.println("\tYou get discount of: "+AllBooks[l].getDiscountPrice());
                                        System.out.println("\tPrice after discount is: "+(AllBooks[l].getOriginalPrice()-AllBooks[l].getDiscountPrice())+"\n");

                                        bn++;
                                    }
                                      
                                    boolean loop = false;
                                    
                                    while(!loop){
                                           int cnt = 0;
                                           for(int i =0; i<AllBooks.length; i++){ 
                                           System.out.println("\nPlease enter the details of Book "+(i+1)+ " below:");  
                                           
                                           boolean smallLoop = false;
                                           while(!smallLoop){
                                           Scanner inputBT= new Scanner(System.in);
                                           System.out.println("Enter book Title for book "+(i+1)+": ");

                                           String array = inputBT.nextLine();
                                           AllBooks[i].setBookTitle(array);
                                           
                                           boolean smallLoop1 = false;
                                           while(!smallLoop1)
                                           {
                                                Scanner inputISBN = new Scanner(System.in);
                                                System.out.println("Enter book ISBN for book "+(i+1)+": ");

                                                int Intarray = inputISBN.nextInt();
                                                if ((Intarray<0) || (Intarray >999999))
                                                {
                                                    System.out.println("****ISBN can only be between 0 to 999999****\n"
                                                    +"You have to enter the details again\n");
                                                    smallLoop1 = false;
//                                                    if(i!=0)
//                                                     i--;
//                                                    cnt++;
//                                                    //else i=0;

                                                }
                                                else{
                                                    AllBooks[i].setISBN(Intarray);
                                                    smallLoop1 = true;
                                                }
                                           }
                                           
                                           boolean smallLoop2 = false;
                                           while(!smallLoop2)
                                           {
                                                    Scanner inputPrice= new Scanner(System.in);
                                                    System.out.println("Enter book Original Price for book "+(i+1)+": ");

                                                    double OPrice = inputPrice.nextDouble();
                                                    if ((OPrice<10) || (OPrice >200))
                                                    {
                                                        System.out.println("****Price can only be between 10 to 200****\n"
                                                        +"You have to enter the details again\n");
                                                        smallLoop2 = false;
//                                                         if(cnt==0)
//                                                         {
//                                                             if(i!=0)
//                                                             i--;
//                                                         }
//                                                         //else i=0;

                                                    }
                                                    else
                                                    {   
                                                        AllBooks[i].setOriginalPrice(OPrice);
                                                        smallLoop2 = true;
                                                    }         
                                            }
                                           
                                           smallLoop = true;
                                           }
                                           
                                           
                                    }
                                   loop = true; 
                               }
                             
                                
                               break;
                               
                            //Case to calculate and show discounted price
                           case 2:
                               bn =1;
                               //for loop to display all details
                               for(int l= 0; l<AllBooks.length; l++)
                               {   
                                   System.out.println("Below are the details of Book "+bn);
                                   System.out.println("\tBook title is: "+AllBooks[l].getBookTitle());
                                   System.out.println("\tBook ISBN is: "+AllBooks[l].getISBN());
                                   System.out.println("\tOriginal value is: "+AllBooks[l].getOriginalPrice());
                                   System.out.println("\tDiscounted price is: "+AllBooks[l].getDiscountPrice());
                                   System.out.println("\tYou Pay: "+(AllBooks[l].getOriginalPrice()-AllBooks[l].getDiscountPrice())+"\n");
                                   
                                   bn++;
                               }
                               break;
                               
                           //Case to Display ISBN number of book with price over $100 
                           case 3:
                               int counter =0;
                               for(int i=0; i<AllBooks.length; i++){
                                   if(AllBooks[i].getOriginalPrice()>100)
                                   {
                                       System.out.print("Book's ISBN with price > 100 : "+AllBooks[i].getISBN()+"\n");
                                       counter++;
                                   }
                                   else if(!(AllBooks[i].getOriginalPrice()>100)&&(counter<1))
                                   {
                                      System.out.print("didn't found any");
                                   }
                               }
                               break;
                               
                           case 4:
                               String lava= AllBooks[0].getBookTitle();
                               double smallestPrice = AllBooks[0].getOriginalPrice();
                               double largestprice = AllBooks[0].getOriginalPrice();
                               for(int i=0; i<AllBooks.length; i++)
                               {
                                   System.out.println("listing all ISBN: "+AllBooks[i].getBookTitle());
                                   System.out.println("listing all discount: "+AllBooks[i].getOriginalPrice());
                                   if(AllBooks[i].getOriginalPrice()< smallestPrice)
                                   {
                                       smallestPrice = AllBooks[i].getOriginalPrice();
                                   }
                                   else if (AllBooks[i].getOriginalPrice()>largestprice)
                                   {
                                       largestprice = AllBooks[i].getOriginalPrice();
                                       lava = AllBooks[i].getBookTitle();
                                       
                                   }
                                   
                               }
                               System.out.println("Price with smallest original price is: "+smallestPrice);
                               System.out.println("Price with Highet original price is: "+largestprice);
                               System.out.println("Title of highest discount book is : "+lava);
                               
                              
                               break;
                           case 5:
                               int peop= AllBooks[0].getISBN();
                               double smallest = AllBooks[0].getDiscountPrice();
                               double largest = AllBooks[0].getDiscountPrice();
                               for(int i=0; i<AllBooks.length; i++)
                               {
                                   System.out.println("listing all discount: "+AllBooks[i].getDiscountPrice());
                                   System.out.println("listing all ISBN: "+AllBooks[i].getISBN());
                                   if(AllBooks[i].getDiscountPrice()<smallest)
                                   {
                                       smallest = AllBooks[i].getDiscountPrice();  
                                   }
                                   else if (AllBooks[i].getDiscountPrice()>largest)
                                   {
                                       largest = AllBooks[i].getDiscountPrice();
                                       peop = AllBooks[i].getISBN();
                                       
                                   }
                                   
                               }
                               System.out.println("Price with smallest discount price is: "+smallest);
                               System.out.println("Price with Highet discount price is: "+largest);
                               System.out.println("ISBN of highest discount book is : "+peop);
                               
                               break;
                           case 6:
                             Arrays.sort(AllBooks);
                             System.out.println("Books in ascending order: ");
                             System.out.println(Arrays.asList(AllBooks));
                             
                               break;
                           case 7:
                                System.out.println("Please enter ISBN: ");
                                Scanner inputIsbn = new Scanner(System.in);
                                int EnteredISBN = inputIsbn.nextInt();
                                int count = 0;
                               for(int i= 0; i<AllBooks.length; i++)
                               {
                                   if(EnteredISBN == AllBooks[i].getISBN())
                                   {
                                       System.out.println("Match found: \n"
                                               + "\tBook title is: "+AllBooks[i].getBookTitle()
                                               + "\n\tBook ISBN is: "+AllBooks[i].getISBN()
                                               + "\n\tBook price is: "+AllBooks[i].getOriginalPrice());
                                       count++;
                                   } 
                               }
                               if(count == 0)
                               {
                                   System.out.println("No match found");
                               }
                                
                               break;
                           default:
                               System.exit(0);
                            }   
                        }
                    }
                    
        
                    catch(InputMismatchException ex)
                    {
                          System.out.println("This is not an integer.\nPlease try again");
                          optionLoop = false;
                    }  
        }
                   
    }
        
   
    
    
    
    
}
