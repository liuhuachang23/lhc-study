package hsp.chapter19.tankgame08;

import java.util.Vector;

/**
 * @Auther: ������
 * @Date: 2022/4/13 11:19
 * @Description:
 */
public class MyTank extends Tank {

    public MyTank(int x, int y, int d) {
        super(x, y, d);
    }

    //����ӵ�����
    Vector<Bullet> bullets = new Vector<>();

    //��ӿ��𷽷�
    public void shotEnemyTank() {
        //�����ӵ�����
        if (bullets.size() == 5){
            return;
        }
        switch (getD()) {
            case 0: //��
                bullets.add(new Bullet(getX() + 20, getY(), 0));
                break;
            case 1: //��
                bullets.add(new Bullet(getX() + 60, getY() + 20, 1));
                break;
            case 2: //��
                bullets.add(new Bullet(getX() + 20, getY() + 60, 2));
                break;
            case 3: //��
                bullets.add(new Bullet(getX(), getY() + 20, 3));
                break;
        }
        //�������ǵ��ӵ��߳�
        for (int i = 0; i < bullets.size(); i++) {
            if (bullets.get(i).isLive()) {
                new Thread(bullets.get(i)).start();
            }
        }
    }

}
