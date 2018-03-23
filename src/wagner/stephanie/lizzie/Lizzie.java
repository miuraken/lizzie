package wagner.stephanie.lizzie;

import org.json.JSONException;
import wagner.stephanie.lizzie.analysis.Leelaz;
import wagner.stephanie.lizzie.rules.Board;
import wagner.stephanie.lizzie.gui.LizzieFrame;
import wagner.stephanie.lizzie.analysis.Config;
import java.io.IOException;

/**
 * Main class.
 */
public class Lizzie {
    public static LizzieFrame frame;
    public static Leelaz leelaz;
    public static Board board;
    public static Config config;
    public static String lizzie_version = "0.3";

    /**
     * Launches the game window, and runs the game.
     */
    public static void main(String[] args) throws IOException, JSONException {
        config = new Config();
        leelaz = new Leelaz();
        leelaz.ponder();

        board = new Board();

        frame = new LizzieFrame();
    }
}