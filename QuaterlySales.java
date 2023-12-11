/*2) Store the following monthly sales report of a product in an array:
January 125,000 July 105,000
February 93,000 August 120,000
March 80,000 September 90,000
April 75,000 October 115,000
May 84,000 November 123,000
June 110,000 December 150,000
Write a program to store the quarterly sales report in another array and
display the monthly, quarterly and total sales. (Note: January, February,
March form the first quarter)*/

import java.util.Arrays;
class QuaterlySales{
    public static void main(String[] args){
        int[] SalesPerMonth = { 125000 , 93000 , 80000 , 75000 , 84000 , 110000 , 105000 , 120000 , 90000 , 115000 , 123000 , 150000 };
        int[] QuaterlySales = new int[4];
        int SumOfFirstQuarter=0;
        int SumOfSecondQuarter=0;
        int SumOfThirdQuarter=0;
        int SumOfForthQuarter=0;

        
            System.out.println(" Monthly sales report : "+ Arrays.toString(SalesPerMonth));
        

        for (int i = 0 ; i < SalesPerMonth.length ; i++ ){
            if (  i < 3){
                SumOfFirstQuarter = SumOfFirstQuarter + SalesPerMonth[i];
            }
            else if ( i > 2 && i < 6){
                SumOfSecondQuarter = SumOfSecondQuarter + SalesPerMonth[i];
            }
            else if ( i > 5 && i < 9){
                SumOfThirdQuarter = SumOfThirdQuarter + SalesPerMonth[i];
            }
            else {
                SumOfForthQuarter = SumOfForthQuarter + SalesPerMonth[i];

            }
            
        }

        QuaterlySales[0]= SumOfFirstQuarter;
        QuaterlySales[1]= SumOfSecondQuarter;
        QuaterlySales[2]= SumOfThirdQuarter;
        QuaterlySales[3]= SumOfForthQuarter;

        System.out.println("Quartly report : "+ Arrays.toString(QuaterlySales));
        System.out.println();
        System.out.println(" Yearly sales report : "+ (SumOfFirstQuarter+SumOfSecondQuarter+SumOfThirdQuarter+SumOfForthQuarter));



    }
}