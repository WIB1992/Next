package packege5;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Собака", 500,10, 0.5f);
        Cat cat1 = new Cat("Кошка",200, 0, 2);
        Horse horse1 = new Horse("Лошадь",1500, 100, 3);
        Bird bird1 = new Bird("Птица",5, 0, 0.2f);

        int toRun = 400;
        int toSwim = 50;
        float toJump = 1f;

        String animalName;
        String animalRun;
        String animalSwim;
        String animalJump;
        String animalRunResult;
        String animalSwimResult;
        String animalJumpResult;

        Animal[] array = {dog1,cat1,horse1,bird1};
        for (int i = 0; i< array.length; i++) {
            animalName = array[i].getName() + " может";

            animalRun = " бежать " + array[i].getRun();
            if (array[i] == cat1 || array[i] == bird1) {
                animalSwim = " не умеет плавать ";
            } else  {
                animalSwim = " плыть " + array[i].getSwim();
            }
            if (array[i].getRun() < toRun) {
                animalRunResult = " В итоге не сможет пробежать 400 ";
            } else {
                animalRunResult = " В итого пробежит 400 ";
            }
            if (array[i].getSwim() < toSwim) {
                animalSwimResult = " утонет ";
            } else {
                animalSwimResult = " проплывет 50 ";
            }
            if (array[i].getJump() < toJump) {
                animalJumpResult = " не прыгнет 1 ";
            } else {
                animalJumpResult = " прыгнет 1 ";
            }
            animalJump = " может прыгнуть " + array[i].getJump();
            System.out.println(animalName + animalRun + animalSwim + animalJump + animalRunResult + animalSwimResult + animalJumpResult);



        }

    }
}
