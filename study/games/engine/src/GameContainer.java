import sun.awt.windows.ThemeReader;

public class GameContainer implements Runnable{
    private Thread thread;
    private Window window;

    private Boolean render=false;
    private boolean running=false;
    private final double UPDATE_CAP =1.0/60.0;
    private int width =320, height =240;
    private float scale = 4f;
    private String title ="evemgine";

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public float getScale() {
        return scale;
    }
    public void setScale(float scale) {
        this.scale = scale;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public GameContainer() {
    }
    public void start() {
        window = new Window(this);

        thread = new Thread(this);
        thread.run();
    }
    public void stop() {
    }
    public void run() {
        running = true;
        double firstTime =0;
        double lastTime =System.nanoTime()/1000000000.0;
        double passedTime =0;
        double unprocessedTime =0;

        double frameTime =0;
        int frames =0;
        int fps=0;

        while (running){
            render=false;

            firstTime = System.nanoTime()/1000000000.0;
            passedTime = firstTime-lastTime;
            lastTime=firstTime;

            unprocessedTime+=passedTime;
            frameTime +=passedTime;

            while (unprocessedTime>=UPDATE_CAP){

                unprocessedTime-=UPDATE_CAP;
                render=true;

                //TODO: update game
                if (frameTime>=1.0){
                    frameTime=0;
                    fps = frames;
                    frames=0;
                    System.out.println("FPS:"+fps);
                }
            }
            if(render){
                //TODO: render game
                window.update();
                frames++;
            }else {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        dispose();
    }
    public void dispose() {
    }


    public static void main(String[] args) {
        GameContainer gc = new GameContainer();
        gc.start();
    }
}


