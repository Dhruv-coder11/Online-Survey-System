import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResponseCollectionScreen extends JFrame {
    private JTextArea responseTextArea;
    private JButton submitButton;

    public ResponseCollectionScreen() {
        setTitle("Online Survey System - Response Collection");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());

        responseTextArea = new JTextArea(20, 50);
        JScrollPane scrollPane = new JScrollPane(responseTextArea);

        submitButton = new JButton("Submit Response");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String response = responseTextArea.getText();
                // Logic to store response in a database or file
                JOptionPane.showMessageDialog(ResponseCollectionScreen.this, "Response submitted successfully!");
                // Clear the text area after submission
                responseTextArea.setText("");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ResponseCollectionScreen().setVisible(true);
            }
        });
    }
}
