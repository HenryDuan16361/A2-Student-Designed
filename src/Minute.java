import java.time.LocalDateTime;

import becker.robots.City;
import becker.robots.Direction;



public class Minute extends Clock{
    Minute(City city, int street, int avenue, Direction direction, int things){
        super(city, street, avenue, direction, things);
    }

 

    @Override
    public int get_time() {
        LocalDateTime now = LocalDateTime.now();
        int minute = now.getMinute();
        return minute;
    }

    @Override
    public void print_time(){
        int minute = get_time();
        int first_digit = minute / 10;
        int second_digit = minute % 10;

        switch(first_digit){
            case 1:
                print_one();
                break;
            case 2:
                print_two();
                break;
            case 3:
                print_three();
                break;  
            case 4: 
                print_four();
                break;
            case 5:
                print_five();   
                break;
            case 6:
                print_six();
                break;
            case 7:
                print_seven();
                break;  

            case 8:
                print_eight();
                break;  

            case 9:
                print_nine();
                break;
            
            case 0:
                print_zero();
                break;

        }

        switch (second_digit) {
            case 1:
                print_one();
                break;
            case 2:
                print_two();
                break;
            case 3:
                print_three();
                break;  
            case 4: 
                print_four();
                break;
            case 5:
                print_five();   
                break;
            case 6:
                print_six();
                break;
            case 7:
                print_seven();
                break;  

            case 8:
                print_eight();
                break;  

            case 9:
                print_nine();
                break;
            
            case 0:
                print_zero();
                break;

        }


        }
}
