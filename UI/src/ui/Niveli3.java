package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

public class Niveli3 extends JFrame {

    Questions q = new Questions();
    private int pyetja = 0;

    public Niveli3() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jRadioButton1 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jButton1 = new JButton();
        vendosPytjen = new JLabel();
        jProgressBar1 = new JProgressBar();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(670, 405));
        setPreferredSize(new Dimension(670, 405));

        jPanel1.setLayout(null);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton1ActionPerformed(e);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(300, 240, 190, 24);

        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(300, 300, 190, 24);

        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(300, 270, 190, 24);

        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(300, 330, 190, 24);

        jButton1.setText("Dergo Pergjigjen");
        jPanel1.add(jButton1);
        jButton1.setBounds(501, 330, 130, 26);

        vendosPytjen.setFont(new Font("Bell MT", 1, 15));
        vendosPytjen.setForeground(new Color(250, 250, 250));
        vendosPytjen.setText("Ketu do jene pyetjet");
        vendosPytjen.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jPanel1.add(vendosPytjen);
        vendosPytjen.setBounds(300, 90, 330, 90);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(300, 30, 330, 30);

        jLabel2.setFont(new Font("Baskerville Old Face", 1, 24));
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setText("TOKA-Niveli 3");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 340, 200, 30);

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/terra2.jpg")));
        jLabel1.setVerticalAlignment(SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 380);

        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton2);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        vendosPytjen.setText(q.questions3[0]);
        jRadioButton1.setText(q.alt31[0]);
        jRadioButton2.setText(q.alt31[1]);
        jRadioButton3.setText(q.alt31[2]);
        jRadioButton4.setText(q.alt31[3]);

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

            if (mb.getActionCommand().contains(q.sakt3[pyetja])) {
                pyetja++;
                jProgressBar1.setValue(jProgressBar1.getValue() + 25);
                if (pyetja == 1) {
                    jRadioButton1.setText(q.alt32[0]);
                    jRadioButton2.setText(q.alt32[1]);
                    jRadioButton3.setText(q.alt32[2]);
                    jRadioButton4.setText(q.alt32[3]);
                } else if (pyetja == 2) {
                    jRadioButton1.setText(q.alt33[0]);
                    jRadioButton2.setText(q.alt33[1]);
                    jRadioButton3.setText(q.alt33[2]);
                    jRadioButton4.setText(q.alt33[3]);
                } else if (pyetja == 3) {
                    jRadioButton1.setText(q.alt34[0]);
                    jRadioButton2.setText(q.alt34[1]);
                    jRadioButton3.setText(q.alt34[2]);
                    jRadioButton4.setText(q.alt34[3]);
                }
                buttonGroup1.clearSelection();
                if (jProgressBar1.getValue() == 100) {

                    Object[] options1 = {"PO", "JO"};
                    JPanel paneli = new JPanel();
                    paneli.add(new JLabel("A ka jete ne Mars:"));
                    int result = JOptionPane.showOptionDialog(null, paneli, "",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options1, null);

                    if (result == JOptionPane.NO_OPTION) {
                        Niveli4 l = new Niveli4();
                        l.setVisible(true);
                        l.setLocationRelativeTo(null);
                        JOptionPane.showMessageDialog(null, "Ju sapo kaluat ne Nivelin 4!");
                        this.dispose();
                    } else {
                        pyetja = 0;
                        Niveli3 l = new Niveli3();
                        l.setVisible(true);
                        l.setLocationRelativeTo(null);
                        this.dispose();
                    }
                }
                if (pyetja < 4) {
                    vendosPytjen.setText(q.questions3[pyetja]);
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

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JProgressBar jProgressBar1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JLabel vendosPytjen;
    private ButtonGroup buttonGroup1;

}
