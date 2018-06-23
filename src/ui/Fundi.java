package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Fundi extends JFrame {

    public Fundi() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jButton2 = new JButton();
        jButton1 = new JButton();
        jLabel3 = new JLabel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new Dimension(671, 405));
        setMinimumSize(new Dimension(671, 405));

        jPanel1.setMaximumSize(new Dimension(671, 405));
        jPanel1.setMinimumSize(new Dimension(671, 405));
        jPanel1.setLayout(null);

        jLabel2.setFont(new Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel2.setForeground(new Color(250, 250, 250));
        jLabel2.setText("Urime");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 80, 200, 100);

        jButton2.setText("DIL");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(530, 360, 120, 26);

        jButton1.setText("Luaj perseri!");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 360, 140, 30);

        jLabel3.setFont(new Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setForeground(new Color(250, 250, 250));
        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setText("Ju fituat!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 160, 100, 19);

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/shutterstock_356797187.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1245, 750);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Fillimi s = new Fillimi();
        s.setVisible(true);
        this.dispose();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
}
