/*

Program: BreakAPlate.java         Last Date of this Revision: March 06, 2026

Purpose: Plays a game where the number of plates broken determines a prize.

Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class BreakAPlate {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BreakAPlate window = new BreakAPlate();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public BreakAPlate() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        // Label for plates images
        JLabel plates = new JLabel("");
        plates.setBounds(36, 11, 373, 93);
        panel.add(plates);

        // Button to replay the game
        JButton playAgain = new JButton("Play Again");
        playAgain.setFont(new Font("Tahoma", Font.BOLD, 20));
        playAgain.setBounds(124, 126, 168, 46);
        panel.add(playAgain);
        playAgain.setVisible(false);

        // Random number generator for breaking plates
        Random random = new Random();

        // Label to display prize image
        JLabel prize = new JLabel("");
        prize.setVerticalAlignment(SwingConstants.TOP);
        prize.setBounds(174, 183, 67, 67);
        panel.add(prize);

        // Image icons
        ImageIcon allBroke = new ImageIcon("../Chapter10/src/plates_all_broken.jpg");
        ImageIcon twoBroke = new ImageIcon("../Chapter10/src/plates_two_broken.jpg");
        ImageIcon noBroke = new ImageIcon("../Chapter10/src/plates.jpg");
        ImageIcon sticker = new ImageIcon("../Chapter10/src/sticker.jpg");
        ImageIcon tiger = new ImageIcon("../Chapter10/src/tiger_plush.jpg");
        ImageIcon pHolder = new ImageIcon("../Chapter10/src/placeholder.png");

        plates.setIcon(noBroke);
        prize.setIcon(pHolder);

        // Play button
        JButton play = new JButton("Play");
        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = random.nextInt(1 + 1);
                int num2 = random.nextInt(1 + 1);
                int num3 = random.nextInt(1 + 1);

                // If all plates break
                if ((num1 + num2 + num3) == 3) {
                    plates.setIcon(allBroke);
                    prize.setIcon(tiger);
                } else {
                    plates.setIcon(twoBroke);
                    prize.setIcon(sticker);
                }

                play.setVisible(false);
                playAgain.setVisible(true);
            }
        });

        // Play again button action
        playAgain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                plates.setIcon(noBroke);
                prize.setIcon(pHolder);

                play.setVisible(true);
                playAgain.setVisible(false);
            }
        });

        play.setFont(new Font("Tahoma", Font.BOLD, 20));
        play.setBounds(137, 126, 143, 46);
        panel.add(play);
    }
}