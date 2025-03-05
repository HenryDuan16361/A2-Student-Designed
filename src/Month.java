import java.time.LocalDateTime;

import becker.robots.City;
import becker.robots.Direction;


public class Month extends Clock{
    Month(City city, int street, int avenue, Direction direction, int things){
        super(city, street, avenue, direction, things);
    }

 

    @Override
    public int get_time() {
        LocalDateTime now = LocalDateTime.now();
        int x = now.getMonthValue();
        return x;
    }

    @Override
    public void print_time(){
        int x = get_time();


        switch(x){
            case 1:
                print_zero();
                print_one();
                break;
            case 2:
                print_zero();
                print_two();
                break;
            case 3:
                print_zero();
                print_three();
                break;  
            case 4: 
                print_zero();
                print_four();
                break;
            case 5:
                print_zero();
                print_five();   
                break;
            case 6:
                print_zero();
                print_six();
                break;
            case 7:
                print_zero();
                print_seven();
                break;  

            case 8:
                print_zero();
                print_eight();
                break;  

            case 9:
                print_zero();
                print_nine();
                break;
            
            case 10:
                print_one();
                print_zero();
                break;

            case 11:
                print_one();
                print_one();
                break;

            case 12:    
                print_one();
                print_two();
                break;

        }
        
       
        


    }
}

