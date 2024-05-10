import processing.core.PApplet;
import processing.core.PImage;
import processing.event.MouseEvent;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   *
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // No changes needed in draw method based on the instructions

  }
  
  public void mouseClicked() {
    String[] flowerFiles = {"BlueFlower.png", "OrangeFlower.png", "PinkFlower.png"};
    int index = (int) random(flowerFiles.length);
    PImage flowerImage = loadImage(flowerFiles[index]);
    float scale = (float) 0.5; // Scale factor to make the flower smaller
    flowerImage.resize((int)(flowerImage.width * scale), (int)(flowerImage.height * scale)); // Resize the image
    image(flowerImage, mouseX - flowerImage.width / 2, mouseY - flowerImage.height / 2); // Center the image on the cursor
  }
public void mouseDragged() {
  PImage grassImage = loadImage("BetterGrassImage.png");
  float scale = 0.05f; // Further reduce scale factor to make the grass even smaller
  grassImage.resize((int)(grassImage.width * scale), (int)(grassImage.height * scale)); // Resize the image
  image(grassImage, mouseX - grassImage.width / 2, mouseY - grassImage.height / 2); // Center the image on the cursor
}
public void mouseWheel(MouseEvent event) {
  float e = event.getCount();
  String[] butterflyFiles = {"Butterfly.png"};
  int index = (int) random(butterflyFiles.length);
  PImage butterflyImage = loadImage(butterflyFiles[index]);
  float scale = 0.1f; // Scale factor to make the butterfly smaller
  butterflyImage.resize((int)(butterflyImage.width * scale), (int)(butterflyImage.height * scale)); // Resize the image
  image(butterflyImage, mouseX - butterflyImage.width / 2, mouseY - butterflyImage.height / 2); // Center the image on the cursor
}
public void keyPressed() {
  if (key == 'B' || key == 'b') {
    background(0, 0, 255); // Set background to blue
  } else if (key == 'R' || key == 'r') {
    background(255, 0, 0); // Set background to red
  }
}


}