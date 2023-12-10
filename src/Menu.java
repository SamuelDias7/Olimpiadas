import javax.swing.*;

public class Menu extends JFrame {
    JMenuBar bar;
    JMenu menu;
    JMenuItem item1,item2,item3;


    Menu(){

        bar = new JMenuBar();
        menu = new JMenu("MENU");
        item1 = new JMenuItem("a");
        item2 = new JMenuItem("b");
        item3 = new JMenuItem("c");


        setJMenuBar(bar);
        bar.add(menu);
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);



        setVisible(true);
        setSize(400, 400);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        item1.addActionListener(e -> {
            new a();
        });


    }
}


