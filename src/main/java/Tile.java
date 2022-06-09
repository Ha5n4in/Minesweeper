public class Tile {

    //Properties
    private boolean Visible;
    private boolean Flag;
    private boolean Mine;
    private int NumOfContacts;

    public Tile() {
        resetTile();
    }

    public void resetTile() {
        Visible = false;
        Mine = false;
        Flag = false;
        NumOfContacts = 0;
    }

    //Methods
    public void Show() {
        Visible = true;
    }

    public boolean getVisible() {
        return Visible;
    }

    public void setToMine() {
        Mine = true;
    }

    public boolean getIsMine() {
        return Mine;
    }

    public void addContact() {
        NumOfContacts++;
    }

    public int getNumOfContacts() {
        return NumOfContacts;
    }

    public boolean getFlagged() {
        return Flag;
    }

    public void toggleFlag() {
        Flag = !Flag;
    }

    public String toString() {
        if (Visible) {
            if (Mine) {
                return "B";
            } else {
                return "" + NumOfContacts;
            }
        }else if (Flag) {
            return "F";
        } else {
            return "*";
        }
    }
}
