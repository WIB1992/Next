package packege5;

public class Animal {
    String name;
    int run;
    int swim;
    float jump;

    Animal(String name, int run, int swim, float jump) {
    this.name = name;
    this.run = run;
    this.swim = swim;
    this.jump = jump;

    }
    String getName()
    {
        return name;
    }
    int getRun()
    {
        return run;
    }
    int getSwim()
    {
        return swim;
    }
    float getJump()
    {
        return jump;
    }



}
