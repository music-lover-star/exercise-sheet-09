package de.unistuttgart.iste.rss.oo.sheet09.presence.teacher;

/**
 * Hamster game which contains a bug. It's being used to demonstrate the debugging tools provided by eclipse.
 */
public class BuggyHamsterGame extends SimpleHamsterGame {

    public BuggyHamsterGame() {
        game.initialize();
        game.displayInNewGameWindow();
    }

    @Override
    protected void run() {
        // TODO: Place breakpoint marker in NEXT line.
        paule.move();
        paule.move();
        paule.pickGrain();
        paule.pickGrain();
        paule.move();
    }

    public static void main(String[] args) {
        BuggyHamsterGame buggyHamsterGame = new BuggyHamsterGame();
        buggyHamsterGame.game.startGame(false);
        buggyHamsterGame.doRun();
        buggyHamsterGame.game.stopGame();
    }
}
