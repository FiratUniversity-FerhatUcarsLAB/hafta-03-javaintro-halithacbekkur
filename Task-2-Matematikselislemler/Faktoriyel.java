int sayi = 5;
                int sonuc1 = 1;

                System.out.print("5! = ");

                for (int i = 5; i >= 1; i--) {
                    sonuc1 *= i;
                    System.out.print(i);
                    if (i > 1) {
                        System.out.print(" × ");
                    }
                }

                System.out.println(" = " + sonuc1);
