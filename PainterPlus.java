import org.code.neighborhood.*;
public class PainterPlus extends Painter {

  //Turn right method
  public void turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
}

  //Take all paint method
  public void takeAllPaint() {
    while(isOnBucket()) {
      takePaint();
    }
  }

  //Move fast method
  public void moveFast() {
    while(canMove()){
      move();
    }
  }

  //Paint to empty method
  public void paintToEmpty(String color) {
    while(hasPaint()) {
      paint(color);
      move();
    }
  }

  //Paint donut method
  public void paintDonut(String color) {
    while(hasPaint()) {
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    }
  }
}
