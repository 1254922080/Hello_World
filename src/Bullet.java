public class Bullet extends FlyingObject {

    private int speed = 3;  //移动的速度

    /** 初始化数据 */
    public Bullet(int x,int y){
        this.x = x;
        this.y = y;
        this.image = ShootGame.bullet;
    }

    @Override
    public boolean outOfBounds() {
        return y<-height;
    }

    @Override
    public void step() {
        y-=speed;
    }
}
