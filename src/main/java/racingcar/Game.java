package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.*;
import java.util.stream.Collectors;

public class Game {
    int tryCount = 0;
    List<Car> carList = new ArrayList<>();


    public void gameStart() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carInput = Console.readLine();
        List<String> carString = Arrays.asList(carInput.split(","));
        for (String name : carString) {
            carList.add(new Car(name.trim()));
        }
        System.out.println("시도할 횟수는 몇번인가요?");
        tryCount = Integer.parseInt(Console.readLine());
    }

    public void gameProgress(List<Car> carList) {
        for (Car car : carList) {
            car.advance();
            car.graphicPosition();
        }
        System.out.println();
    }

    public List<Car> gameWinner(List<Car> carList) {
        int maxPosition = carList.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return carList.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
    }

    public void gameEnd() {
        List<Car> winnerList = gameWinner(carList);
        List<String> winner = winnerList.stream().map(Car::getName).toList();
        System.out.println("최종 우승자 : " + String.join(", ", winner));
    }
}
