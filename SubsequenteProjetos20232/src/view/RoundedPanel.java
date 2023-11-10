package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int borderRadius = 20; // Raio dos cantos arredondados
        int width = getWidth();
        int height = getHeight();
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, width, height, borderRadius, borderRadius);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fill(roundedRectangle);
    }
    
    @Override
    public Insets getInsets() {
        int value = 20 / 2;
        return new Insets(value, value, value, value);
    }

}
