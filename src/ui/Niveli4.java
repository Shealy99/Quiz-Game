package ui;

import java.awt.Color;
import java.awt.Cursor;
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

public class Niveli4 extends JFrame {

    Questions q = new Questions();
    public int pyetja = 0;

    public Niveli4() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jProgressBar1 = new JProgressBar();
        jButton1 = new JButton();
        jRadioButton1 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        vendosPytjen = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(750, 469));

        jPanel1.setMaximumSize(new Dimension(670, 405));
        jPanel1.setMinimumSize(new Dimension(670, 405));
        jPanel1.setLayout(null);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(10, 10, 300, 30);

        jRadioButton1.setText(q.alt41[0]);
        jRadioButton2.setText(q.alt41[1]);
        jRadioButton3.setText(q.alt41[2]);
        jRadioButton4.setText(q.alt41[3]);

        jRadioButton1.setActionCommand(jRadioButton1.getActionCommand());
        jRadioButton2.setActionCommand(jRadioButton2.getActionCommand());
        jRadioButton3.setActionCommand(jRadioButton3.getActionCommand());
        jRadioButton4.setActionCommand(jRadioButton4.getActionCommand());

        jButton1.setText("Dergo");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 340, 90, 26);

        jRadioButton1.setBackground(new Color(255, 153, 100));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(20, 220, 270, 24);

        vendosPytjen.setText(q.questions4[0]);

        jRadioButton3.setBackground(new Color(255, 153, 100));
        buttonGroup1.add(jRadioButton3);
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(20, 300, 270, 24);

        jRadioButton2.setBackground(new Color(255, 153, 100));
        buttonGroup1.add(jRadioButton2);

        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(20, 260, 270, 24);

        jRadioButton4.setBackground(new Color(255, 153, 100));
        buttonGroup1.add(jRadioButton4);
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(20, 340, 270, 24);

        vendosPytjen.setBackground(new Color(255, 153, 100));
        vendosPytjen.setFont(new Font("Baskerville Old Face", 1, 16));
        vendosPytjen.setForeground(new Color(0, 0, 0));
        vendosPytjen.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        vendosPytjen.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jPanel1.add(vendosPytjen);
        vendosPytjen.setBounds(10, 50, 380, 110);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 36));
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Niveli 4 - MARS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 10, 300, 40);

        jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/life-on-mars-960x540.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(SwingConstants.BOTTOM);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 972, 450);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        ButtonModel mb = buttonGroup1.getSelection();
        if (mb == null) {
            JOptionPane.showMessageDialog(this, "Vendos nje pergjigje!", "Invalid Answer", JOptionPane.ERROR_MESSAGE);
        } else {

            if (mb.getActionCommand().contains(q.sakt4[pyetja])) {
                pyetja++;
                jProgressBar1.setValue(jProgressBar1.getValue() + 25);
                if (pyetja == 1) {
                    jRadioButton1.setText(q.alt42[0]);
                    jRadioButton2.setText(q.alt42[1]);
                    jRadioButton3.setText(q.alt42[2]);
                    jRadioButton4.setText(q.alt42[3]);
                } else if (pyetja == 2) {
                    jRadioButton1.setText(q.alt43[0]);
                    jRadioButton2.setText(q.alt43[1]);
                    jRadioButton3.setText(q.alt43[2]);
                    jRadioButton4.setText(q.alt43[3]);
                } else if (pyetja == 3) {
                    jRadioButton1.setText(q.alt44[0]);
                    jRadioButton2.setText(q.alt44[1]);
                    jRadioButton3.setText(q.alt44[2]);
                    jRadioButton4.setText(q.alt44[3]);
                }
                buttonGroup1.clearSelection();
                if (jProgressBar1.getValue() == 100) {

                    Fundi l = new Fundi();
                    l.setVisible(true);
                    l.setLocationRelativeTo(null);
                    this.dispose();

                }
                if (pyetja < 4) {
                    vendosPytjen.setText(q.questions4[pyetja]);
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
    private JPanel jPanel1;
    private JProgressBar jProgressBar1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JLabel vendosPytjen;
    private JLabel jLabel2;
}
