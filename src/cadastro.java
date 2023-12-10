import javax.security.auth.login.LoginContext;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastro extends JFrame {

    public String vnome, vtel, vemail, vcpf;
    private JLabel lusuario, lsenha, lcomfirmsenha, lNome, lCPF, lemail, ltelefone;

    private JCheckBox cmasc, cfem, cnull, cH;

    private JTextField tusuario, tNome, tCPF, temail, ttelefone;

    private JPasswordField psenha, pconfirmsenha;

    private JButton Benviar, Bvoltar;

    private void iniciar(){
        setVisible(true);
        setSize(500,550);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void contruindo(){
        lusuario = new JLabel("Usuario:");
        lsenha = new JLabel("senha:");
        lcomfirmsenha = new JLabel("Confirmar:");

        lNome = new JLabel("Nome:");
        ltelefone = new JLabel("Telefone:");
        lemail = new JLabel("Email:");
        lCPF = new JLabel("CPF:");

        cmasc = new JCheckBox("Masculino");
        cfem = new JCheckBox("Feminino");
        cnull = new JCheckBox("N.D.A.");
        cH = new JCheckBox("Helicoptero");


        Benviar = new JButton("Enviar");
        Bvoltar = new JButton("Voltar");

        tusuario = new JTextField();

        tNome = new JTextField();
        ttelefone = new JTextField();
        temail = new JTextField();
        tCPF = new JTextField();

        psenha = new JPasswordField();
        pconfirmsenha = new JPasswordField();
    }

    private void bound(){

        cmasc.setBounds(18,10,100,30);
        cfem.setBounds(18,30,100,30);
        cnull.setBounds(18,50,100,30);
        cH.setBounds(18,70,100,30);


        lNome.setBounds(18,100,150,30);
        ltelefone.setBounds(18,150,150,30);
        lemail.setBounds(18,200,150,30);
        lCPF.setBounds(18,250,150,30);

        tNome.setBounds(120, 100, 200,30);
        ttelefone.setBounds(120, 150, 200,30);
        temail.setBounds(120, 200, 200,30);
        tCPF.setBounds(120, 250, 200,30);


        Bvoltar.setBounds(18,450,150,30);
        Benviar.setBounds(200,450,150,30);

        lusuario.setBounds(50,300,300,30);
        lcomfirmsenha.setBounds(50, 350,200,30);
        lsenha.setBounds(50, 400,300,30);


        tusuario.setBounds(120, 300, 200,30);

        psenha.setBounds(120,400,200,30);
        pconfirmsenha.setBounds(120,350,200,30);


    }

    private void adicionar(){
        add(lsenha);
        add(lcomfirmsenha);

        add(lusuario);

        add(tusuario);

        add(psenha);
        add(pconfirmsenha);

        add(Benviar);
        add(Bvoltar);

        add(tNome);
        add(ttelefone);
        add(temail);
        add(tCPF);

        add(lNome);
        add(ltelefone);
        add(lemail);
        add(lCPF);

        add(cfem);
        add(cmasc);
        add(cnull);
        add(cH);

    }

    public void dados(){
        vnome = tNome.getText();
        vtel = ttelefone.getText();
        vemail = ttelefone.getText();
        vcpf = tCPF.getText();
    }

    cadastro(){
        this.iniciar();
        this.contruindo();
        this.bound();
        this.adicionar();

        Benviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vuser = tusuario.getText();
                String Vsenha = psenha.getText();
                String VCsenha = pconfirmsenha.getText();

                dados();


                if(Vsenha.equals(VCsenha)){
                    JOptionPane.showMessageDialog(null, "Cadastro Concluido!");
                    setVisible(false);
                    new login(vuser,Vsenha);
                }
                else{
                    JOptionPane.showMessageDialog(null, "senha não combina");
                }



            }
        });

        Bvoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new inicial();
            }
        });




    }
}

