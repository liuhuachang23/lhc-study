package hsp.chapter19.tankgame08;

import java.util.Vector;

/**
 * @Auther: ������
 * @Date: 2022/4/13 11:23
 * @Description:
 */
public class EnemyTank extends Tank implements Runnable {

    public EnemyTank(int x, int y, int d) {
        super(x, y, d);
    }

    //����һ�� ����̹�˼��� ���ԣ����ڽ��� MyPanel����� ����̹�˼���
    Vector<EnemyTank> enemyTanks = new Vector<>();

    //��MyPanel�У���ʼ������̹�˼��ϵ�ʱ�� �����������,�Ϳ��Խ�����̹�˵ļ���,���õ�����
    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //�жϵ���̹���Ƿ�������ĵ���̹��,��ײ
    public boolean isTouchEnemyTank() {

        //�жϵ�ǰ����̹��(this) ����
        switch (this.getD()) {
            case 0: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��
                        if (enemyTank.getD() == 0 || enemyTank.getD() == 2) {
                            //��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //��ǰ̹�� ���Ͻǵ����� [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��
                        if (enemyTank.getD() == 1 || enemyTank.getD() == 3) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���Ͻǵ����� [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }

                }
                break;
            case 1: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��
                        if (enemyTank.getD() == 0 || enemyTank.getD() == 2) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��
                        if (enemyTank.getD() == 1 || enemyTank.getD() == 3) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��
                        if (enemyTank.getD() == 0 || enemyTank.getD() == 2) {
                            //2. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��
                        if (enemyTank.getD() == 1 || enemyTank.getD() == 3) {
                            //2. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3: //��
                //�õ�ǰ����̹�˺��������еĵ���̹�˱Ƚ�
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //��vector ��ȡ��һ������̹��
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //�����Լ��Ƚ�
                    if (enemyTank != this) {
                        //�������̹������/��
                        if (enemyTank.getD() == 0 || enemyTank.getD() == 2) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY() ]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //�������̹���� ��/��
                        if (enemyTank.getD() == 1 || enemyTank.getD() == 3) {
                            //2. ��ǰ̹�� ���Ͻǵ����� [this.getX(), this.getY() ]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3. ��ǰ̹�� ���½ǵ����� [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    //����ӵ�����
    Vector<Bullet> bullets = new Vector<>();

    @Override
    public void run() {
        while (isLive()) {
            //�������̹�˷�����ӵ�������,�ͼ���������һ�ţ����뵽bullets����
            //�������߳�
            if (isLive() && bullets.size() < 1) {
                Bullet bullet = null;
                switch (getD()) {
                    case 0: //��
                        bullet = new Bullet(getX() + 20, getY(), 0);
                        break;
                    case 1: //��
                        bullet = new Bullet(getX() + 60, getY() + 20, 1);
                        break;
                    case 2: //��
                        bullet = new Bullet(getX() + 20, getY() + 60, 2);
                        break;
                    case 3: //��
                        bullet = new Bullet(getX(), getY() + 20, 3);
                        break;
                }
                bullets.add(bullet);
                new Thread(bullet).start();
            }

            //̹�������ƶ�
            switch (getD()) {
                case 0:  //����
                    //��̹�˱���һ��������30��
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !(isTouchEnemyTank())) {
                            moveUp();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:  //����
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000 && !(isTouchEnemyTank())) {
                            moveRight();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:  //����
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 && !(isTouchEnemyTank())) {
                            moveDown();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:  //����
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !(isTouchEnemyTank())) {
                            moveLeft();
                        }
                        //����50����
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

            }
            setD((int) (Math.random() * 4));
        }
    }
}
