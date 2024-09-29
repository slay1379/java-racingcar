package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Game game = new Game();

        game.gameStart();

        System.out.println("");
        System.out.println("실행 결과");
        for (int i = 0; i < game.tryCount; i++) {
            game.gameProgress(game.carList);
        }

        game.gameEnd();
    }
}
