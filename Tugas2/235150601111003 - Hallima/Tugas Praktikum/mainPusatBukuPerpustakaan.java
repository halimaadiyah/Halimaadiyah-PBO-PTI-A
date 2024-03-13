public class mainPusatBukuPerpustakaan {
    public void berdasarkanKategori(int pilihanKategori) {
        mainPropertiBukuPerpustakaan propertiBuku = new mainPropertiBukuPerpustakaan();
        
        switch (pilihanKategori){
        case 1 :
            System.out.println("\n=======================");
            System.out.println("Kategori : Teknologi\n");
            propertiBuku.cetakInfoBuku("microsoft Visual", "andi Offset",2021);
            propertiBuku.cetakInfoBuku("the Great Shifting", "rhenaldKasali", 20022);
            propertiBuku.cetakInfoBuku("matinya Kepakaran", "tom Nichols", 2012);
            propertiBuku.cetakInfoBuku("cybertron Solution", "imam Catealy", 2011);
            propertiBuku.cetakInfoBuku("teknologi Pendidikan", "yusufhadi Miarso", 2010);
            break;
         case 2:
            System.out.println("\n=======================");
            System.out.println("Kategori : Filsafat\n");
            propertiBuku.cetakInfoBuku("dunia Sophie", "jostein Gaarder", 2005);
            propertiBuku.cetakInfoBuku("filosofi Teras", "henry Manampiring", 2006);
            propertiBuku.cetakInfoBuku("suwung", "setyo Hajar Dewantoro", 2007);
            propertiBuku.cetakInfoBuku("madilog", "tan Malaka", 2008);
            propertiBuku.cetakInfoBuku("politics", "aristoteles", 2009);
            break;
        case 3:
            System.out.println("\n=======================");
            System.out.println("Kategori : Sejarah\n");
            propertiBuku.cetakInfoBuku("ken Angrok", "damar Shasangka", 2017);
            propertiBuku.cetakInfoBuku("student Hidjo", "marco Kartodikromo", 2018);
            propertiBuku.cetakInfoBuku("amba", "laksmi Pamuntjak", 2017);
            propertiBuku.cetakInfoBuku("entrok", "okky Madasari", 2018);
            propertiBuku.cetakInfoBuku("sejarah Dunia Yang Disembunyikan", "jonathan Black", 2019);
            break;
        case 4:
            System.out.println("\n=======================");
            System.out.println("Kategori : Agama\n");
            propertiBuku.cetakInfoBuku("bersama Quran", "dedi Ilyasa", 2000);
            propertiBuku.cetakInfoBuku("fikih Gaul", "thobiebA lAsyhar", 2001);
            propertiBuku.cetakInfoBuku("self Hypnosis", "bruce Goldberg", 2002);
            propertiBuku.cetakInfoBuku("plan Your Life", "atha Barakat", 2003);
            propertiBuku.cetakInfoBuku("la Tahzan", "aidh AlQarni", 2007);
            break;
         case 5:
            System.out.println("\n=======================");
            System.out.println("Kategori : Psikologi\n");
            propertiBuku.cetakInfoBuku("the Power Of Habit", "charles Duhigg", 1997);
            propertiBuku.cetakInfoBuku("the Social Animal", "elliot Aronson", 1998);
            propertiBuku.cetakInfoBuku("the Selfish Gene", "richard Dawkins", 1999);
            propertiBuku.cetakInfoBuku("maybe You Should Talk to Someone", "lori Gottlieb", 1996);
            propertiBuku.cetakInfoBuku("the Emotional Brain", "joseph ELe Doux", 1995);
            break;
         case 6:
            System.out.println("\n=======================");
            System.out.println("Kategori : Politik\n");
            propertiBuku.cetakInfoBuku("politik Kuasa Media", "noam Chomsky", 2008);
            propertiBuku.cetakInfoBuku("the Republic", "plato", 2009);
            propertiBuku.cetakInfoBuku("suara Pemimpin", "clarken Crossland", 2010);
            propertiBuku.cetakInfoBuku("pon War", "carlvon Clausewitz", 2011);
            propertiBuku.cetakInfoBuku("ppolitics", "aristotle", 2012);
            break;
         case 7:
            System.out.println("\n=======================");
            System.out.println("Kategori : Fiksi\n");
            propertiBuku.cetakInfoBuku("harry Potter", "jk Rowling", 2019);
            propertiBuku.cetakInfoBuku("dracula", "bram Stoker", 2020);
            propertiBuku.cetakInfoBuku("bumi Manusia", "pramoedya Ananta Toer", 2021);
            propertiBuku.cetakInfoBuku("gadis Kretek", "ratih Kumala", 2022);
            propertiBuku.cetakInfoBuku("laut Bercerita", "leila SChudori", 2018);
            break;
        default :
            System.out.println("Kategori yang anda masukkan tidak tersedia");
            break;
        }
     }   
}
