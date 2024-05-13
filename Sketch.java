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
    if (mousePressed) {
      text("mouse is pressed!!!", width / 3, height / 4);
    }
    if(keyPressed){
      text("a key is pressed!!!", width / 5, height / 5);
    }
  }
  /**
   * Description: This method is called when the mouse is clicked. It will load a random flower image and display it at the mouse's location.
   * @author: Austin L
   */
  public void mouseClicked() {
    String[] flowerFiles = {"BlueFlower.png", "OrangeFlower.png", "PinkFlower.png"};
    int intIndex = (int) random(flowerFiles.length);
    PImage flowerImage = loadImage(flowerFiles[intIndex]);
    float fltScale = (float) 0.5; // Scale factor to make the flower smaller
    flowerImage.resize((int)(flowerImage.width * fltScale), (int)(flowerImage.height * fltScale)); // Resize the image
    image(flowerImage, mouseX - flowerImage.width / 2, mouseY - flowerImage.height / 2); // Center the image on the cursor
  }
  /**
   * Description: This method is called when the mouse is dragged. It will load a grass image and display it at the mouse's location. The grass image will be centered on the cursor.
   * @author: Austin L
   */
  public void mouseDragged() {
    PImage grassImage = loadImage("BetterGrassImage.png");
    float fltScale = 0.05f; // Further reduce scale factor to make the grass even smaller
    grassImage.resize((int)(grassImage.width * fltScale), (int)(grassImage.height * fltScale)); // Resize the image
    image(grassImage, mouseX - grassImage.width / 2, mouseY - grassImage.height / 2); // Center the image on the cursor
  }
  /**
   * Description: This method is called when the mouse wheel is scrolled. It will load a butterfly image and display it at the mouse's location. The butterfly image will be centered on the cursor.
   * @param event: The mouse event that is triggered when the mouse wheel is scrolled.
   * @author: Austin L
   */
  public void mouseWheel(MouseEvent event) {
    String[] butterflyFiles = {"Butterfly.png"};
    int intIndex = (int) random(butterflyFiles.length);
    PImage butterflyImage = loadImage(butterflyFiles[intIndex]);
    float fltScale = 0.1f; // Scale factor to make the butterfly smaller
    butterflyImage.resize((int)(butterflyImage.width * fltScale), (int)(butterflyImage.height * fltScale)); // Resize the image
    image(butterflyImage, mouseX - butterflyImage.width / 2, mouseY - butterflyImage.height / 2); // Center the image on the cursor
  }

  boolean boolBPressed = false;
  boolean boolRPressed = false;
  /**
   * Description: This method is called when a key is pressed. It will display text based on the key pressed.
   * If the 'B' key is pressed, the background will turn blue. If the 'R' key is pressed, the background will turn red.
   * If both the 'B' and 'R' keys are pressed, the background will turn purple.
   * The boolean variables boolBPressed and boolRPressed are used to keep track of whether the 'B' and 'R' keys are pressed, respectively.
   * If the 'B' or 'R' key is released, the corresponding boolean variable will be set to false.
   * @author: Austin L
   */
  public void keyPressed() {
    if (keyCode == UP) {
      text("up arrow", width / 3, height / 2);
    } else if (keyCode == DOWN) {
      text("down arrow", width / 2, height / 3);
    } else if (keyCode == LEFT) {
      text("left arrow", width / 3, height / 3);
    } else if (keyCode == RIGHT) {
      text("right arrow", width / 2, height / 2);
    }
    if (key == 'B' || key == 'b') {
      background(0, 0, 255);
    } else if (key == 'R' || key == 'r') {
      background(255, 0, 0);
    }
    if (key == 'B' || key == 'b') {
      boolBPressed = true;
    } else if (key == 'R' || key == 'r') {
      boolRPressed = true;
    }
    if (boolBPressed && boolRPressed) {
      background(128, 0, 128);
    }
  }
  /**
   * Description: This method is called when a key is released.
   * It will set the boolean variables boolBPressed and boolRPressed to false if the 'B' or 'R' key is released, respectively.
   * @author: Austin L
   */
  public void keyReleased() {
    if (key == 'B' || key == 'b') {
      boolBPressed = false;
    } else if (key == 'R' || key == 'r') {
      boolRPressed = false;
    }
  }
}