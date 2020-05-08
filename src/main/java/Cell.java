import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Cell extends Rectangle {
    private int currentValue;
    private int greatestValue;
    private int inheritance = 0;
    private boolean isArmageddon = false;

    private BufferedImage currentImage;
    private Cells cells;

    public Cell(int x, int y, int w, int h, int value, BufferedImage bufferedImage, Cells cells) {
        super(x, y, w, h);
        this.currentImage = bufferedImage;
        this.cells = cells;
        currentValue = greatestValue = value;
    }

    public void increaseValue() {
        if (currentValue == greatestValue && currentValue < 8) {
            currentValue++;
            greatestValue++;
            refreshCellImage();
        } else if (currentValue < greatestValue && currentValue < 8) {
            currentValue++;
            refreshCellImage();
        }
    }

    public void decreaseValue() {
        if(currentValue > 1) {
            currentValue--;
            refreshCellImage();
        }
    }


    public void reduceSize(int percent) {
        x += (int) Math.round(0.01 * percent * currentImage.getWidth() / 2);
        y += (int) Math.round(0.01 * percent * currentImage.getHeight() / 2);

        refreshCellImage();
    }

    private void refreshCellImage() {
        if (currentValue > 0) {
            currentImage = cells.getCellImage(currentValue - 1, greatestValue - 1);
            width = currentImage.getWidth();
            height = currentImage.getHeight();
        }
    }

    public boolean isOccupiedSpace(Cell c){
        return intersects(c) || contains(c);
    }

    public boolean isArmageddon() {
        return isArmageddon;
    }

    public BufferedImage getCurrentImage() {
        return currentImage;
    }

    public int getXPosition() {
        return x;
    }

    public int getYPosition() {
        return y;
    }

    public int getInheritance() {
        return inheritance;
    }

    public int getGreatestValue() {
        return greatestValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setArmageddon(boolean armageddon) {
        isArmageddon = armageddon;
    }

    public void setInheritance(int inheritance) {
        this.inheritance = inheritance;
    }
}

