package gui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;

import sthtorename.DocumentData;
import sthtorename.InnerDocument;

/**
 *
 * @author gapro
 */
@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {
	
	private DocumentData documentData;
	private boolean documentLoaded = false;
	
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	loadDocument = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        create = new javax.swing.JButton();
        transparency = new Transparency();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDF marker");

        loadDocument.setText("load document");
        loadDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				loadDocumentButtonActionPerformed(evt);
            }
        });
        
        previous.setText("previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        create.setText("create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout transparencyLayout = new javax.swing.GroupLayout(transparency);
        transparency.setLayout(transparencyLayout);
        transparencyLayout.setHorizontalGroup(
            transparencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, 1440)
        );
        transparencyLayout.setVerticalGroup(
            transparencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, 2000)
        );

        jLabel1.setText("jLabel1");
        jLabel2.setText("jLabel2");
        jLabel3.setText("jLabel3");
        jLabel4.setText("jLabel4");
        jLabel5.setText("jLabel5");

        jTextField1.setText("jTextField1");
        jTextField2.setText("jTextField2");
        jTextField3.setText("jTextField3");
        jTextField4.setText("jTextField4");
        jTextField5.setText("jTextField5");
        
        
        jTextField1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("focus2");
                if (documentLoaded) {
                	transparency.setActiveDataField(0);                	
                }
            }
            public void focusLost(FocusEvent e) {}
        });

        jTextField2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("focus3");
                if (documentLoaded) {
                	transparency.setActiveDataField(1);                	
                }
            }
            public void focusLost(FocusEvent e) {}
        });

        jTextField3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("focus4");
                if (documentLoaded) {
                	transparency.setActiveDataField(2);                	
                }
            }
            public void focusLost(FocusEvent e) {}
        });

        jTextField4.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("focus5");
                if (documentLoaded) {
                	transparency.setActiveDataField(3);                	
                }
            }
            public void focusLost(FocusEvent e) {}
        });

        jTextField5.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("focus6");
                if (documentLoaded) {
                	transparency.setActiveDataField(4);                	
                }
            }
            public void focusLost(FocusEvent e) {}
        });
        
  
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(transparency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            		.addComponent(loadDocument)
                    .addComponent(create)
                    .addComponent(next)
                    .addComponent(previous))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(loadDocument)
                .addGap(80, 720, 800)
                .addComponent(previous)
                .addGap(18, 18, 18)
                .addComponent(next)
                .addGap(66, 66, 66)
                .addComponent(create)
                .addGap(34, 34, 34))
            .addComponent(transparency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
	private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println("previous");
        try {
			transparency.setImage(ImageIO.read(new File(this.documentData.relativePageMove(-1))));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println("next");
        try {
			transparency.setImage(ImageIO.read(new File(this.documentData.relativePageMove(1))));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println("create");
    }
	private void loadDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println("loadDocument");
        // TODO file names shouldn't be hardcoded
        try {
        	String filePath = ".\\data\\testFile.pdf";
        	int dpi = 85;
        	boolean regenerate = false; // (regerate images when loading) TODO this should be stored in checkbox 
        	
        	this.documentData = new DocumentData(filePath);
        	this.documentData.generateImages(dpi, regenerate);
        	InnerDocument innerDoc = new InnerDocument();
        	transparency.setDataFields(innerDoc.getDataFields());
        	transparency.setImage(ImageIO.read(new File(this.documentData.getCurrentPageImage())));
		} catch (Exception e) {
			e.printStackTrace();
		}
        documentLoaded = true;
    }
	

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
		    UIManager.setLookAndFeel( new FlatDarkLaf() );
		} catch ( Exception ex ) {
		    System.err.println( "Failed to initialize LaF" );
		}

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton loadDocument;
    private javax.swing.JButton previous;
    private javax.swing.JButton next;
    private javax.swing.JButton create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private Transparency transparency;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}
