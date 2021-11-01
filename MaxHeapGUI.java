import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class HeapViewer {
    
    public HeapViewer() {
    
        JFrame frame = new JFrame("Heap Viewer", new BorderLayout());
        frame.setSize(200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JLabel before = new JLabel("Before");
        JLabel after = new JLabel("After");
        
        JTextField HeapBefore = new JTextField(1, 500);
        JTextField HeapAfter = new JTextField(1, 500);
        JScrollPane pane = new JScrollPane();
        
        pane.add(HeapBefore);
        pane.add(HeapAfter);
        main.add(pane);
        pane.setVisible(true);
        pane.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HeapViewer();
            }
        }
    });

}