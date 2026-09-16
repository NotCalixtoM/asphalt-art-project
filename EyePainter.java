import org.code.neighborhood.*;
public class EyePainter extends PainterPlus {
  /**
  *Paints two eyes by setting a painter's paint
  *moving it into position and painting a single square
  *then doing that same process for the next eye
  */
public void paintEyes(String color) {
  //Sets the painter's paint
  setPaint(2);
  /**
    *Left Eye
    */
  move();
  move();
  turnRight();
  move();
  move();
  paint(color);
  /*
  *Right Eye
   */ 
  turnLeft();
  move();
  move();
  move();
  paint(color);
}

}