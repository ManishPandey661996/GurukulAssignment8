/*The following arrays shows the profits of a company from 2001 to 2010:
int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
Write a program to find which year the decline in profits began.*/

class ProfitDecline{
    public static void main(String[] args){
        int[] profits = {12,18,20,38,53,93,77,61,59,56};
        int position = 0;
        for (int i = 1  ; i <= profits.length  ; i++ ){
            
            
            if ( profits[i-1] > profits[i]){
                position = i ;
                break;

            }

        }
        System.out.println("Profit decreased from year : "+ (position + 2001));
    }
}