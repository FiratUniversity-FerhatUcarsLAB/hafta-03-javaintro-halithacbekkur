System.out.println("Ürün\tMiktar\tFiyat\tToplam");
                System.out.println("-------------------------------");

                String urun1 = "Süt";
                int miktar1 = 2;
                double fiyat1 = 9.5;
                double toplam1 = miktar1 * fiyat1;

                String urun2 = "Ekmek";
                int miktar2 = 1;
                double fiyat2 = 3.25;
                double toplam2 = miktar2 * fiyat2;

                String urun3 = "Yumurta";
                int miktar3 = 12;
                double fiyat3 = 0.75;
                double toplam3 = miktar3 * fiyat3;

                double genelToplam = toplam1 + toplam2 + toplam3;

                System.out.println(urun1 + "\t\t\t" + miktar1 + "\t" + fiyat1 + "\t\t" + toplam1);
                System.out.println(urun2 + "\t\t" + miktar2 + "\t" + fiyat2 + "\t" + toplam2);
                System.out.println(urun3 + "\t\t" +  miktar3 + "\t" + fiyat3 + "\t" + toplam3);

                System.out.println("-------------------------------");
                System.out.println("Genel Toplam:\t\t\t" + genelToplam);
