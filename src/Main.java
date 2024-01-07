//Sam Alaboudi
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){FirstGui defC = new FirstGui();
                defC.show(true);

                FirstGui ovC = new FirstGui("Test",1080,1080);
                ovC.show(true);

            }

        });
    }
}
//Things to do:
// remove base window