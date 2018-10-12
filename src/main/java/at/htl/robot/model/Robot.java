package at.htl.robot.model;

public class Robot {

    private int y;
    private int x;
    private Direction direction = Direction.SOUTH;


    //region Getter and Setter
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    //endregion

    public  void stepForward() {
        if (this.direction == Direction.SOUTH){
            y++;
        }else if (this.direction == Direction.EAST){
            x++;
        }else if (this.direction == Direction.NORTH){
            y--;
        }else{
            x--;
        }
    }

    public  void    rotateLeft() {
        if (this.direction == Direction.SOUTH){
            this.direction = Direction.EAST;
        }else if (this.direction == Direction.EAST){
            this.direction = Direction.NORTH;
        }else if (this.direction == Direction.NORTH){
            this.direction = Direction.WEST;
        }else{
            this.direction = Direction.SOUTH;
        }
    }
}





