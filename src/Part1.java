//create three emoji buttons that when pressed will play music

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
class Part1{
    JLabel jLab;
    JButton jbtnFirst;
    JButton jbtnSecond;
    JButton jbtnThird;

    public Part1() {
        //class to create a music player GUI with Button presses

        //importing idle button icons
        ImageIcon myIcon = new ImageIcon("images/emoji_happy.png");
        ImageIcon myIcon01 = new ImageIcon("images/emoji02.png");
        ImageIcon myIcon02 = new ImageIcon("images/emoji03.png");

        //importing button press icons
        ImageIcon myPIcon = new ImageIcon("images/emoji04.png");
        ImageIcon myPIcon01 = new ImageIcon("images/emoji05.png");
        ImageIcon myPIcon02 = new ImageIcon("images/emoji06.png");

        //image icons for roll-over icons
        ImageIcon myROIcon = new ImageIcon("images/whosNext_resize.png");
        ImageIcon myROIcon01 = new ImageIcon("images/wildWorld-resize.png");
        ImageIcon myROIcon02 = new ImageIcon("images/vienna_resize.png");



        //create new JFrame container
        JFrame jfrm = new JFrame("My Music Player");
        jfrm.getContentPane().setLayout(new GridLayout(4,1));

        jfrm.setSize(300, 220);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the frame to be visible
        jfrm.setVisible(true);
        jLab = new JLabel("Debug");

        //make three buttons
        jbtnFirst = new JButton("First",myIcon);
        jbtnSecond = new JButton("Second",myIcon01);
        jbtnThird = new JButton("Third", myIcon02);

        //adding buttons to a buttonGroup
        ButtonGroup bg = new ButtonGroup();
        bg.add(jbtnFirst);
        bg.add(jbtnSecond);
        bg.add(jbtnThird);

        //add the components to the frame
        jfrm.getContentPane().add(jLab);
        jfrm.add(jbtnFirst);
        jfrm.add(jbtnSecond);
        jfrm.add(jbtnThird);

        //setting icon change on key press
        jbtnFirst.setPressedIcon(myPIcon);
        jbtnSecond.setPressedIcon(myPIcon01);
        jbtnThird.setPressedIcon(myPIcon02);

        //setting icons for roll-over function
        jbtnFirst.setRolloverIcon(myROIcon);
        jbtnSecond.setRolloverIcon(myROIcon01);
        jbtnThird.setRolloverIcon(myROIcon02);
        //setting mnemonics for buttons
        jbtnFirst.setMnemonic('f');
        jbtnSecond.setMnemonic('s');
        jbtnThird.setMnemonic('T');




        //adding action listeners that implement their anonymous methods
        //Add action listeners
        //Notice that these listeners are implemented
        //by using anonymous listener classes
        jbtnFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jbtnSecond.isEnabled()) {
                    jLab.setText("Other buttons are disabled");

                    //try catch block to import audio file
                    try {
                        File file = new File("sounds/BehindBlueEyes.wav");
                        file.toURI();
                        System.out.println(file.toURI().toString());

                        assert file != null;

                        AudioInputStream audioIn = AudioSystem.getAudioInputStream(file.toURI().toURL());
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioIn);
                        clip.start();

                        try {
                            Thread.sleep(3000L);
                        } catch (InterruptedException var6) {
                            var6.printStackTrace();
                        }

                        clip.stop();

                        try {
                            Thread.sleep(3000L);
                        } catch (InterruptedException var5) {
                            var5.printStackTrace();
                        }

                        clip.start();
                    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException var7) {
                        var7.printStackTrace();
                    }
                    jbtnSecond.setEnabled(false);
                    jbtnThird.setEnabled(false);
                } else {
                    jLab.setText("Buttons are enabled");
                    jbtnSecond.setEnabled(true);
                    jbtnThird.setEnabled(true);
                }
            }
        });
        //second action listener for the second button anonymous inner class
        jbtnSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jbtnFirst.isEnabled()) {
                    // on button press of button two play the imported audio file
                    try {
                        File file = new File("sounds/WildWorld.wav");
                        file.toURI();
                        System.out.println(file.toURI().toString());

                        assert file != null;

                        AudioInputStream audioIn = AudioSystem.getAudioInputStream(file.toURI().toURL());
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioIn);
                        clip.start();

                        try {
                            Thread.sleep(3000L);
                        } catch (InterruptedException var6) {
                            var6.printStackTrace();
                        }

                        clip.stop();

                        try {
                            Thread.sleep(3000L);
                        } catch (InterruptedException var5) {
                            var5.printStackTrace();
                        }

                        clip.start();
                    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException var7) {
                        var7.printStackTrace();
                    }
                    jLab.setText("Other buttons are disabled");
                    jbtnFirst.setEnabled(false);
                    jbtnThird.setEnabled(false);
                } else {
                    jLab.setText("All buttons are enabled");
                    jbtnFirst.setEnabled(true);
                    jbtnThird.setEnabled(true);
                }
            }
        });
        //listener for third button anonymous inner class
        jbtnThird.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jbtnSecond.isEnabled()) {

                    //importing sound file and play on key press
                    try {
                        File file = new File("sounds/Vienna.wav");
                        file.toURI();
                        System.out.println(file.toURI().toString());

                        assert file != null;

                        AudioInputStream audioIn = AudioSystem.getAudioInputStream(file.toURI().toURL());
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioIn);
                        clip.start();

                        try {
                            Thread.sleep(3000L);
                        } catch (InterruptedException var6) {
                            var6.printStackTrace();
                        }

                        clip.stop();

                        try {
                            Thread.sleep(3000L);
                        } catch (InterruptedException var5) {
                            var5.printStackTrace();
                        }

                        clip.start();
                    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException var7) {
                        var7.printStackTrace();
                    }

                    //change label and disable other buttons

                    jLab.setText("Third Button was pressed and other buttons are disalbed");
                    jbtnFirst.setEnabled(false);
                    jbtnSecond.setEnabled(false);
                } else {
                    jLab.setText("All buttons are enabled");
                    jbtnFirst.setEnabled(true);
                    jbtnSecond.setEnabled(true);
                }
            }
        });




    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Part1();
            }
        });
    }
}