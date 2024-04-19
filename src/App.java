import javax.swing.*;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
/*
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
*/

public class App {
    public static void main(String[] args) throws Exception {

        // Erzeugung eines neuen Dialoges 
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("JMenuBar Test");
        meinJDialog.setSize(450,300);
        meinJDialog.add(new JLabel("Hello, World!"));
        
        // Zur Veranschaulichung erstellen wir eine gelbe Umrandung
        Border bo = new LineBorder(Color.gray);
        // Erstellen einer Menüleiste
        JMenuBar bar = new JMenuBar();
        // Wir setzen die erstellte Umrandung für unsere Menüleiste
        bar.setBorder(bo);
        JMenu menu = new JMenu("Calculator");
        bar.add(menu);
        // Menüleiste wird für den Dialog gesetzt
        meinJDialog.setJMenuBar(bar);
        
        JLabel label = new JLabel ("Numbers :D", JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.LEFT);
        meinJDialog.add(label);

        JPanel panel = new JPanel();
        JButton button = new JButton("Drück mich");
        panel.add(button);
        meinJDialog.add(panel);    
        //meinJDialog.pack();
        
        JButton auswahl1 = new JButton("1");
        JButton auswahl2 = new JButton("2");
        JButton auswahl3 = new JButton("3");
        ButtonGroup gruppe = new ButtonGroup();
        gruppe.add(auswahl1);
        gruppe.add(auswahl2);
        gruppe.add(auswahl3);
 
        panel.add(auswahl1);
        panel.add(auswahl2);
        panel.add(auswahl3);

        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);
    }
}
