import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JLabel lusuario, lsenha;

    private JTextField tusuario;

    private JPasswordField psenha;

    private JButton Bentrar, BVoltar;

    private void iniciar(){
        setVisible(true);
        setSize(400,400);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void construindo(){
        lusuario = new JLabel("Usuario:");
        lsenha = new JLabel("senha:");

        Bentrar = new JButton("Entrar");


        tusuario = new JTextField();

        psenha = new JPasswordField();
    }
    private void bound(){

        lusuario.setBounds(50,100,300,30);
        lsenha.setBounds(50, 150,300,30);

        tusuario.setBounds(120, 100, 200,30);
        psenha.setBounds(120,150,200,30);
        Bentrar.setBounds(18,250,150,30);
    }
    private void adicionando(){

        add(lsenha);
        add(lusuario);
        add(tusuario);
        add(psenha);
        add(Bentrar);
    }

    login(String user, String senha){


        this.iniciar();
        this.construindo();
        this.bound();
        this.adicionando();



        Bentrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tusuario.getText().equals(user)&& psenha.getText().equals(senha)){

                    JOptionPane.showMessageDialog(null, "Dados corretos");
                    new Menu();
                    setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(null, "Dados incorretos");
                    JOptionPane.showMessageDialog(null, tusuario + user);
                    JOptionPane.showMessageDialog(null, psenha + senha);
                }
            }
        });




    }
}

