package GOT;


import javafx.scene.input.KeyCode;

public class KeyManager {

    private boolean [] keystates; // array of booleans... // each index is up, down , left ,right

    public KeyManager() {

        keystates = new boolean[6];
    }

    public int keycodeToindx(KeyCode k)
    {

        switch(k)
        {
            case W:
                return 0;

            case S:
                return 1;

            case UP :
                return 2;

            case DOWN :
                return 3;

            case SPACE:
                return 4;

            case ENTER:
                return 5;
            default:
                return -1 ;

        }

    }

    public void setState(KeyCode k, boolean state )
    {
        int i = keycodeToindx(k);
        if ( i != -1)
        { keystates[i]= state;}
    }


    public boolean getkeystate ( KeyCode k)
    {
        int i = keycodeToindx(k);
        return keystates[i];
    }
}

