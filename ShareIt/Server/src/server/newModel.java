package server;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Soniya
 */
class newModel extends DefaultListModel {

    String sts;
    String name;

    public newModel() {

    }

    void display(String s, String n) {
        this.sts = s;
        this.name = n;

        if (sts.equals("Text Docu")) {
            ImageIcon i = new ImageIcon("files.png");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }
        if (sts.equals("Image")) {
            ImageIcon i = new ImageIcon("img.png");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }

        if (sts.equals("Java")) {
            ImageIcon i = new ImageIcon("java.png");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }
        if (sts.equals("Html")) {
            ImageIcon i = new ImageIcon("html.png");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }

        if (sts.equals("C")) {
            ImageIcon i = new ImageIcon("c.jpg");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }
        if (sts.equals("Cpp")) {
            ImageIcon i = new ImageIcon("cpp.png");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }

        if (sts.equals("Docx")) {
            ImageIcon i = new ImageIcon("docx.png");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }
        if (sts.equals("class")) {
            ImageIcon i = new ImageIcon("class.png");
            Image img = i.getImage();
            Image newimg = img.getScaledInstance(20, 20, 50);
            ImageIcon im = new ImageIcon(newimg);
            addElement(new Object[]{name, im});
        }
    }

}

class newRenderer extends JLabel implements ListCellRenderer {

    public newRenderer() {
        setOpaque(true);
    }

    public Component getListCellRendererComponent(JList JLst, Object ob1, int indx, boolean isSelected, boolean Focus) {
        newModel Mdl = (newModel) JLst.getModel();
        setText((String) ((Object[]) ob1)[0]);
        setIcon((Icon) ((Object[]) ob1)[1]);
        if (!isSelected) {
            setBackground(Color.white);

        }
        if (isSelected) {

            setBackground(new Color(64, 105, 225));

        }
        return this;
    }
}
