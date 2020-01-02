import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Window {
    private JFrame frame;
    private BufferedImage image;
    private Canvas canvas;
    private BufferStrategy bufferStrategy;
    private Graphics graphics;

    public Window(GameContainer gameContainer) {
        image = new BufferedImage(gameContainer.getWidth(),gameContainer.getHeight(),BufferedImage.TYPE_INT_RGB);
        canvas= new Canvas();
        Dimension size = new Dimension((int)(gameContainer.getWidth()*gameContainer.getScale()),(int)(gameContainer.getHeight()*gameContainer.getScale()));
        canvas.setPreferredSize(size);
        canvas.setMaximumSize(size);
        canvas.setMinimumSize(size);

        frame=new JFrame(gameContainer.getTitle());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout( new BorderLayout());
        frame.add(canvas, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        graphics =bufferStrategy.getDrawGraphics();
    }

    public void update(){
        graphics.drawImage(image,0,0,canvas.getWidth(),canvas.getHeight(),null);
        bufferStrategy.show();
    }
}
