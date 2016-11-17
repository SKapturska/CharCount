package charcount;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window extends JFrame implements ActionListener{
    
    JTextArea taFile;
    JScrollPane scrollPane;
    JButton openFile, statistics;

    Window() {
        setTitle("Liczenie znakow");
        setSize(500, 600);
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        taFile = new JTextArea();
        
        scrollPane = new JScrollPane(taFile);
        scrollPane.setLocation(25, 80);
        scrollPane.setSize(450,450);
        add(scrollPane);
        
        openFile = new JButton("Otwórz plik");
        openFile.setLocation(40,20);
        openFile.setSize(100,25);
        openFile.addActionListener(this);
        add(openFile);
        
        statistics = new JButton("Częstość liter");
        statistics.setLocation(200, 20);
        statistics.setSize(150, 25);
        statistics.addActionListener(this);
        add(statistics);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == openFile){
            JFileChooser fc = new JFileChooser();
            
        }else if(source == statistics){
            
        }
    }
}
