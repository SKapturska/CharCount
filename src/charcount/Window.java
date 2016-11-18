package charcount;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window extends JFrame implements ActionListener {

    JTextArea taFile;
    JScrollPane scrollPane;
    JButton openFile, statistics, close;
    File file;
    String text;

    Window() {
        setTitle("Liczenie znakow");
        setSize(500, 600);
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        taFile = new JTextArea();
        taFile.setEditable(false);

        scrollPane = new JScrollPane(taFile);
        scrollPane.setLocation(25, 80);
        scrollPane.setSize(450, 450);
        add(scrollPane);

        openFile = new JButton("Otwórz plik");
        openFile.setLocation(40, 20);
        openFile.setSize(100, 25);
        openFile.addActionListener(this);
        add(openFile);

        close = new JButton("Zamknij");
        close.setLocation(180, 20);
        close.setSize(100, 25);
        close.addActionListener(this);
        add(close);

        statistics = new JButton("Częstość liter");
        statistics.setLocation(320, 20);
        statistics.setSize(150, 25);
        statistics.addActionListener(this);
        add(statistics);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        TextOperations to = new TextOperations();
        Object source = e.getSource();

        if (source == openFile) {
            JFileChooser fc = new JFileChooser();
            if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                text = to.getFileText(file);
                taFile.append(text);
            }

        } else if (source == statistics) {
            if(file!=null){
            WindowStatistics stats = new WindowStatistics(text);
            stats.setVisible(true);
            }

        } else if (source == close) {
            taFile.setText("");
            to.signs.clear();
            text = "";
            file = null;
        }
    }

}
