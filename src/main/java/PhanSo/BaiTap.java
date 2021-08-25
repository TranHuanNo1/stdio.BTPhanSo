package PhanSo;
import java.util.Scanner;

public class BaiTap {
    int ts, ms;
    Scanner input = new Scanner(System.in);

    public BaiTap() {
    }

    public void InputData() {
        System.out.print("Nhap tu so: ");
        this.ts = input.nextInt();
        do {
            System.out.print("Nhap mau so: ");
            this.ms = input.nextInt();
        }
        while (this.ms == 0);
    }

    public void OutputData(String y) {
        System.out.println(y + " " + this.ts + "/" + this.ms);
    }

    public int UCLN(int a, int b) {
        if ((a == 0) || (b == 0))
            return a + b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public void RutGon() {
        int i = UCLN(ts, ms);
        this.ts = this.ts / i;
        this.ms = this.ms / i;
    }

    public void NghichDao() {
        int tg = this.ts;
        this.ts = this.ms;
        this.ms = tg;
    }

    public BaiTap Tong(BaiTap f) {
        BaiTap ps = new BaiTap();
        ps.ts = ((this.ts * f.ms) + (this.ms * f.ts));
        ps.ms = (this.ms * f.ms);
        ps.RutGon();
        return ps;
    }

    public BaiTap Hieu(BaiTap f) {
        BaiTap ps = new BaiTap();
        ps.ts = (this.ts * f.ms) - (this.ms * f.ts);
        ps.ms = (this.ms * f.ms);
        return ps;
    }

    public BaiTap Tich(BaiTap f) {
        BaiTap ps = new BaiTap();
        ps.ts = this.ts * f.ts;
        ps.ms = this.ms * f.ms;
        ps.RutGon();
        return ps;
    }

    public BaiTap Thuong(BaiTap f) {
        BaiTap ps = new BaiTap();
        ps.ts = this.ts * f.ms;
        ps.ms = this.ms * f.ts;
        ps.RutGon();
        return ps;
    }
}