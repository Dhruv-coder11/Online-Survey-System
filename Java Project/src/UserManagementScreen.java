import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserManagementScreen extends JFrame {
    private JButton createUserButton;
    private JButton assignRolesButton;

    public UserManagementScreen() {
        setTitle("Online Survey System - User Management");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(2, 1));

        createUserButton = new JButton("Create User");
        createUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to create a new user
                JOptionPane.showMessageDialog(UserManagementScreen.this, "User created successfully!");
            }
        });

        assignRolesButton = new JButton("Assign Roles");
        assignRolesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to assign roles to users
                JOptionPane.showMessageDialog(UserManagementScreen.this, "Roles assigned successfully!");
            }
        });

        add(createUserButton);
        add(assignRolesButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserManagementScreen().setVisible(true);
            }
        });
    }
}
