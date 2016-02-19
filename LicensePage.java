import javax.swing.*;
import java.awt.*;


public class LicensePage extends Page {

    @Override
    public void show(boolean exitOnClose) {
        JFrame frame = new JFrame("فرم صدور مجوز");
        frame.setSize(750, 400);
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
        String ministry[] = {"صنعت و معدن", "بهداشت و درمان", "تجارت", "اقتصاد", "ورزش و جوانان"};
        String country[] = {"هوایی","زمینی","دریایی"};

        panel.setLayout(null);

        JLabel ministryLabel = new JLabel("صادر شده توسط وزارت :");
        ministryLabel.setBounds(550, 10, 350, 25);
        panel.add(ministryLabel);
        JComboBox ministryBox = new JComboBox(ministry);
        ministryBox.setBounds(400, 12, 130,20);
        panel.add(ministryBox);

        JLabel numberlicenseLabel = new JLabel("شماره مجوز");
        numberlicenseLabel.setBounds(630, 45, 80, 25);
        panel.add(numberlicenseLabel);
        JTextField numberlicenseText = new JTextField(20);
        numberlicenseText.setBounds(500, 45, 100, 25);
        panel.add(numberlicenseText);

        JLabel datelicenseLabel = new JLabel("تاریخ ثبت مجوز");
        datelicenseLabel.setBounds(370, 45, 100, 25);
        panel.add(datelicenseLabel);
        JTextField datelicenseText = new JTextField(20);
        datelicenseText.setBounds(240, 45, 100, 25);
        panel.add(datelicenseText);

        JLabel finishdatelicenseLabel = new JLabel("تاریخ اتمام مجوز");
        finishdatelicenseLabel.setBounds(120, 45, 150, 25);
        panel.add(finishdatelicenseLabel);
        JTextField finishdatelicenseText = new JTextField(20);
        finishdatelicenseText.setBounds(10, 45, 100, 25);
        panel.add(finishdatelicenseText);

        JLabel nameLabel = new JLabel("نام متقاضی");
        nameLabel.setBounds(630, 105, 80, 25);
        panel.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(500, 105, 100, 25);
        panel.add(nameText);

        JLabel familyLabel = new JLabel("نام خانوادگی متقاضی");
        familyLabel.setBounds(350, 105, 150, 25);
        panel.add(familyLabel);
        JTextField familyText = new JTextField(20);
        familyText.setBounds(240, 105, 100, 25);
        panel.add(familyText);

        JLabel idLabel = new JLabel("شناسه ملی متقاضی");
        idLabel.setBounds(100, 105, 150, 25);
        panel.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(10, 105, 80, 25);
        panel.add(idText);

        JLabel commoditytypeLabel = new JLabel("نوع کالا");
        commoditytypeLabel.setBounds(650, 170, 80, 25);
        panel.add(commoditytypeLabel);
        JTextField typecommodityText = new JTextField(20);
        typecommodityText.setBounds(500, 170, 100, 25);
        panel.add(typecommodityText);

        JLabel commoditynameLabel = new JLabel("نام کالا");
        commoditynameLabel.setBounds(400, 170, 80, 25);
        panel.add(commoditynameLabel);
        JTextField commoditynameText = new JTextField(20);
        commoditynameText.setBounds(240, 170, 100, 25);
        panel.add(commoditynameText);

        JLabel typelicenseLabel = new JLabel("نحوه ورود");
        typelicenseLabel.setBounds(150, 170, 80, 25);
        panel.add(typelicenseLabel);
        JComboBox approachBox = new JComboBox(country);
        approachBox.setBounds(40, 170,90,20);
        panel.add(approachBox);

        JLabel constrainLabel = new JLabel("محدودیت :");
        constrainLabel.setBounds(630, 230, 80, 25);
        panel.add(constrainLabel);
        JTextField constrainText = new JTextField(20);
        constrainText.setBounds(100, 230, 500, 50);
        panel.add(constrainText);

        JLabel sourcecountryLabel = new JLabel("کشور مبدا");
        sourcecountryLabel.setBounds(630, 320, 80, 25);
        panel.add(sourcecountryLabel);
        JTextField sourcecountryText = new JTextField(20);
        sourcecountryText.setBounds(500, 320, 100, 25);
        panel.add(sourcecountryText);

        JLabel discountryLabel = new JLabel("کمرگ مقصد");
        discountryLabel.setBounds(400, 320, 80, 25);
        panel.add(discountryLabel);
        JTextField discountryText = new JTextField(20);
        discountryText.setBounds(275, 320, 100, 25);
        panel.add(discountryText);

        JLabel descriptionLabel = new JLabel("توضیحات");
        descriptionLabel.setBounds(630, 380, 80, 25);
        panel.add(descriptionLabel);
        JTextField descriptionText = new JTextField(20);
        descriptionText.setBounds(100, 380, 500, 200);
        panel.add(descriptionText);

        JButton registerButton = new JButton("ثبت مجوز");
        registerButton.setBounds(380, 620, 150, 25);
        panel.add(registerButton);

        JButton printButton = new JButton("چاپ مجوز");
        printButton.setBounds(210, 620, 150, 25);
        panel.add(printButton);

    }

}