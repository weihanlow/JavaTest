package HospitalDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Doctor extends People implements AccessData {

    private static GraphicsConfiguration gc;

    public Doctor(String fullName) {
        super(fullName);
    }

    @Override
    public void getDetails(Patient patient) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        displayPanel patientDisplay = new displayPanel(patient);
        JPanel panel = new JPanel(new FlowLayout());

        panel.add(patientDisplay);

        frame.setSize(800, 800);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}
