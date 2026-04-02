/*

Program: StudentSemesterAverage.java          Last Date of this Revision: April 02, 2026

Purpose:
 * - Enter student information and grades
 * - Calculate the semester average
 * - Save the data to a file
 * - View saved records from the file
Author: Calen Plana
School: CHHS
Course: Computer Programming CS30
 

*/

package Mastery;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.io.*;

import javax.swing.*;

public class StudentSemesterAverage {

    // Main application frame
    private JFrame frame;

    // Input fields
    private JTextField studentName;
    private JTextField gradeLevel;
    private JTextField semNumber;
    private JTextField grade1;
    private JTextField grade2;
    private JTextField grade3;
    private JTextField grade4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                StudentSemesterAverage window = new StudentSemesterAverage();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Constructor - initializes the GUI.
     */
    public StudentSemesterAverage() {
        initialize();
    }

    /**
     * Initializes all GUI components and layout.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 632, 376);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Labels
        JLabel nameLabel = createLabel("Student Name:", 10, 11);
        JLabel gradeLabel = createLabel("Grade Level:", 10, 36);
        JLabel semLabel = createLabel("Semester Number:", 10, 61);
        JLabel g1Label = createLabel("Grade 1:", 10, 86);
        JLabel g2Label = createLabel("Grade 2:", 10, 111);
        JLabel g3Label = createLabel("Grade 3:", 10, 136);
        JLabel g4Label = createLabel("Grade 4:", 10, 161);
        JLabel avgLabel = createLabel("Average:", 10, 186);

        panel.add(nameLabel);
        panel.add(gradeLabel);
        panel.add(semLabel);
        panel.add(g1Label);
        panel.add(g2Label);
        panel.add(g3Label);
        panel.add(g4Label);
        panel.add(avgLabel);

        // Text fields
        studentName = createTextField(154, 10);
        gradeLevel = createTextField(154, 35);
        semNumber = createTextField(154, 60);
        grade1 = createTextField(154, 85);
        grade2 = createTextField(154, 110);
        grade3 = createTextField(154, 136);
        grade4 = createTextField(154, 161);

        panel.add(studentName);
        panel.add(gradeLevel);
        panel.add(semNumber);
        panel.add(grade1);
        panel.add(grade2);
        panel.add(grade3);
        panel.add(grade4);

        // Output areas
        JTextArea summaryArea = new JTextArea();
        summaryArea.setBackground(new Color(240, 240, 240));
        summaryArea.setBounds(10, 214, 596, 64);
        panel.add(summaryArea);

        JTextArea averageArea = new JTextArea();
        averageArea.setBackground(new Color(240, 240, 240));
        averageArea.setBounds(77, 186, 347, 17);
        panel.add(averageArea);

        // File reference
        File studentAverageFile = new File("../Chapter11/SemAverage");

        /**
         * SAVE BUTTON
         * - Calculates average
         * - Displays it
         * - Appends data to file
         */
        JButton saveButton = new JButton("Save to File");
        saveButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        saveButton.setBounds(148, 289, 127, 37);

        saveButton.addActionListener(e -> {
            try {
                // Retrieve input values
                String name = studentName.getText();
                String level = gradeLevel.getText();
                String semester = semNumber.getText();

                int g1 = Integer.parseInt(grade1.getText());
                int g2 = Integer.parseInt(grade2.getText());
                int g3 = Integer.parseInt(grade3.getText());
                int g4 = Integer.parseInt(grade4.getText());

                // Calculate average
                int avg = (g1 + g2 + g3 + g4) / 4;
                averageArea.setText(avg + "%");

                // Write to file (append mode)
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter(studentAverageFile, true));

                writer.write("Name: " + name +
                        ", Grade Level: " + level +
                        ", Semester: " + semester +
                        ", Grades: " + g1 + ", " + g2 + ", " + g3 + ", " + g4 +
                        ". Average: " + avg + "%");
                writer.newLine();
                writer.close();

                JOptionPane.showMessageDialog(saveButton, "Data Saved Successfully!");

            } catch (FileNotFoundException ex) {
                System.out.println("File does not exist.");
                System.err.println("Error: " + ex.getMessage());

            } catch (IOException ex) {
                System.out.println("Error writing to file.");
                System.err.println("Error: " + ex.getMessage());
            }
        });

        panel.add(saveButton);

        /**
         * PREVIEW BUTTON
         * - Reads file contents
         * - Displays them in the summary area
         */
        JButton previewButton = new JButton("View File Contents");
        previewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        previewButton.setBounds(284, 289, 176, 37);

        previewButton.addActionListener(e -> {
            try {
                BufferedReader reader = new BufferedReader(
                        new FileReader(studentAverageFile));

                summaryArea.setText("");

                String line;
                while ((line = reader.readLine()) != null) {
                    summaryArea.append(line + "\n");
                }

                reader.close();

            } catch (FileNotFoundException ex) {
                System.out.println("File does not exist.");
                System.err.println("Error: " + ex.getMessage());

            } catch (IOException ex) {
                System.out.println("Error reading file.");
                System.err.println("Error: " + ex.getMessage());
            }
        });

        panel.add(previewButton);
    }

    /**
     * Helper method to create consistently styled labels.
     */
    private JLabel createLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Tahoma", Font.BOLD, 14));
        label.setBounds(x, y, 152, 14);
        return label;
    }

    /**
     * Helper method to create consistently styled text fields.
     */
    private JTextField createTextField(int x, int y) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, 452, 20);
        textField.setColumns(10);
        return textField;
    }
}