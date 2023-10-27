package Creational.Singleton.A3;
/*
 * @created 27/10/2023 - 23:24
 * @project designPatterns
 * @author TaosDev
 */

public class Triangle extends Shape{
    @Override
    public String draw() {
       setBrush("Pointed brush");
       setFrame("Triangle");
       setPaper("A2");
       return getBrush() + " - " + getPaper() + " - " + getFrame();
    }
}
