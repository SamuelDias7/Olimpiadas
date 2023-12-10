
import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

class inicial extends JFrame {
    private JButton Blogar, Bcadastro;

    inicial() {

        setVisible(true);
        setSize(400, 400);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Blogar = new JButton("logar");
        Bcadastro = new JButton("cadastrar");

        add(Blogar);
        add(Bcadastro);

        Bcadastro.setBounds(18, 150, 150, 30);
        Blogar.setBounds(200, 150, 150, 30);

        Blogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sem usuario cadastrado");
            }
        });

        Bcadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new cadastro();
            }
        });


    }
}