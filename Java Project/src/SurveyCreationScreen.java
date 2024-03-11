import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SurveyCreationScreen extends JFrame {
    private JTextField questionField;
    private JComboBox<String> questionTypeComboBox;
    private JButton addQuestionButton;
    private JTextArea surveyTextArea;

    public SurveyCreationScreen() {
        setTitle("Online Survey System - Survey Creation");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());

        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new FlowLayout());
        questionPanel.add(new JLabel("Question:"));
        questionField = new JTextField(30);
        questionPanel.add(questionField);

        String[] questionTypes = {"Multiple Choice", "Text Input", "Rating Scale"};
        questionTypeComboBox = new JComboBox<>(questionTypes);
        questionPanel.add(questionTypeComboBox);

        addQuestionButton = new JButton("Add Question");
        addQuestionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addQuestion();
            }
        });
        questionPanel.add(addQuestionButton);

        surveyTextArea = new JTextArea(20, 50);
        surveyTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(surveyTextArea);

        add(questionPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void addQuestion() {
        String question = questionField.getText();
        String questionType = (String) questionTypeComboBox.getSelectedItem();
        surveyTextArea.append(question + " - " + questionType + "\n");
        // Additional logic to store the question in a survey object
        // For now, let's just display the questions in the text area
        questionField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SurveyCreationScreen().setVisible(true);
            }
        });
    }
}
