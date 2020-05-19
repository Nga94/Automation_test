package org.example.homework.hk15052020;

public class CauThu extends VanDongVien {
    public String cauLacBo;
    public int luongTuan;

    public String getCauLacBo() {
        return cauLacBo;
    }

    public void setCauLacBo(String cauLacBo) {
        this.cauLacBo = cauLacBo;
    }

    public int getLuongTuan() {
        return luongTuan;
    }

    public void setLuongTuan(int luongTuan) {
        this.luongTuan = luongTuan;
    }

    public CauThu(String cauLacBo) {
        this.cauLacBo = cauLacBo;
    }

    public CauThu(){
    }

    public CauThu(String hoten, int tuoi, float cannang, float chieucao, String cauLacBo, int luongTuan) {
        super(hoten, tuoi, cannang, chieucao);
        this.cauLacBo = cauLacBo;
        this.luongTuan = luongTuan;
    }

    public int soSanh(CauThu c) {
        if (this.luongTuan > c.luongTuan) {
            return  -1;
        }

        if (this.luongTuan < c.luongTuan) {
            return 1;
        }

        return super.soSanh(c);
    }
}
