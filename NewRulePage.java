import javax.swing.*;
import java.awt.*;

/**
 * Created by hossein on 2/17/16.
 */
public class NewRulePage extends Page {

    @Override
    public void show(boolean exitOnClose) {
        JFrame frame = new JFrame("اضافه کردن قانون جدید");
        frame.setSize(800, 600);
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
        String country[] = {"هوایی","زمینی","دریایی"};

        panel.setLayout(null);

        JLabel ministryLabel = new JLabel("تمامی اظهار نامه هایی که ");
        ministryLabel.setBounds(500, 10, 350, 25);
        panel.add(ministryLabel);

        JLabel azTarikh = new JLabel("از تاریخ");
        azTarikh.setBounds(650, 40, 350, 25);
        panel.add(azTarikh);
        JTextField azTarikhText = new JTextField(20);
        azTarikhText.setBounds(530, 40, 100, 25);
        panel.add(azTarikhText);

        JLabel taTarikh = new JLabel("تا تاریخ");
        taTarikh.setBounds(650, 70, 350, 25);
        panel.add(taTarikh);
        JTextField taTarikhText = new JTextField(20);
        taTarikhText.setBounds(530, 70, 100, 25);
        panel.add(taTarikhText);

        JLabel azGheymatKol = new JLabel("از قیمت کل");
        azGheymatKol.setBounds(650, 120, 350, 25);
        panel.add(azGheymatKol);
        JTextField azGheymatKolText = new JTextField(20);
        azGheymatKolText.setBounds(530, 120, 100, 25);
        panel.add(azGheymatKolText);

        JLabel taGheymatKol = new JLabel("تا قیمت کل");
        taGheymatKol.setBounds(650, 150, 350, 25);
        panel.add(taGheymatKol);
        JTextField taGheymatKolText = new JTextField(20);
        taGheymatKolText.setBounds(530, 150, 100, 25);
        panel.add(taGheymatKolText);

        JLabel taGheymatVahed = new JLabel("تا قیمت واحد");
        taGheymatVahed.setBounds(650, 180, 350, 25);
        panel.add(taGheymatVahed);
        JTextField taGheymatVahedText = new JTextField(20);
        taGheymatVahedText.setBounds(530, 180, 100, 25);
        panel.add(taGheymatVahedText);

        JLabel shameleKalahaye = new JLabel("شامل کالا های");
        shameleKalahaye.setBounds(650, 210, 350, 25);
        panel.add(shameleKalahaye);
        JTextField shameleKalahayeText = new JTextField(20);
        shameleKalahayeText.setBounds(530, 210, 100, 25);
        panel.add(shameleKalahayeText);

        JLabel azSherkathaye = new JLabel("از شرکت های");
        azSherkathaye.setBounds(650, 240, 350, 25);
        panel.add(azSherkathaye);
        JTextField azSherkathayeText = new JTextField(20);
        azSherkathayeText.setBounds(530, 240, 100, 25);
        panel.add(azSherkathayeText);

        JLabel azRahaye = new JLabel("از راه های");
        azRahaye.setBounds(650, 270, 100, 25);
        panel.add(azRahaye);
        JComboBox azRahayeBox = new JComboBox(country);
        azRahayeBox.setBounds(530, 270, 100 ,25);
        panel.add(azRahayeBox);

        JLabel vared = new JLabel("دارای مجوز های");
        vared.setBounds(648, 300, 400, 25);
        panel.add(vared);
        JTextField varedText = new JTextField(20);
        varedText.setBounds(530, 300, 100, 25);
        panel.add(varedText);


        JLabel endText = new JLabel("می توانند وارد کشور شوند.");
        endText.setBounds(500, 330, 400, 25);
        panel.add(endText);

        JButton registerButton = new JButton("ثبت قانون");
        registerButton.setBounds(520, 380, 150, 25);
        panel.add(registerButton);

    }

}
