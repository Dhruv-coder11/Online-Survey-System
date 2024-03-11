import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SurveyDistributionScreen extends JFrame {
    private JRadioButton emailRadioButton;
    private JRadioButton webRadioButton;
    private JButton distributeButton;

    public SurveyDistributionScreen() {
        setTitle("Online Survey System - Survey Distribution");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(2, 1));

        emailRadioButton = new JRadioButton("Email Invitation");
        webRadioButton = new JRadioButton("Web Interface");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(emailRadioButton);
        buttonGroup.add(webRadioButton);

        radioPanel.add(emailRadioButton);
        radioPanel.add(webRadioButton);

        JPanel buttonPanel = new JPanel();
        distributeButton = new JButton("Distribute Survey");
        distributeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (emailRadioButton.isSelected()) {
                    // Logic to distribute survey via email
                    JOptionPane.showMessageDialog(SurveyDistributionScreen.this, "Survey distributed via email.");
                } else if (webRadioButton.isSelected()) {
                    // Logic to distribute survey via web interface
                    JOptionPane.showMessageDialog(SurveyDistributionScreen.this, "Survey distributed via web interface.");
                } else {
                    JOptionPane.showMessageDialog(SurveyDistributionScreen.this, "Please select a distribution method.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(distributeButton);

        add(radioPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SurveyDistributionScreen().setVisible(true);
            }
        });
    }
}
