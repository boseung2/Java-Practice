public class Exercise7_17 {

}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {}
}

class Marine extends Unit{
    @Override
    void move(int x, int y) {
    }

    void stimPack() {}

}

class Tank extends Unit{
    @Override
    void move(int x, int y) {
    }

    void changeMode() {}


}

class Dropship extends Unit{
    @Override
    void move(int x, int y) {
    }

    void load() {}
    void unload() {}


}