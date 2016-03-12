/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YolaAdipratama
 */
public class Petugas extends Orang {
    private ArrayList<Anggota> dataAnggota = new ArrayList();

    public Petugas(String nama, long id) {
        super(nama, id);
    }

    public void addAnggota(Anggota a) {
        dataAnggota.add(a);
    }

    public void deleteAnggota(long id) {
        for (int i = 0; i < this.dataAnggota.size(); i++) {
            if (dataAnggota.get(i).getId() == id) {
                dataAnggota.remove(i);
            } else {
                System.out.println("maaf data tidak ditemukan");

            }
        }
    }

    public void EditAnggota(String Status, long id, long idB) {
        for (int i = 0; i < this.dataAnggota.size(); i++) {
            if (dataAnggota.get(i).getId() == id) {
                for (int j = 0; j < dataAnggota.get(i).getJumlahPinjaman(); j++) {
                    dataAnggota.get(i).KembalikanPinjaman(idB);
                }
            } else {
                System.out.println("maaf data tidak ditemukan");
            }
        }
    }

    public void display() {
        for (int i = 0; i < this.dataAnggota.size(); i++) {
            System.out.println("nama: " + dataAnggota.get(i).getNama());
            System.out.println("id  : " + dataAnggota.get(i).getId());
            //loping di getPinjaman.
            for (int j = 0; j < dataAnggota.get(i).getJumlahPinjaman(); j++) {
                System.out.println("Status  : " + dataAnggota.get(i).getPinjaman(j).getStatus() + "\n"
                        + "Tanggal pinjam: " + dataAnggota.get(i).getPinjaman(j).getTanggal());
            }
        }
    }

}
