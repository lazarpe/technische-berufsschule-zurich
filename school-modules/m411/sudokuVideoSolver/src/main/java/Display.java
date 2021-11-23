import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by lazar on 11/2/2021.
 * Project name: SudokuVideoSolver
 **/
public class Display extends Thread {
    private final int PLAYING_FIELD_SIZE = 11;
    private BlockingQueue<int[][]> queue = new LinkedBlockingQueue<>();
    private JFrame jFrame = new JFrame();
    private JLabel[][] playingField = new JLabel[PLAYING_FIELD_SIZE][PLAYING_FIELD_SIZE];

    @Override
    public void run() {
        printPlayingField();
        generateDisplay(500, 500);
        setListener();


        while (true) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (queue.size() > 0) {
                try {
                    int[][] currentGrid = queue.take();
                    int counterI = 0;
                    for (int i = 0; i < PLAYING_FIELD_SIZE; i++) {
                        if ((i + 1) % 4 == 0) {
                            counterI++;
                            continue;
                        }
                        int counterJ = 0;
                        for (int j = 0; j < PLAYING_FIELD_SIZE; j++) {
                            if ((j + 1) % 4 == 0) {
                                counterJ++;
                                continue;
                            }
                           playingField[j][i].setText( currentGrid[j-counterJ][i-counterI] + "");

                        }
                    }
                } catch (InterruptedException ignored) {
                }
            }
        }
    }

    public void generateDisplay(int width, int height) {
        jFrame.setSize(width, height);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setMinimumSize(new Dimension(width, height));
        jFrame.getContentPane().setBackground(new Color(68, 84, 31));
        jFrame.pack();
    }

    public int[] getBoundSize() {
        Rectangle r = jFrame.getBounds();
        return new int[]{r.height, r.width};
    }

    public void setListener() {
        jFrame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                labelPosition();
            }
        });
    }

    public void printPlayingField() {
        //[3:17 PM] 11/2/2021 Böppli Jannik
        final double fieldXSize = 0.78 / PLAYING_FIELD_SIZE;
        final double fieldYSize = 0.78 / PLAYING_FIELD_SIZE;
        double positionY = 0.1;
        for (int y = 0; y < PLAYING_FIELD_SIZE; y++) {
            double positionX = 0.1;
            for (int x = 0; x < PLAYING_FIELD_SIZE; x++) {
                playingField[y][x] = new JLabel();

//                playingField[y][x].addMouseListener(this);
                playingField[y][x].setFocusable(false);
                playingField[y][x].setVisible(true);

                playingField[y][x].setBorder(null);
                playingField[y][x].setFont(new Font("MV Boli", Font.BOLD, 20));
                playingField[y][x].setBounds((int) (getBoundSize()[1] * positionX), (int) (getBoundSize()[0] * positionY),
                        (int) (getBoundSize()[1] * fieldXSize), (int) (getBoundSize()[0] * fieldYSize));
                playingField[y][x].setBounds(100, 100, 100, 100);
                jFrame.add(playingField[y][x]);

                positionX += fieldXSize;
            }
            positionY += fieldYSize;
        }
    }

    public void labelPosition() {
        final double fieldXSize = 0.78 / PLAYING_FIELD_SIZE;
        final double fieldYSize = 0.78 / PLAYING_FIELD_SIZE;
        double positionY = 0.1;
        for (int y = 0; y < PLAYING_FIELD_SIZE; y++) {
            double positionX = 0.1;
            for (int x = 0; x < PLAYING_FIELD_SIZE; x++) {
                playingField[y][x].setBounds((int) (getBoundSize()[1] * positionX), (int) (getBoundSize()[0] * positionY),
                        (int) (getBoundSize()[1] * fieldXSize), (int) (getBoundSize()[0] * fieldYSize));


                positionX += fieldXSize;
            }
            positionY += fieldYSize;
        }
    }

    public BlockingQueue<int[][]> getQueue() {
        return queue;
    }
}
