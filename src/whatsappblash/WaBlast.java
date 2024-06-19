/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package whatsappblash;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author luqmanaffandi
 */
public class WaBlast extends javax.swing.JFrame {

    /**
     * Creates new form WaBlast
     */
    public WaBlast() {
        initComponents();
    }
    
    private static String readConfig(String filePath)
    {
 
        // Declaring object of StringBuilder class
        StringBuilder builder = new StringBuilder();
 
        // try block to check for exceptions where
        // object of BufferedReader class us created
        // to read filepath
        try (BufferedReader buffer = new BufferedReader(
                 new FileReader(filePath))) {
 
            String str;
 
            // Condition check via buffer.readLine() method
            // holding true upto that the while loop runs
            while ((str = buffer.readLine()) != null) {
 
                builder.append(str).append("\n");
            }
        }
 
        // Catch block to handle the exceptions
        catch (IOException e) {
 
            // Print the line number here exception occurred
            // using printStackTrace() method
            e.printStackTrace();
        }
 
        // Returning a string
        return builder.toString();
    }
    
    private void writeText() throws IOException{
    //creating the instance of file
        File path = new File("config.txt");
       
      //passing file instance in filewriter
        FileWriter wr = new FileWriter(path);
 
        //calling writer.write() method with the string
        wr.write(jTextField1.getText()+"|"+jTextField2.getText()+"|"+jTextField3.getText()+"|"+jTextField4.getText()+"|"+jTextField5.getText()+"|"+jTextField6.getText()+"|");
         
        //flushing the writer
        wr.flush();
         
        //closing the writer
        wr.close();
    }
    
