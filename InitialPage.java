import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by softlab on 2/17/16.
 */
public class InitialPage extends Page {

    @Override
    public void show(boolean exitOnClose) {
        JFrame frame = new JFrame("انتخاب سمت");
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
        JButton gomrokMasoul = new JButton("مسیول گمرک");
        gomrokMasoul.setBounds(210, 620, 150, 25);
        panel.add(gomrokMasoul);
        gomrokMasoul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GomrokMasoulPage gomrokMasoulPage = new GomrokMasoulPage();
                gomrokMasoulPage.show(false);
            }
        });

        JButton vezaratKhuneMasoul = new JButton("مسیول وزارت خونه");
        vezaratKhuneMasoul.setBounds(300, 620, 150, 25);
        panel.add(vezaratKhuneMasoul);
        vezaratKhuneMasoul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VezaratKhuneMasoulPage vezaratKhuneMasoulPage = new VezaratKhuneMasoulPage();
                vezaratKhuneMasoulPage.show(false);
            }
        });
    }

}
