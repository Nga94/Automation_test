package org.example.homework.hk15052020;

import java.util.ArrayList;

public class VanDongVien {
    public String hoten;
    public int tuoi;
    public float cannang;
    public float chieucao;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getCannang() {
        return cannang;
    }

    public void setCannang(float cannang) {
        this.cannang = cannang;
    }

    public float getChieucao() {
        return chieucao;
    }

    public void setChieucao(float chieucao) {
        this.chieucao = chieucao;
    }

    public VanDongVien(){
    };

    public VanDongVien(String hoten, int tuoi, float cannang, float chieucao) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.cannang = cannang;
        this.chieucao = chieucao;
    };

    public void print() {
        System.out.println("Họ và tên: " + this.hoten);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Chiều cao: " + this.chieucao);
        System.out.println("Cân nặng" + this.cannang);
    }

    public int soSanh(VanDongVien v) {
        if ((this.chieucao > v.chieucao) || (this.chieucao == v.chieucao && this.cannang > v.cannang)) {
            return  -1;
        }
        if ((this.chieucao < v.chieucao) || (this.chieucao == v.chieucao && this.cannang < v.cannang)) {
            return 1;
        }

        return 0;
    }

}
