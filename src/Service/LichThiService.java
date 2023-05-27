/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import CSDL.LICHTHI;
import CSDL.SINHVIEN;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Đặng Huy
 */
public class LichThiService {

    public static void writeFile(String fileName, List list) throws Exception {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(fileName))) {
            for (Object obj : list) {
                write.write(obj.toString());
                write.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public static List<LICHTHI> lichThiFromFile(String fileName) throws Exception {
        List<LICHTHI> list = new ArrayList<>();

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                LICHTHI lichthi = new LICHTHI();
                String[] data = line.split(",");
                lichthi.setTenKyThi(data[0]);
                lichthi.setMonThi(data[1]);
                lichthi.setNgayThi(data[2]);
                lichthi.setCaThi(data[3]);
                lichthi.setPhongThi(data[4]);
                lichthi.setDiemThi(data[5]);
                lichthi.setSoSV(Integer.parseInt(data[6]));
                List<String> listSV = new ArrayList<>();
                for (int i = 0; i < lichthi.getSoSV(); i++) {
                    String dataSV = read.readLine();
                    listSV.add(dataSV);
                }
                lichthi.setListSV(listSV);
                list.add(lichthi);
                read.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        return list;
    }

    public static List<SINHVIEN> SVFromFile(String fileName) throws Exception {
        List<SINHVIEN> listSV = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                SINHVIEN sv = new SINHVIEN();
                String[] data = line.split(",");
                sv.setMasv(data[0]);
                sv.setHoten(data[1]);
                sv.setNgaysinh(data[2]);
                sv.setGioitinh(data[3]);
                sv.setQuequan(data[4]);
                listSV.add(sv);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        return listSV;
    }

    public static SINHVIEN getListSVById(List<SINHVIEN> list, String maSV) {
        for (SINHVIEN sv : list) {
            if (sv.getMasv().equalsIgnoreCase(maSV)) {
                return sv;
            }
        }
        return null;
    }
}
