import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.Category;

@ScriptManifest(author = "RickyDactyl", name = "rVyreThiever", version = 0.1, description = "Thieves Vyres for Blood Shards", category = Category.THIEVING)
public class Main extends AbstractScript {

    public void onStart() {

    }

    public void onExit() {

    }

    @Override
    public int onLoop() {

        return 1200;
    }
}