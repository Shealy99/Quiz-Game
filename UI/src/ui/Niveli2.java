package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Niveli2 extends JFrame {

    int pyetja = 0;
    Questions q = new Questions();

    public Niveli2() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        vendosPytjen.setText(q.questions2[0]);
    }

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        jRadioButton3 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton1 = new JRadioButton();
        vendosPytjen = new JFormattedTextField();
        jProgressBar1 = new JProgressBar();
        Backgroundi = new JLabel();

        jProgressBar1.setValue(0);

        jRadioButton1.setText(q.alt21[0]);
        jRadioButton2.setText(q.alt21[1]);
        jRadioButton3.setText(q.alt21[2]);
        jRadioButton4.setText(q.alt21[3]);

        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setText("Dergo");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 300, 90, 26);

        jRadioButton1.setActionCommand(jRadioButton1.getText());
        jRadioButton2.setActionCommand(jRadioButton2.getText());
        jRadioButton3.setActionCommand(jRadioButton3.getText());
        jRadioButton4.setActionCommand(jRadioButton4.getText());

        jLabel2.setFont(new Font("Baskerville Old Face", 3, 36));
        jLabel2.setForeground(new Color(250, 250, 250));
        jLabel2.setText("Venus-Niveli 2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 290, 280, 60);

        jRadioButton3.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new Font("Footlight MT Light", 1, 14));
        jRadioButton3.setForeground(new Color(250, 250, 250));
        jRadioButton3.setToolTipText("");
        jRadioButton3.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButton3.setHorizontalTextPosition(SwingConstants.LEFT);
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(320, 200, 310, 22);

        jRadioButton2.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new Font("Footlight MT Light", 1, 14));
        jRadioButton2.setForeground(new Color(250, 250, 250));
        jRadioButton2.setToolTipText("");
        jRadioButton2.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButton2.setHorizontalTextPosition(SwingConstants.LEFT);
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(320, 230, 310, 22);

        jRadioButton4.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new Font("Footlight MT Light", 1, 14));
        jRadioButton4.setForeground(new Color(250, 250, 250));
        jRadioButton4.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButton4.setHorizontalTextPosition(SwingConstants.LEFT);
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(320, 260, 310, 22);

        jRadioButton1.setBackground(new Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new Font("Footlight MT Light", 1, 14));
        jRadioButton1.setForeground(new Color(250, 250, 250));
        jRadioButton1.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButton1.setHorizontalTextPosition(SwingConstants.LEFT);
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(320, 170, 310, 22);

        vendosPytjen.setBackground(new Color(0, 0, 0));
        vendosPytjen.setForeground(new Color(250, 205, 250));
        vendosPytjen.setText("Ketu vendosen pyetjet ");
        vendosPytjen.setFont(new Font("Baskerville Old Face", 1, 15));
        jPanel1.add(vendosPytjen);
        vendosPytjen.setBounds(320, 40, 310, 110);

        jProgressBar1.setBackground(new Color(250, 250, 250));
        jProgressBar1.setForeground(new Color(250, 58, 10));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(320, 340, 310, 20);

        Backgroundi.setHorizontalAlignment(SwingConstants.CENTER);
        Backgroundi.setIcon(new ImageIcon(getClass().getResource("/galaxy-wallpaper-hd-20.jpg")));
        Backgroundi.setVerticalAlignment(SwingConstants.BOTTOM);
        Backgroundi.setHorizontalTextPosition(SwingConstants.RIGHT);
        Backgroundi.setMaximumSize(new Dimension(500, 80));
        Backgroundi.setMinimumSize(new Dimension(500, 80));
        Backgroundi.setPreferredSize(new Dimension(500, 80));
        jPanel1.add(Backgroundi);
        Backgroundi.setBounds(0, 0, 680, 390);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        vendosPytjen.setEditable(false);
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        ButtonModel mb = buttonGroup1.getSelection();
        if (mb == null) {
            JOptionPane.showMessageDialog(this, "Vendos nje pergjigje!", "Invalid Answer", JOptionPane.ERROR_MESSAGE);
        } else {

            if (mb.getActionCommand().contains(q.sakt2[pyetja])) {
                pyetja++;
                jProgressBar1.setValue(jProgressBar1.getValue() + 25);
                if (pyetja == 1) {
                    jRadioButton1.setText(q.alt22[0]);
                    jRadioButton2.setText(q.alt22[1]);
                    jRadioButton3.setText(q.alt22[2]);
                    jRadioButton4.setText(q.alt22[3]);
                } else if (pyetja == 2) {
                    jRadioButton1.setText(q.alt23[0]);
                    jRadioButton2.setText(q.alt23[1]);
                    jRadioButton3.setText(q.alt23[2]);
                    jRadioButton4.setText(q.alt23[3]);
                } else if (pyetja == 3) {
                    jRadioButton1.setText(q.alt24[0]);
                    jRadioButton2.setText(q.alt24[1]);
                    jRadioButton3.setText(q.alt24[2]);
                    jRadioButton4.setText(q.alt24[3]);
                }
                buttonGroup1.clearSelection();
                if (jProgressBar1.getValue() == 100) {

                    Object[] options1 = {"Sferike", "Sfere Ovale"};
                    JPanel paneli = new JPanel();
                    paneli.add(new JLabel("Cfare forme ka Toka?"));
                    int result = JOptionPane.showOptionDialog(null, paneli, "",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options1, null);

                    if (result == JOptionPane.NO_OPTION) {
                        Niveli3 l = new Niveli3();
                        l.setVisible(true);
                        l.setLocationRelativeTo(null);
                        JOptionPane.showMessageDialog(null, "Ju sapo kaluat ne Nivelin 3!");
                        this.dispose();
                    } else {
                        pyetja = 0;
                        Niveli2 l = new Niveli2();
                        l.setVisible(true);
                        l.setLocationRelativeTo(null);
                        this.dispose();
                    }
                }
                if (pyetja < 4) {
                    vendosPytjen.setText(q.questions2[pyetja]);
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

    private JLabel Backgroundi;
    private ButtonGroup buttonGroup1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JProgressBar jProgressBar1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JFormattedTextField vendosPytjen;
    private JButton jButton1;

}
