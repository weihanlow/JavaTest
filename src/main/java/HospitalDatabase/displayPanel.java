package HospitalDatabase;
import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class displayPanel extends JPanel{
    private final JLabel patientImage, patientMRI, patientDetails, patientBP;

    public displayPanel(Patient patient) {
        setLayout(new GridLayout(2, 4));

        patientImage = new JLabel();
        setDisplayImage(patientImage, patient.getPictureURL());
        createPanel(patientImage);

        patientDetails = new JLabel();
        setDisplayText(patientDetails, patient.getFullName(), patient.getAge());
        createPanel(patientDetails);

        patientMRI = new JLabel();
        setDisplayImage(patientMRI, patient.getMRI().getImageURL());
        createPanel(patientMRI);

        patientBP = new JLabel();
        setDisplayText(patientBP, patient.getBP().getSysPressure(), patient.getBP().getDiasPressure());
        createPanel(patientBP);
    }

    private JLabel setDisplayImage(JLabel label, String url) {
        URL imageURL = null;
        try {
            imageURL = new URL(url);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
        return label;
    }

    private JLabel setDisplayText(JLabel label, String text1, int text2) {
        label.setText("<html>" + "Name: " + text1 + "<br>" + "Age: " + text2 + "</html>");
        return label;
    }

    private JLabel setDisplayText(JLabel label, int text1, int text2) {
        label.setText("<html>" + "Blood Pressure" + "<br>" + text1 + " over " + text2 + "</html>");
        return label;
    }

    private void createPanel(JLabel label) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        add(panel);
    }
}
