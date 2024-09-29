package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position;
    private RandomNumberGenerator randomNumberGenerator;

    public Car(String name,RandomNumberGenerator randomNumberGenerator) {
        if (name.length() > 5) {
            throw new IllegalStateException("이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
        this.position = 0;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void advance() {
        int randomNumber = randomNumberGenerator.generate();
        if (randomNumber >= 4) {
            position++;
        }
    }

    public void graphicPosition() {
        System.out.println(name + " : " + "-".repeat(position));
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

}