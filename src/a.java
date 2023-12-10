import javax.swing.*;

public class a extends JPanel {
    private JLabel lNome, lCPF, lemail, ltelefone;
    a(){
        setLayout(null);

        lNome = new JLabel();
        lCPF = new JLabel();
        lemail = new JLabel();
        ltelefone = new JLabel();


        add(lNome);
        add(lCPF);
        add(lemail);
        add(ltelefone);

        lNome.setBounds(50,120,150,30);
        ltelefone.setBounds(50,130,150,30);
        lemail.setBounds(50,140,150,30);
        lCPF.setBounds(50,150,150,30);



    }
}