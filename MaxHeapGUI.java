import java.awt.event.*;
import java.awt.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class HeapViewer {
    public 
    
    private MaxHeapInterface<int extends <? super int> heap = new MaxHeap<int>();
    
    public HeapViewer() {
    
        JFrame frame = new JFrame("Heap Viewer", new BorderLayout());
        frame.setSize(200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar bar = new JMenuBar();
        
        JMenu[] menus = new JMenu[5];
        JMenuItem[] items = new JMenuItem[10];
        
        menus[0] = new JMenu("File");
        
        items[i] = new JMenu("Open...");
            open.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    
                }
            });
        
        
        for (int i = 0; i < items.length; i++) {
            items[i].addActionListener(this);
        }
        
        
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
    
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "Open...": {
                JFileChooser choice = new JFileChooser();
                int result = choice.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION)
                    File file = choice.getSelectedFile().getFile();
                break;
            }
            
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HeapViewer();
            }
        });
    }

}