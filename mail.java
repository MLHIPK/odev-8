package org.odev8;

public class Main {
    public static void main(String[] args) {
        Erkek teamLead = new Erkek("Emre", "Keskin", "12/04/1994");
        Departman departman = new Departman(teamLead);

        Kadin personel1 = new Kadin("Meliha", "İpek", "20/04/1991");
        departman.personelEkle(personel1);

        Kadın personel2 = new Kadın("Elmas", "İpek", "17/07/1965");
        departman.personelEkle(personel2);

        departman.gorevEkle("Muhasebe Müdürü");
        departman.gorevEkle("Developer");

        System.out.println("Team Lead: " + departman.teamLead.ad + " " + departman.teamLead.soyad);
        System.out.println("Personel Listesi: ");
        for (Personel personel : departman.personelList) {
            System.out.println(personel.ad + " " + personel.soyad);
        }
        System.out.println("Görevler: " + departman.assignmentList);
    }
}
