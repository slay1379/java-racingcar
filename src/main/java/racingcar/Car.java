package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int randomNumber;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public int generateRandomNumber() {
         return Randoms.pickNumberInRange(0, 9);
    }

    public void advance() {
        int randomNumber = generateRandomNumber();
        if (randomNumber >= 4) {
            position++;
        }
    }

    public void graphicPosition() {
        System.out.println(name + " : " + "-".repeat(position));
    }

}