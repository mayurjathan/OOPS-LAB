/* Create a Time class that has separate integer member data for hours, minutes and
seconds. One constructor should initialize these data to zero and another should
initialize to fixed value. A method should display time in hh:mm:ss format. Finally a
method should add 2 objects of time passed as argument. */
class time {
    int hr;
    int min;
    int sec;

    time() {
    }

    time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void addtime(time t) {
        int suminsec = (this.timeToSec() + t.timeToSec());
        time temp = new time();
        temp.hr = suminsec / 3600;
        temp.min = suminsec % 3600 / 60;
        temp.sec = suminsec % 3600 % 60;
        temp.display();
    }

    int timeToSec() {
        return (hr * 3600 + min * 60 + sec);
    }

    void display() {
        System.out.println(hr + ":" + min + ":" + sec);
    }

}

class TimeDemo {
    public static void main(String[] args) {
        time t1 = new time();
        time t2 = new time(3, 13,55);
        time t3 = new time(6, 10, 25);
        t1.display();
        t2.display();
        t3.display();
        t2.addtime(t3);
    }
}
