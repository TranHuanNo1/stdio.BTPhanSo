import PhanSo.BaiTap;

import java.util.Scanner;

public class App {
  public static void main(String[] argv)
  {
    BaiTap ps1=new BaiTap();
    BaiTap ps2=new BaiTap();
    ps1.InputData();
    ps2.InputData();
    ps1.OutputData("Phân số 1 sẽ là: ");
    ps2.OutputData("Phân số 2 sẽ là ");
    ps1.RutGon();
    ps1.OutputData("Phân số 1 sau khi rút gọn là: ");
    ps2.RutGon();
    ps2.OutputData("Phân số 2 sau khi rút gọn là: ");
    ps1.Tong(ps2).OutputData("Tổng của hai phân số sẽ là: ");
    ps1.Hieu(ps2).OutputData("Hiệu của hai phân số sẽ là ");
    ps1.Tich(ps2).OutputData("Tích của hai phân số sẽ là: ");
    ps1.Thuong(ps2).OutputData("Thương của hai phân số sẽ là");
  }
}


