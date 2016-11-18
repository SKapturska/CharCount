package charcount;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class WindowStatistics extends JFrame{
    
    TextOperations to = new TextOperations();
    JTextArea taCharStatistics;
    JScrollPane scrollPane;
    JLabel lSort;
    JComboBox cbSort; 
    
    WindowStatistics(String text){
        setTitle("Liczenie znakow");
        setSize(500, 600);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        to.countSigns(text);
        
        taCharStatistics = new JTextArea();
        
        scrollPane = new JScrollPane(taCharStatistics);
        scrollPane.setLocation(25, 80);
        scrollPane.setSize(450,450);
        add(scrollPane);
        
        lSort = new JLabel("Sortowanie: ");
        lSort.setLocation(210, 20);
        lSort.setSize(100, 25);
        add(lSort);
        
        cbSort = new JComboBox();
        cbSort.setLocation(300, 20);
        cbSort.setSize(180, 25);
        cbSort.addItem("Alfabetycznie");
        cbSort.addItem("Częstość występowania");
        add(cbSort);
        
    }
}
