package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Niveli1 extends JFrame {

    Questions q = new Questions();
    private int pyetja = 0;

    public Niveli1() {
        initComponents();
        setLocationRelativeTo(null);
        vendosPytjen.setText(q.questions1[0]);
        setVisible(true);
    }

    private void initComponents() {
        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jProgressBar1 = new JProgressBar();
        label1 = new Label();
        jButton1 = new JButton();
        jLabel1 = new JLabel();
        vendosPytjen = new JFormattedTextField();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jLabel7 = new JLabel();
        percent = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(0, 0, 0));
        jPanel1.setLayout(null);

        jProgressBar1.setForeground(new Color(204, 153, 255));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(270, 320, 340, 20);

        label1.setAlignment(Label.CENTER);
        label1.setBackground(new Color(0, 0, 0));
        label1.setFont(new Font("DialogInput", 1, 18));
        label1.setForeground(new Color(250, 250, 250));
        label1.setText("Merkuri-Niveli 1");
        jPanel1.add(label1);
        label1.setBounds(20, 320, 180, 30);

        jButton1.setText("Dergo pergjigje");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 250, 120, 26);

        jLabel1.setFont(new Font("Bookman Old Style", 1, 14));
        jLabel1.setForeground(new Color(250, 40, 2));
        jLabel1.setText("Fuel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 320, 32, 20);

        vendosPytjen.setBackground(new Color(0, 0, 0));
        vendosPytjen.setForeground(new Color(250, 250, 250));
        vendosPytjen.setFont(new Font("Baskerville Old Face", 1, 13));
        jPanel1.add(vendosPytjen);
        vendosPytjen.setBounds(290, 60, 340, 90);

        jRadioButton2.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new Color(250, 250, 250));
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(290, 230, 96, 24);

        jRadioButton1.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new Color(250, 250, 250));
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(290, 260, 96, 24);

        jRadioButton3.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new Color(250, 250, 250));
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(290, 200, 96, 24);

        jRadioButton4.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setForeground(new Color(250, 250, 250));
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(290, 170, 96, 24);

        jLabel7.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mercury_in_false_colour_Caloris_basin_1163x872.jpg")));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 400, 370);

        percent.setFont(new java.awt.Font("Dialog", 1, 14));
        percent.setForeground(new Color(250, 250, 250));
        percent.setHorizontalAlignment(SwingConstants.CENTER);
        percent.setText("0%");
        jPanel1.add(percent);
        percent.setBounds(610, 320, 30, 20);

        jRadioButton1.setText(q.alt11[0]);
        jRadioButton2.setText(q.alt11[1]);
        jRadioButton3.setText(q.alt11[2]);
        jRadioButton4.setText(q.alt11[3]);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        vendosPytjen.setEditable(false);
        jRadioButton1.setActionCommand(jRadioButton1.getText());
        jRadioButton2.setActionCommand(jRadioButton2.getText());
        jRadioButton3.setActionCommand(jRadioButton3.getText());
        jRadioButton4.setActionCommand(jRadioButton4.getText());

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        ButtonModel mb = buttonGroup1.getSelection();

        if (mb == null) {
            JOptionPane.showMessageDialog(this, "Vendos nje pergjigje!", "Invalid Answer", JOptionPane.ERROR_MESSAGE);
        } else {

            if (mb.getActionCommand().contains(q.sakt1[pyetja])) {
                pyetja++;
                jProgressBar1.setValue(jProgressBar1.getValue() + 25);
                percent.setText(Integer.toString(jProgressBar1.getValue()) + "%");
                if (pyetja == 1) {
                    jRadioButton1.setText(q.alt12[0]);
                    jRadioButton2.setText(q.alt12[1]);
                    jRadioButton3.setText(q.alt12[2]);
                    jRadioButton4.setText(q.alt12[3]);
                } else if (pyetja == 2) {
                    jRadioButton1.setText(q.alt13[0]);
                    jRadioButton2.setText(q.alt13[1]);
                    jRadioButton3.setText(q.alt13[2]);
                    jRadioButton4.setText(q.alt13[3]);
                } else if (pyetja == 3) {
                    jRadioButton1.setText(q.alt14[0]);
                    jRadioButton2.setText(q.alt14[1]);
                    jRadioButton3.setText(q.alt14[2]);
                    jRadioButton4.setText(q.alt14[3]);
                }
                buttonGroup1.clearSelection();

                if (jProgressBar1.getValue() == 100) {

                    Object[] options1 = {"PO", "JO"};
                    JPanel paneli = new JPanel();
                    paneli.add(new JLabel("Venusi quhet ndryshe si ylli i mengjesit"));
                    int result = JOptionPane.showOptionDialog(null, paneli, "",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options1, null);

                    if (result == JOptionPane.YES_OPTION) {
                        Niveli2 l = new Niveli2();
                        l.setVisible(true);
                        l.setLocationRelativeTo(null);
                        JOptionPane.showMessageDialog(null, "Ju sapo kaluat ne Nivelin 2!");
                        this.dispose();
                    } else {
                        pyetja = 0;
                        Niveli1 l = new Niveli1();
                        l.setVisible(true);
                        l.setLocationRelativeTo(null);
                        this.dispose();
                    }
                }
                if (pyetja < 4) {
                    vendosPytjen.setText(q.questions1[pyetja]);
                    jRadioButton1.setActionCommand(jRadioButton1.getText());
                    jRadioButton2.setActionCommand(jRadioButton2.getText());
                    jRadioButton3.setActionCommand(jRadioButton3.getText());
                    jRadioButton4.setActionCommand(jRadioButton4.getText());
                }

            } else {
                Object[] options1 = {"Provo Perseri!", "DIL!"};
                JPanel paneli = new JPanel();
                paneli.add(new JLabel("Pergjigje e gabuar!"));
                int result = JOptionPane.showOptionDialog(null, paneli, "",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options1, null);
                if (result == JOptionPane.YES_OPTION) {
                    Fillimi s = new Fillimi();
                    s.setVisible(true);
                    s.setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    System.exit(0);
                }
            }

        }
    }
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JProgressBar jProgressBar1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private Label label1;
    private JLabel percent;
    private JFormattedTextField vendosPytjen;

}
