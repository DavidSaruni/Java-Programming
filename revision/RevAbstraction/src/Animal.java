abstract class Animal {
    abstract void breathe();
    abstract void eat();
    abstract void excrete();
}
interface Bird{
    void fly();
}
interface  Mammal{
    void giveBirth();
}
class Bat extends Animal implements Bird,Mammal{

    @Override
    void breathe() {
        System.out.println("I can Breathe");
    }

    @Override
    void eat() {
        System.out.println("I am eating");
    }

    @Override
    void excrete() {
        System.out.println("I am urinating");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void giveBirth() {
        System.out.println("Giving Birth");
    }
    public static void test(String[] args){
        Bat bat1 = new Bat();
        bat1.breathe();
        bat1.eat();
        bat1.giveBirth();
        bat1.excrete();
        bat1.fly();
    }
}
