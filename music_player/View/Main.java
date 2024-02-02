package View;

import jaco.mp3.player.MP3Player;
import java.io.File;

import java.nio.file.Paths;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;

import javax.swing.JFileChooser;

/**
 *
 * @author kasun
 */
public class Main extends javax.swing.JFrame {

    // Define MP3Player Class From JACO MP3Player Lib
    MP3Player player;
    // Define File For Song
    File songFile;
    // Define Current Directory Like If We Use JFileChooser then where it statys.
    String currentDirectory = "download.music"; // I am using home.user this will call file chooser in user documents.
    // Here I define currentPath of the running app class
    String currentPath;
    // This String Will Be For Image Name or Path
    String imagePath;
    // We need to set app title as string
    String appName = "MP3 Player";

    // Now Check If Repeat Button is Enabled or not
    boolean repeat = false;

    // Here I am making a boolean for windowCollapsed
    boolean windowCollapsed = false;

    // Here I need to define mouse x and y for to get mouse position on screen.
    int xMouse, yMouse;

    MusicPlayer music;

    public Main() {
        initComponents();
        // Set App Title Here
        appTitle1.setText(appName);

        // Here I am going to set a default song file. It's not necessary.
        songFile = new File("");

        // Now make a string to get file name
        String fileName = songFile.getName();
        // Here set our song name label with this name
        songNameDisplay.setText(fileName);

        // Add our method to player variable
        player = mp3Player();
        // Now add song to player as playlist.
        player.addToPlayList(songFile);

        // Here get current path and images path in strings
        currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        imagePath = "\\images";

        music = new MusicPlayer();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new swing.Panel();
        panel3 = new swing.Panel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        opn_btn = new javax.swing.JButton();
        opn_btn1 = new javax.swing.JButton();
        opn_btn2 = new javax.swing.JButton();
        opn_btn3 = new javax.swing.JButton();
        opn_btn4 = new javax.swing.JButton();
        jSlider2 = new javax.swing.JSlider();
        songNameDisplay = new javax.swing.JLabel();
        appTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setBackground(new java.awt.Color(46, 46, 46));

        panel3.setBackground(new java.awt.Color(46, 46, 46));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));

        jButton1.setBackground(new java.awt.Color(27, 27, 27));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(48, 213, 200));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music_2.png"))); // NOI18N
        jButton1.setText("             album");

        jButton2.setBackground(new java.awt.Color(27, 27, 27));
        jButton2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(48, 213, 200));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music_.png"))); // NOI18N
        jButton2.setText("             Song");

        jButton3.setBackground(new java.awt.Color(27, 27, 27));
        jButton3.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(48, 213, 200));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/artist_.png"))); // NOI18N
        jButton3.setText("             artists");

        jButton4.setBackground(new java.awt.Color(27, 27, 27));
        jButton4.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(48, 213, 200));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/playlist_50x50.png"))); // NOI18N
        jButton4.setText("             Play list");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(27, 27, 27));

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider1MouseReleased(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/speaker_.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(48, 213, 200));
        jLabel4.setText("00.00.00");

        jLabel18.setForeground(new java.awt.Color(48, 213, 200));
        jLabel18.setText("00.00.00");

        opn_btn.setBackground(new java.awt.Color(27, 27, 27));
        opn_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open_.png"))); // NOI18N
        opn_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opn_btnActionPerformed(evt);
            }
        });

        opn_btn1.setBackground(new java.awt.Color(27, 27, 27));
        opn_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/next-button1.png"))); // NOI18N
        opn_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opn_btn1ActionPerformed(evt);
            }
        });

        opn_btn2.setBackground(new java.awt.Color(27, 27, 27));
        opn_btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pause_.png"))); // NOI18N
        opn_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opn_btn2ActionPerformed(evt);
            }
        });

        opn_btn3.setBackground(new java.awt.Color(27, 27, 27));
        opn_btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pre-button.png"))); // NOI18N
        opn_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opn_btn3ActionPerformed(evt);
            }
        });

        opn_btn4.setBackground(new java.awt.Color(27, 27, 27));
        opn_btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play_.png"))); // NOI18N
        opn_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opn_btn4ActionPerformed(evt);
            }
        });

        jSlider2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(opn_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(opn_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(opn_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(opn_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(opn_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opn_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opn_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opn_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opn_btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opn_btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        songNameDisplay.setBackground(new java.awt.Color(255, 255, 255));
        songNameDisplay.setForeground(new java.awt.Color(255, 255, 255));

        appTitle1.setBackground(new java.awt.Color(255, 255, 255));
        appTitle1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        appTitle1.setForeground(new java.awt.Color(255, 255, 255));
        appTitle1.setText("Music Player");

        jTextArea1.setBackground(new java.awt.Color(47, 47, 47));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(appTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(songNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opn_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opn_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser openFileChooser = new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open MP3 Files Only!"));
        int result = openFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {

            Song song = new Song(openFileChooser.getSelectedFile());
            music.addSong(song);

            jTextArea1.append(song.getName() + "\n");

        }
    }//GEN-LAST:event_opn_btnActionPerformed

    private void opn_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opn_btn1ActionPerformed
        // TODO add your handling code here:
        player.skipForward();
    }//GEN-LAST:event_opn_btn1ActionPerformed

    private void opn_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opn_btn2ActionPerformed
        // TODO add your handling code here:

        player.pause();
    }//GEN-LAST:event_opn_btn2ActionPerformed

    private void opn_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opn_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opn_btn3ActionPerformed

    private void opn_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opn_btn4ActionPerformed
        songNameDisplay.setText("Playing Now... | " + songFile.getName());
        List<File> songsList = music.play();
        for (File song : songsList) {

            player.addToPlayList(song);
        }

        player.skipForward();
        
//        player.play();


    }//GEN-LAST:event_opn_btn4ActionPerformed

    private void jSlider2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider2MouseReleased

    }//GEN-LAST:event_jSlider2MouseReleased

    private void jSlider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseReleased
        System.out.println(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1MouseReleased

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
        });
    }

    private MP3Player mp3Player() {
        MP3Player mp3Player = new MP3Player();
        return mp3Player;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton opn_btn;
    private javax.swing.JButton opn_btn1;
    private javax.swing.JButton opn_btn2;
    private javax.swing.JButton opn_btn3;
    private javax.swing.JButton opn_btn4;
    private swing.Panel panel2;
    private swing.Panel panel3;
    private javax.swing.JLabel songNameDisplay;
    // End of variables declaration//GEN-END:variables
}
