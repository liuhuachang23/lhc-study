package hsp.chapter17.tankgame03;

import java.util.Vector;

public class EnemyTank extends Tank {
    /**
     *敌人的坦克
     * @param x 坦克(左上角)的x坐标
     * @param y 坦克(左上角)的y坐标
     */
    public EnemyTank(int x, int y) {
        super(x, y);
    }
    Vector<Bullet> bullets = new Vector<>();

}
