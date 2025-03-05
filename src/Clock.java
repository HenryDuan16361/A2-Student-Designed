import becker.robots.City;
import becker.robots.Robot;
import becker.robots.Direction;

abstract class Clock extends Robot{
    Clock(City city, int street, int avenue, Direction direction, int things){
        super(city, street, avenue, direction, things);
    }
    public void move(int x){
        for(int i = 0; i < x; i++){
            super.move();
        }
    }

    public void drawLine(int x){
        for(int i = 0; i < x; i++){
            putThing();
            move();
        }
    }

    public void turn_Right(){
        super.turnLeft();
        super.turnLeft();
        super.turnLeft();
    }

    public void turn_Around(){
        super.turnLeft();
        super.turnLeft();
    }


    public abstract int get_time();


    public void print_one(){
        this.turn_Right();
        move(1);
        putThing();
        turnLeft();
        move();
        turnLeft();
        move();
        turn_Around();
        drawLine(6);
        turn_Right();
        move();
        turn_Around();
        drawLine(3);
        //relocate
        move();
        turnLeft();
        move(6);
        turn_Right();
    }

    public void print_two(){
        this.turn_Right();
        move(1);
        putThing();
        turnLeft();
        move();
        turnLeft();
        move();
        turn_Right();
        drawLine(3);
        turn_Right();
        move();
        drawLine(2);
        turn_Right();
        move();
        drawLine(1);
        turnLeft();
        move();
        drawLine(1);
        turn_Right();
        move();
        drawLine(1);
        turnLeft();
        move();
        turnLeft();
        drawLine(5);
        //relocate
        move();
        turnLeft();
        move(6);
        turn_Right();
    }

    public void print_three(){
        this.turn_Right();
        move(1);
        putThing();
        turnLeft();
        move();
        turnLeft();
        move();
        turn_Right();
        drawLine(3);
        turn_Right();
        move();
        drawLine(2);
        turn_Right();
        move();
        drawLine(3);
        turn_Around();
        move(4);
        turn_Right();
        move(); 
        drawLine(2);
        turn_Right();
        move();
        drawLine(3);
        turn_Right();
        move();
        drawLine(1);
        turn_Right();
       
        //relocate
        move(6);
        turnLeft();
        move(4);
        turn_Right();
    }

    public void print_four(){
        move(2);
        drawLine(1);
        turn_Right();
        drawLine(7);
        turn_Right();
        move(2);
        turn_Right();
        move(6);
        putThing();
        turn_Around();
        move(1);
        turn_Right();
        move();
        turnLeft();
        drawLine(1);
        turnLeft();
        drawLine(5);
        //relocate
        move(1);
        turnLeft();
        move(3);
        turn_Right();
    }


    public void print_five(){
        drawLine(5);
        turn_Around();
        move(5);
    }

}
