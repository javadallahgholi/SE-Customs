import javax.swing.*;
import java.awt.*;

/**
 * Created by hossein on 2/17/16.
 */
public class EzharNamehPage extends Page {

    @Override
    public void show(boolean exitOnClose) {
        JFrame frame = new JFrame("فرم اظهار نامه گمرک");
        frame.setSize(800, 300);
        if (exitOnClose)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        ImageIcon pic = new ImageIcon("g.jpg");
        JLabel label = new JLabel("", pic, JLabel.CENTER);
        panel.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        String country[]={"هوایی","زمینی","دریایی"};

        panel.setLayout(null);


        JLabel dateLabel = new JLabel("تاریخ اظهار");
        dateLabel.setBounds(680, 15, 80, 25);
        panel.add(dateLabel);
        JTextField dateText = new JTextField(20);
        dateText.setBounds(525, 15, 100, 25);
        panel.add(dateText);

        ///
        JLabel userLabel = new JLabel("نام تاجر");
        userLabel.setBounds(690, 65, 80, 25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(525, 65, 100, 25);
        panel.add(userText);
        //

        ///
        JLabel familyLabel = new JLabel("نام خانوادگی تاجر");
        familyLabel.setBounds(395, 65, 150, 25);
        panel.add(familyLabel);
        JTextField familyText = new JTextField(20);
        familyText.setBounds(280, 65, 100, 25);
        panel.add(familyText);
        //

        ///
        JLabel idLabel = new JLabel("شناسه ملی تاجر");
        idLabel.setBounds(150, 65, 150, 25);
        panel.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(35, 65, 100, 25);
        panel.add(idText);
        //

        ///
        JLabel countryLabel = new JLabel("کشور مبدا");
        countryLabel.setBounds(685, 110, 150, 25);
        panel.add(countryLabel);
        JTextField countryText = new JTextField(20);
        countryText.setBounds(525, 110, 100, 25);
        panel.add(countryText);
        //


        ///
        JLabel importLabel = new JLabel("نحوه ورود به کشور");
        importLabel.setBounds(395, 110, 150, 25);
        panel.add(importLabel);
        JComboBox approachBox = new JComboBox(country);
        approachBox.setBounds(286, 110,90,20);
        panel.add(approachBox);
        //

        ///
        JLabel numberLabel = new JLabel("تعداد کالا");
        numberLabel.setBounds(690, 150, 150, 25);
        panel.add(numberLabel);
        final JTextField numberText = new JTextField(20);
        numberText.setBounds(525, 150, 100, 25);
        panel.add(numberText);
        //

        ///
        JLabel priceLabel = new JLabel("ارزش کالاها به $");
        priceLabel.setBounds(400, 150, 150, 25);
        panel.add(priceLabel);
        JTextField priceText = new JTextField(20);
        priceText.setBounds(280, 150, 100, 25);
        panel.add(priceText);
        //

        JButton addButton = new JButton("اضافه کردن کالا ها");
        addButton.setBounds(100, 150, 150, 25);
        panel.add(addButton);
/*
        addButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numberText.getText());
                SimpleForm[] productForms = ProductInformationGetter.getProductInformationFroms(number);
                JButton submit = new JButton("Submit Product Information");
                for (int i = 0; i < number; i++) {
                    JFrame f = new JFrame("Manifest");
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.getContentPane().add(productForms[i], BorderLayout.NORTH);
                    JPanel p = new JPanel();
                    p.add(submit);
                    f.getContentPane().add(p, BorderLayout.SOUTH);
                    f.pack();
                    f.setVisible(true);
                }
            }
        });
        */

        JButton registerButton = new JButton("ارسال اظهارنامه");
        registerButton.setBounds(300, 220, 200, 25);
        panel.add(registerButton);

    }

}