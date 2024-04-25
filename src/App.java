import javax.swing.*;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.WindowConstants.EXIT_ON_CLOSE;
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

    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    private javax.swing.JButton[] jButton = new javax.swing.JButton[9];

    public GridLayoutDemo() {
        jPanel1.setLayout( new GridLayout( 3, 3 ) );
        ButtonListener bl = new ButtonListener();
        for ( int i = 0; i<9; i++ ) {
            jButton[i] = new JButton ( "JButton" + (i+1) );
            jButton[i].addActionListener ( bl );
            jPanel1.add ( jButton[i] );
        }
        this.getContentPane().add ( jPanel1 ) ;
        pack();
    }


        public static void main(String[] args) throws Exception {

        // Erzeugung eines neuen Dialoges 
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("JMenuBar Test");
        meinJDialog.setSize(450,300);
        meinJDialog.add(new JLabel("Hello, World!"));
        
        Border bo = new LineBorder(Color.gray);
        JMenuBar bar = new JMenuBar();
        bar.setBorder(bo);
        JMenu menu = new JMenu("Calculator");
        bar.add(menu);
        meinJDialog.setJMenuBar(bar);
        
        JLabel label = new JLabel ("Numbers :D", JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.LEFT);
        meinJDialog.add(label);

        
        JPanel panel = new JPanel(); 
        
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

        //panel.setVerticalAlignment(JPanel.CENTER_ALIGNMENT);
        meinJDialog.add(panel); 
        

        // Wir lassen unseren Dialog anzeigen
        //meinJDialog.pack();
        meinJDialog.setVisible(true);
    }
}
