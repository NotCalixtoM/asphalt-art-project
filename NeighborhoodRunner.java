import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //Instantiates a new BackgroundPainter object and calls the paintBackground function
    BackgroundPainter fakeTyler = new BackgroundPainter();
    fakeTyler.paintBackground("DimGray", 64);
    
    //Instantiates a new CirclePainter object and calls the methods paintCircle and 
    CirclePainter happyTyler = new CirclePainter ();
    happyTyler.paintCircle("Black");
    happyTyler.fillCircle("Yellow");

    //Instantiates a new CirclePainter object and calls the method paintCircle
    EyePainter Tieler = new EyePainter ();
    Tieler.paintEyes("Black");

    //Instantiates a new MouthPainter object and calls the method paintMouth
    MouthPainter NormalTyler = new MouthPainter();
    NormalTyler.paintMouth("black");

  }
}