    private void writeString(String s) {
        try {
            Robot robot=new Robot();
            if (s.equals(":")){
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_SEMICOLON);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_SEMICOLON);
            }else if(s.equals("?")){
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_SLASH);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_SLASH);
            }    
            else if(s.equals("*")){
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_8);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_8);    
            }else if(s.equals("~")){
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_BACK_QUOTE);    
            }else if(s.equals("_")){
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_MINUS);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_MINUS);   
            }else if(s.equals("|")){
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_ENTER);   
            }else {
            
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (Character.isUpperCase(c)) {
                        robot.keyPress(KeyEvent.VK_SHIFT);
                    }
                    robot.keyPress(Character.toUpperCase(c));
                    robot.keyRelease(Character.toUpperCase(c));

                    if (Character.isUpperCase(c)) {
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                    }
//                    System.out.println(c);
                }
            }    
            Random random = new Random();
            int rand = random.nextInt(100);
            robot.delay(rand);
        } catch (Exception e) {
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser2 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("WhatsApp Blast D3 MI PSDKU Pamekasan");

        jButton1.setText("Off");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Setting :");

        jLabel3.setText("- Posisi Awal");

        jTextField1.setText("0");
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.setText("0");
        jTextField2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField2InputMethodTextChanged(evt);
            }
        });

        jLabel4.setText("- Posisi Send");

        jTextField3.setText("0");
        jTextField3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField3InputMethodTextChanged(evt);
            }
        });

        jTextField4.setText("0");
        jTextField4.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField4InputMethodTextChanged(evt);
            }
        });

        jLabel5.setText("- Posisi Link");

        jTextField5.setText("0");
        jTextField5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField5InputMethodTextChanged(evt);
            }
        });

        jTextField6.setText("0");
        jTextField6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField6InputMethodTextChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Pesan [pesan ditaruh dalam tanda kurung siku, agar bisa banyak model]: ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Set");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Set");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Set");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton5.setText("Ekspor dari File XLS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Paste");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Paste");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel7.setText("- Posisi Gambar :");

        jTextField7.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField7InputMethodTextChanged(evt);
            }
        });

        jTextField8.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField8InputMethodTextChanged(evt);
            }
        });

        jButton9.setText("Set  Lampirkan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField9.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField9InputMethodTextChanged(evt);
            }
        });

        jTextField10.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField10InputMethodTextChanged(evt);
            }
        });

        jTextField11.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField11InputMethodTextChanged(evt);
            }
        });

        jTextField12.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField12InputMethodTextChanged(evt);
            }
        });

        jTextField13.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField13InputMethodTextChanged(evt);
            }
        });

        jTextField14.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField14InputMethodTextChanged(evt);
            }
        });

        jButton10.setText("Set Foto");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Set File");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Set Open");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("0") && (jTextField2.getText().equals("0"))){
            JOptionPane.showMessageDialog(rootPane, "Maaf, Setting belum benar!");
        }else{
            if(jButton1.getText().equals("On")){
                jButton1.setText("Off");
                jButton1.setBackground(Color.white);
            }else{
                jButton1.setText("On");
                jButton1.setBackground(Color.GREEN);
            
                try {
                    Robot r=new Robot();
                    JOptionPane.showMessageDialog(rootPane, "Robot siap Bekerja dalam 5 detik lagi. Pastikan WhatsApp Web Anda aktif!");
                    r.delay(5000);
                    //Mengulang sebanyak inputan nomer
                    Document doc = jTextArea2.getDocument();
                    Element root = doc.getDefaultRootElement();
                    String nomor="";
                    for(int z=0;z<jTextArea2.getLineCount();z++){
                        r.delay(500);
                        Element element = root.getElement(z);
                        int start = element.getStartOffset();
                        int end = element.getEndOffset();
                        try { 
                           nomor=doc.getText(start, end - start); 
                            //System.out.println(doc.getText(start, end - start));
                            
                        } catch (BadLocationException ex) {
                            //Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //menggerakkan mouse ke posisi awal untuk sender API WA
                        r.mouseMove(Integer.parseInt(jTextField1.getText()), Integer.parseInt(jTextField2.getText()));
                        //klik mouse posisi awal agar kursor di area teks WA
                        r.delay(100);
                        int mask = (int) InputEvent.BUTTON1_DOWN_MASK;
                        r.mousePress(mask);
                        r.mouseRelease(mask);
                        String API="https://wa.me/"+nomor;
                        //API=API+jTextField7.getText();

                        for(int i=0;i<API.length();i++){
                            writeString(String.valueOf(API.charAt(i)));
                        }
                        //mengklik send
//                        r.delay(30 
                        //mengklik link
                        r.delay(3000);
                        r.mouseMove(Integer.parseInt(jTextField5.getText()) , Integer.parseInt(jTextField6.getText()));
                        r.delay(100);
                        r.mouseMove(Integer.parseInt(jTextField5.getText())-20 , Integer.parseInt(jTextField6.getText()));
                        r.mousePress(mask);
                        r.mouseRelease(mask);
                        //mengetik Pesan WA
                        //mengklik send
                        r.delay(3000);
                        r.mouseMove(Integer.parseInt(jTextField3.getText())-100 , Integer.parseInt(jTextField4.getText()));
                        r.mousePress(mask);
                        r.mouseRelease(mask);
                        r.delay(3000);

                        //cek apakah ada konten
                        if(!jTextField7.getText().equals("")&&(!jTextField8.getText().equals(""))){
                            int j7=Integer.parseInt(jTextField7.getText());
                            int j8=Integer.parseInt(jTextField8.getText());
                            r.delay(500);
                            r.mouseMove(j7, j8);
                            r.mousePress(mask);
                            r.mouseRelease(mask);
                        }
                        if(!jTextField9.getText().equals("")&&(!jTextField10.getText().equals(""))){
                            int j9=Integer.parseInt(jTextField9.getText());
                            int j10=Integer.parseInt(jTextField10.getText());
                            r.delay(500);
                            r.mouseMove(j9, j10);
                            r.mousePress(mask);
                            r.mouseRelease(mask);
                        }
                        if(!jTextField11.getText().equals("")&&(!jTextField12.getText().equals(""))){
                            int j11=Integer.parseInt(jTextField11.getText());
                            int j12=Integer.parseInt(jTextField12.getText());
                            r.delay(500);
                            r.mouseMove(j11, j12);
                            r.mousePress(mask);
                            r.mouseRelease(mask);
                        }
                        if(!jTextField13.getText().equals("")&&(!jTextField14.getText().equals(""))){
                            int j13=Integer.parseInt(jTextField13.getText());
                            int j14=Integer.parseInt(jTextField14.getText());
                            r.delay(500);
                            r.mouseMove(j13, j14);
                            r.mousePress(mask);
                            r.mouseRelease(mask);
                            //mengklik send
                            r.delay(3000);
                            r.mouseMove(Integer.parseInt(jTextField3.getText()) , Integer.parseInt(jTextField4.getText()));
                            r.mousePress(mask);
                            r.mouseRelease(mask);
                        }
                        r.delay(1000);
                        r.mouseMove(Integer.parseInt(jTextField3.getText())-100 , Integer.parseInt(jTextField4.getText()));
                        r.mousePress(mask);
                        r.mouseRelease(mask);
                        r.delay(3000);
                        String[] pesan=jTextArea1.getText().split("]");
                        int jum=pesan.length;
                        Random rand = new Random();
                        int rand_int2 = rand.nextInt(jum);
                        String pesanBersih=pesan[rand_int2].replace("[", "");
                        
                        for(int p=0;p<pesanBersih.length();p++){
                            writeString(String.valueOf(pesanBersih.charAt(p)));
                        }
                        //mengklik send
                        r.delay(3000);
                        r.mouseMove(Integer.parseInt(jTextField3.getText()) , Integer.parseInt(jTextField4.getText()));
                        r.mousePress(mask);
                        r.mouseRelease(mask);
                        
                        
                        r.delay(500);
                    }
            } catch (Exception e) {
            }
        }    
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x =(int) b.getX();
        int y = (int) b.getY();
        jTextField1.setText(String.valueOf(x));
        jTextField2.setText(String.valueOf(y));
         try {
            // TODO add your handling code here:
            writeText();
        } catch (IOException ex) {
            Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x =(int) b.getX();
        int y = (int) b.getY();
        jTextField3.setText(String.valueOf(x));
        jTextField4.setText(String.valueOf(y));
         try {
            // TODO add your handling code here:
            writeText();
        } catch (IOException ex) {
            Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x =(int) b.getX();
        int y = (int) b.getY();
        jTextField5.setText(String.valueOf(x));
        jTextField6.setText(String.valueOf(y));
         try {
            // TODO add your handling code here:
            writeText();
        } catch (IOException ex) {
            Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser j = new JFileChooser();
 
        // Open the save dialog
        j.showSaveDialog(null);
//        System.out.println(j.getSelectedFile().getAbsolutePath());
        try {
            //obtaining input bytes from a file  
            String alamat=j.getSelectedFile().getAbsolutePath();
            System.out.println(alamat);
            FileInputStream fis=new FileInputStream(new File(alamat));  
            //creating workbook instance that refers to .xls file  
            HSSFWorkbook wb=new HSSFWorkbook(fis);   
            //creating a Sheet object to retrieve the object  
            HSSFSheet sheet=wb.getSheetAt(0);  
            //evaluating cell type   
            FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
            for(Row row: sheet)     //iteration over row using for each loop  
            {  
            for(Cell cell: row)    //iteration over cell using for each loop  
            { 
            String no="";
            switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
            {  
            case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
            //getting the value of the cell as a number  
            System.out.print(cell.getNumericCellValue()+ "\t\t");   
            jTextArea2.append(cell.getStringCellValue()+"\n");
            break;  
            case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
            //getting the value of the cell as a string  
            System.out.print(cell.getStringCellValue()+ "\t\t");  
            jTextArea2.append(cell.getStringCellValue()+"\n");
            break;  
            }  
            }  
//            System.out.println("Ok");  
            }          // Load the Excel file

        } catch (Exception e) {
            System.err.println("gak ok");
        }
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField2InputMethodTextChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField2InputMethodTextChanged

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    private void jTextField3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField3InputMethodTextChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField3InputMethodTextChanged

    private void jTextField4InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField4InputMethodTextChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField4InputMethodTextChanged

    private void jTextField5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField5InputMethodTextChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField5InputMethodTextChanged

    private void jTextField6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField6InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6InputMethodTextChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        String config=readConfig("config.txt");
        String[] pecah=config.split("\\|");
        jTextField1.setText(pecah[0]);
        jTextField2.setText(pecah[1]);
        jTextField3.setText(pecah[2]);
        jTextField4.setText(pecah[3]);
        jTextField5.setText(pecah[4]);
        jTextField6.setText(pecah[5]);
    }//GEN-LAST:event_formWindowActivated

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextArea1.paste();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTextArea2.paste();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField7InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField7InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7InputMethodTextChanged

    private void jTextField8InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField8InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8InputMethodTextChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x =(int) b.getX();
        int y = (int) b.getY();
        
        jTextField7.setText(String.valueOf(x));
        jTextField8.setText(String.valueOf(y));
        
         try {
            // TODO add your handling code here:
            writeText();
        } catch (IOException ex) {
            Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField9InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField9InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9InputMethodTextChanged

    private void jTextField10InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField10InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10InputMethodTextChanged

    private void jTextField11InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField11InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11InputMethodTextChanged

    private void jTextField12InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField12InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12InputMethodTextChanged

    private void jTextField13InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField13InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13InputMethodTextChanged

    private void jTextField14InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField14InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14InputMethodTextChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x =(int) b.getX();
        int y = (int) b.getY();
        
        jTextField9.setText(String.valueOf(x));
        jTextField10.setText(String.valueOf(y));
        
         try {
            // TODO add your handling code here:
            writeText();
        } catch (IOException ex) {
            Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x =(int) b.getX();
        int y = (int) b.getY();
        
        jTextField11.setText(String.valueOf(x));
        jTextField12.setText(String.valueOf(y));
        
         try {
            // TODO add your handling code here:
            writeText();
        } catch (IOException ex) {
            Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x =(int) b.getX();
        int y = (int) b.getY();
        
        jTextField13.setText(String.valueOf(x));
        jTextField14.setText(String.valueOf(y));
        
         try {
            // TODO add your handling code here:
            writeText();
        } catch (IOException ex) {
            Logger.getLogger(WaBlast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String[] pesan=jTextArea1.getText().split("]");
        int jum=pesan.length;
        Random rand = new Random();
        int rand_int2 = rand.nextInt(jum);
        String pesanBersih=pesan[rand_int2].replace("[", "");
        
        JOptionPane.showMessageDialog(rootPane,pesanBersih );
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WaBlast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaBlast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaBlast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaBlast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaBlast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
