/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

/**
 *
 * @author Amruta
 */
public class server extends javax.swing.JFrame {

    static ServerSocket serverSocket;
    static Socket socket;
    static InputStream is;
    static FileOutputStream fos;
    static BufferedOutputStream bos;
    
    static String file_path;
    static DataInputStream in;
    static File transferFile;
    static FileInputStream fin;
    static OutputStream os;
    static BufferedInputStream bin;
   static DataOutputStream out;
    static newModel NwModl;
    static String status;
    /**
     * Creates new form server
     */
    public server() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        writee = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        show = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        filee = new javax.swing.JList();
        send = new javax.swing.JButton();
        check = new javax.swing.JComboBox<String>();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        writee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeeActionPerformed(evt);
            }
        });

        show.setEditable(false);
        show.setColumns(20);
        show.setRows(5);
        jScrollPane1.setViewportView(show);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Server");

        browse.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(filee);

        send.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        check.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        check.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Text doc", "Image", "Java", "Html", "C", "Cpp", "Docx", "class" }));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(writee, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browse, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(writee, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void writeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_writeeActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser ch = new JFileChooser("G:\\AJP_shared data");
        int c = ch.showOpenDialog(this);
        if (c == JFileChooser.APPROVE_OPTION) {
            File file = ch.getSelectedFile();

            file_path = "" + ch.getSelectedFile();
            writee.setText(file.getName());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_browseActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
 try {

           if(check.getSelectedIndex()==0)
            {
                status="Text Docu";
            }
            if(check.getSelectedIndex()==1)
            {
                status="Image";
            }
            if(check.getSelectedIndex()==2)
            {
                status="Java";
            }
            if(check.getSelectedIndex()==3)
            {
                status="Html";
            }
            if(check.getSelectedIndex()==4)
            {
                status="C";
            }
            if(check.getSelectedIndex()==5)
            {
                status="Cpp";
            }
            if(check.getSelectedIndex()==6)
            {
                status="Docx";
            }
            if(check.getSelectedIndex()==7)
            {
                status="class";
            }
            
            transferFile = new File(file_path);
            out = new DataOutputStream(socket.getOutputStream());
            byte[] byteArray = new byte[(int) transferFile.length()];
            fin = new FileInputStream(transferFile);
            bin = new BufferedInputStream(fin);
            bin.read(byteArray, 0, byteArray.length);
            os = socket.getOutputStream();

            out.writeUTF(status+"--!--"+writee.getText());
            os.write(byteArray, 0, byteArray.length);
            show.setText(show.getText()+"\nSending file :"+writee.getText());
            writee.setText("");
            
        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_sendActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

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
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new server().setVisible(true);
                  NwModl = new newModel();
            
        newRenderer NwRndrer = new newRenderer();
        
        filee.setModel(NwModl);
          filee.setCellRenderer(NwRndrer);
            }
        });

        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            show.setText(show.getText() + "connected");
            is = socket.getInputStream();
            in=new DataInputStream(socket.getInputStream());
            
            while(true){
            int filesize = 82722386;
            int bytesRead;
            int currentTot = 0;
            
            String s=in.readUTF();
            String[] arr=s.split("--!--");
            
            byte[] bytearray = new byte[filesize];
            fos = new FileOutputStream("G:\\AJP_shared data\\"+arr[1]);
            
           show.setText(show.getText() + "\nreceived file: "+arr[1]);
            NwModl.display(arr[0],arr[1]);
            bos = new BufferedOutputStream(fos);
            bytesRead = is.read(bytearray, 0, bytearray.length);
            currentTot = bytesRead;
            bos.write(bytearray, 0, bytearray.length);
            
            }
        } catch (Exception e) {}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browse;
    private javax.swing.JComboBox<String> check;
    private static javax.swing.JList filee;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton send;
    private static javax.swing.JTextArea show;
    private javax.swing.JTextField writee;
    // End of variables declaration//GEN-END:variables
}
