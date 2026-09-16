import org.code.neighborhood.*;
public class CirclePainter extends PainterPlus {
    /**
    *Paints a circle by setting the paint to 20
    *Moving forward, 
    **hen moving forard and painting a side of the circle in a specified pattern while it has paint.
      */
  public void paintCircle(String color) {
    setPaint(20);
    move();
    while (hasPaint()) {
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      turnLeft();
      move();
      paint(color);
      move();
      turnRight();
    }
  }


/**
  *Fills the circle shape with a solid color by setting the paint to 24,
  *filling in the inside 4x6 rectangle with a solid color
  *then filling the the top and bottom sides of the final shape
  */
  public void fillCircle(String color) {
setPaint(24);
turnRight();
move();
move();
while (hasPaint()) {
  if(isFacingSouth()){
paint(color);
move();
paint(color);
move();
paint(color);
move();
paint(color);
turnLeft();
move();
turnLeft();
  }
  else {
paint(color);
move();
paint(color);
move();
paint(color);
move();
paint(color);
turnRight();
move();
turnRight();
  }
}
turnLeft();
turnLeft();
move();
turnLeft();
move();
move();
setPaint(8);
while(hasPaint()) {
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnLeft();
  move();
  move();
  move();
  move();
  move();
  turnLeft();
}

}
  
}
