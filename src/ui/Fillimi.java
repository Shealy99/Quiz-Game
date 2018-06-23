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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fillimi extends JFrame {

    public Fillimi() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton3 = new JButton();
        jButton1 = new JButton();
        jLabel3 = new JLabel();

        setPreferredSize(new Dimension(670, 405));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new Font("Engravers MT", 1, 24));
        jLabel1.setForeground(new Color(200, 200, 200));
        jLabel1.setText("Mireseerdhet");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 30, 350, 50);

        jLabel2.setFont(new Font("Engravers MT", 2, 24));
        jLabel2.setForeground(new Color(255, 60, 0));
        jLabel2.setText("ne sistemin diellor");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 50, 390, 100);

        jButton3.setBackground(new Color(204, 204, 255));
        jButton3.setFont(new Font("Bell MT", 1, 14));
        jButton3.setForeground(new Color(16, 27, 64));
        jButton3.setText("Dil");
        jButton3.setToolTipText("");

        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(500, 350, 60, 20);

        jButton1.setBackground(new Color(204, 204, 255));
        jButton1.setFont(new Font("Bell MT", 1, 18));
        jButton1.setForeground(new Color(16, 27, 64));
        jButton1.setText("Luaj");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 300, 160, 40);

        jLabel3.setForeground(new Color(200, 200, 200));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/l.jpg")));
        jLabel3.setText("Welcome");
        jLabel3.setPreferredSize(new Dimension(733, 431));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 410);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Niveli1 l = new Niveli1();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.dispose();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {

        Fillimi f = new Fillimi();
        f.setVisible(true);
    }
    private JButton jButton1;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
}
