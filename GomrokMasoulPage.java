import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by softlab on 2/17/16.
 */
public class GomrokMasoulPage extends Page {
    @Override
    public void show(boolean exitOnClose) {
        JFrame frame = new JFrame("امکانات مسیول گمرک");
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
        JButton EzharNamehPorKardan = new JButton("بر کردن اظهار نامه");
        EzharNamehPorKardan.setBounds(210, 620, 150, 25);
        panel.add(EzharNamehPorKardan);
        EzharNamehPorKardan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EzharNamehPage ezharNamehPage = new EzharNamehPage();
                ezharNamehPage.show(false);
            }
        });

        JButton ghanunSodur = new JButton("صدور قانون");
        ghanunSodur.setBounds(300, 620, 150, 25);
        panel.add(ghanunSodur);
        ghanunSodur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewRulePage newRulePage = new NewRulePage();
                newRulePage.show(false);
            }
        });
    }
}
