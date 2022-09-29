package flowers;

import lombok.Data;

import java.util.Objects;
@Data
public class FlowerPot {
    // Konstante
  public final static double MAX_DIAMETER = 100;
  public final static double MIN_DIAMETER = 0.1;


    // Eigenschaften
   private String color;
    private String size;
    private String shape;
    private  String material;
    private double diameter;
    private boolean hole;

    public FlowerPot(String color) {
        this.color = color;
    }

}
