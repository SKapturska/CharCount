package charcount;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class WindowStatistics extends JFrame{
    
    TextOperations to = new TextOperations();
    JTextArea taCharStatistics;
    JScrollPane scrollPane;

    
    WindowStatistics(String text){
        setTitle("Liczenie znakow");
        setSize(500, 600);
        setLocation(500, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        to.countSigns(text);
        
        taCharStatistics = new JTextArea();
        taCharStatistics.setText(to.writeCountedSigns());
        taCharStatistics.setEditable(false);
        
        scrollPane = new JScrollPane(taCharStatistics);
        scrollPane.setLocation(25, 50);
        scrollPane.setSize(450,450);
        add(scrollPane);
        

    }
}
