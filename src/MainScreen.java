import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainScreen extends JFrame implements ActionListener {

    private Network liveComponents;
    private double totalPrice;
    private double uptime;

    //Where the menu is created:
    private JMenuBar menuBar;
    private JMenu menuBerekening, menuOptimaliseer, menuOpslaan;
    private JMenuItem menuItem;

    public MainScreen(Network liveComponents) {

        //get current screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //default config screen
        setTitle("Hoofdscherm");
        setLayout(new GridLayout(3, 1));
        setSize(screenSize.width, screenSize.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);


        //menu config
        //The menu bar.
        menuBar = new JMenuBar();

        //The menu.
        menuBerekening = new JMenu("Nieuwe berekening");
        menuBerekening.setMnemonic(KeyEvent.VK_A);
        menuBerekening.addMenuListener(new SampleMenuListener());
        menuBar.add(menuBerekening);

        menuOptimaliseer = new JMenu("Optimaliseer");
        menuOptimaliseer.setMnemonic(KeyEvent.VK_A);
        menuOptimaliseer.addMenuListener(new SampleMenuListener());
        menuBar.add(menuOptimaliseer);

        menuOpslaan = new JMenu("Opslaan");
        menuOpslaan.setMnemonic(KeyEvent.VK_A);
        menuOpslaan.addMenuListener(new SampleMenuListener());
        menuBar.add(menuOpslaan);

        setJMenuBar(menuBar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("test");

    }

    public class SampleMenuListener implements MenuListener {

        @Override
        public void menuSelected(MenuEvent e) {
            if (e.getSource() == menuBerekening) {
                System.out.println("Berekening menu");
            } else {
                System.out.println("menuSelected");
            }
        }

        @Override
        public void menuDeselected(MenuEvent e) {
            System.out.println("menuDeselected");
        }

        @Override
        public void menuCanceled(MenuEvent e) {
            System.out.println("menuCanceled");
        }
    }
}
