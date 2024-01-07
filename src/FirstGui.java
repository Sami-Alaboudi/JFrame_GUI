//Sam Alaboudi
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.*;

public class FirstGui {
    private JFrame window;

    public FirstGui(){
        window = new JFrame();
        window.setTitle("Base");
        window.setSize(600,400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   

    public FirstGui(String Title,int width,int height){
        window = new JFrame(); //
        window.setTitle(Title);
        window.setSize(width,height);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        window.add(panel,BorderLayout.EAST);
        panel.setBackground(Color.pink);

        Button button1 = new Button("Process");
        Button button2 = new Button("Clear");
        Button button3 = new Button("Quit");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        panel.setPreferredSize(new Dimension(150,50));


        JPanel txtPanel = new JPanel();
        JTextField firstNameTip = createTextField("First Name");
        txtPanel.add(firstNameTip);

        JTextField lastNameTip = createTextField("Last Name");
        txtPanel.add(lastNameTip);

        txtPanel.setPreferredSize(new Dimension(150,50));
        window.add(txtPanel,BorderLayout.CENTER);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        JLabel firstNameLabel = createLabel("First Name");
        labelPanel.add(firstNameLabel);

        JLabel lastNameLabel = createLabel("Last Name");
        labelPanel.add(lastNameLabel);

        labelPanel.setPreferredSize(new Dimension(150, 50));
        window.add(labelPanel, BorderLayout.WEST);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello " + firstNameTip.getText() + " " + lastNameTip.getText());
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNameTip.setText("");
                lastNameTip.setText("");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // NOTE: step 5 part 3 contains an instruction that is not a full sentence
                // as a result I am not sure what the professor wanted in this case regarding the text-fields, the only thing
                // I can imagine is potentially a clear similar to button 2 followed by a quit. if that is the case here is the code
                /*
                * button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNameTip.setText("");
                lastNameTip.setText("");
                System.exit(0);
            }
        });
                * */

                // NOTE CONTINUED: There was no discussion board for lab 12 to consult on this matter.

            }
        });


    }

    public void show(boolean config) {
        window.setVisible(config);
    }

    public JTextField createTextField(String s){
        JTextField field = new JTextField(10);
        field.setToolTipText(s);
        return field;
    }

    public JLabel createLabel(String text){
        JLabel label = new JLabel(text);
        Font font = new Font("Calibri",Font.PLAIN,18);
        label.setFont(font);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        return label;
    }


}
// Revisit Why this code is causing problems, Its because I added things in the wrong order.
 /*  JPanel labelPanel = new JPanel();
        JLabel label1 = createLabel("First Name");
        label1.add(labelPanel);
        JLabel label2 = createLabel("Last Name");
        label2.add(labelPanel);

        labelPanel.setPreferredSize(new Dimension(150,50));
        window.add(labelPanel,BorderLayout.WEST);*/












// Ask about pink weirdness when given the chance
