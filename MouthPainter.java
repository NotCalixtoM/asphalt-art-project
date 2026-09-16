import org.code.neighborhood.*;
public class MouthPainter extends PainterPlus{
  /**
  *Paints a mouth by moving into position then
  *Painting and moving in order to create the curved line shape of a mouth
  */
  public void paintMouth(String color) {
setPaint(8);
    move();
    move();
  turnRight();
    move();
    move();
    move();
    move();
  paint(color);
  move();
  turnLeft();
  move();
  paint(color);
  move();
  paint(color);
  move();
  turnLeft();
  move();
  paint(color);
  }
}