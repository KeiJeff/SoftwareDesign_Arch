 package spaceinvaders;
import java.awt.*;
/**
 * The Alien class.
 */
public class Alien {

    public static int ALIEN_HEIGHT = 25;
    public static int ALIEN_WIDTH = 15;

    private int leftPosition = 0;
    private int heightPosition = 0;

    private boolean hitState = false;//Whether this alien has already been shot

  //  private 
    Image alienImage = null;

    SpaceInvaders spaceInvaders = null;

    /**
     *
     */
    public Alien(Image ai, SpaceInvaders si) {
        alienImage = ai;
        spaceInvaders = si;
    }

    /**
     * Returns whether ythe alien had been hit
     */
    public boolean hasBeenHit() {
        return hitState;
    }

    /**
     * Check if a shot fired hit an alien
     */
    public boolean hitAlien(int x, int y) {

        //Is the alien currently alive?
        if (hitState) {
            //If it's alreay been shot then return false;
            return false;
        }

        //First lets check the X range
        if ((x >= leftPosition) && (x <= (leftPosition+ALIEN_WIDTH))) {
            //X is ok, now lets check the Y range
            if ((y >= heightPosition) && (y <= (heightPosition+ALIEN_HEIGHT))) {
                //We shot an alien!
                hitState = true;
                return true;
            }
        }
        return false;
    }

    /**
     * Set the position of the alien on the screen
     */
    public void setPosition(int x, int y) {
        leftPosition = x;
        heightPosition = y;
    }

    /**
     * Returns the current x position of the alien
     */
    public int getXPos() {
        return leftPosition;
    }

    /**
     * Returns the current x position of the alien
     */
    public int getYPos() {
        return heightPosition;
    }

    /**
     * Draw the image of the Alien
     */
    public void drawAlien(Graphics g) {
        if (!hitState) {
            g.setColor(Color.red);
            g.fillRect(leftPosition, heightPosition, ALIEN_WIDTH, ALIEN_HEIGHT);
        }
    }

}
