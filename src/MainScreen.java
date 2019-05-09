import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.*;

public class MainScreen extends JFrame implements ActionListener {

    private Network liveComponents;
    private double totalPrice;
    private double uptime;

    //Where the menu is created:
    private JMenuBar menuBar;
    private JMenu menuBerekening, menuOptimaliseer, menuOpslaan;
    private JMenuItem menuItem;

    //items
    private JLabel web1,web2,web3;

    public MainScreen(Network liveComponents) {

        //get current screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //default config screen
        setTitle("Hoofdscherm");
        setLayout(new GridLayout(2, 9));
        setSize(screenSize.width, screenSize.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true);

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

        web1 = new JLabel();
        web2 = new JLabel();
        web3 = new JLabel();
        web1.setIcon(new ImageIcon("D:\\Users\\lars\\Desktop\\50.png"));
        web2.setIcon(new ImageIcon("D:\\Users\\lars\\Desktop\\50.png"));

        MouseListener m1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }

            @Override
            public void mousePressed(MouseEvent e) {

                JComponent jc = (JComponent) e.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, e, TransferHandler.COPY);

                System.out.println("test");


            }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        };

        web1.addMouseListener(m1);
        web2.addMouseListener(m1);
        web3.addMouseListener(m1);

        web1.setTransferHandler(new TransferHandler("icon"));
        web2.setTransferHandler(new TransferHandler("icon"));
        web3.setTransferHandler(new TransferHandler("icon"));

        add(web1);
        add(web2);
        add(web3);

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
            } else if (e.getSource() == menuOptimaliseer) {
                System.out.println("Optimaliseer menu");
            } else if (e.getSource() == menuOpslaan) {
                System.out.println("Opslaan menu");
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
