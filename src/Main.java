public class Main {
    public static void main(String[] args) {
        byte apples=5;
        System.out.println( "В ящике " + apples + " кг яблок ");
        int box=100;
        int onePortion=box/10;
        System.out.println( " В одном ящике  содержится " + onePortion + " яблок ");
        float cake=5;
        float partOfCake=cake/2;
        System.out.println( " Торт состоит из " + partOfCake + " частей ");
        byte a=5;
        short c=10;
        int j=20;
        int n=a+c+j;
        System.out.println(n);
        float h=n+10f;
        System.out.println(h);
        double m=h/14;
        System.out.println(m);
        long l=10000L;
        System.out.println(l);
        float k=27.12f;
        System.out.println(k);
        long o=987678965549L;
        System.out.println(o);
        float b=2.786f;
        System.out.print
        short p=569;
        System.out.println(p);
        short t=-159;
        System.out.println(t);
        short q=27897;
        System.out.println(q);
        byte s=67;
        System.out.println(s);
        byte ludmilaPavlovna=23;
        short annaSergeevna=27;
        int ekaterinaAndreevna=30;
        int vsegoUchenikov=ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println(vsegoUchenikov);
        int paperForOne=480/vsegoUchenikov;
        System.out.println( "На каждого ученика рассчитано " + paperForOne + " листов бумаги");
        byte productivity=16/2;
        System.out.println( "За одну  минуту машина произвела " +productivity + " штук бутылок ");
        int productivityTwentyMinures=productivity*20;
        System.out.println("За 20 минут машина произвела " + productivityTwentyMinures + " штук бутылок");
        int productivityOneDay=productivity*60*24;
        System.out.println(" За одни сутки машина произвела " + productivityOneDay + " штук бутылок");
        int productivityThreeDays=productivityOneDay*3;
        System.out.println(" За тридня машина произвела " + productivityThreeDays + " штук бутылок");
        int productivityOneMonth=productivityOneDay*30;
        System.out.println( " За один месяц машина произвела " + productivityOneMonth + " штук бутылок ");
        byte paintWhite=2;
        byte paintBrown=4;
        int sumPaintForOneClass=paintWhite+paintBrown;
        byte totalPaint=120;
        int totalClass=totalPaint/sumPaintForOneClass;
        int sumPaintWhite=paintWhite*totalClass;
        int sumPaintBrown=paintBrown*totalClass;
        System.out.println( " В школе, где " + totalClass + " классов, нужно " + sumPaintWhite + " банок белой краски и " + sumPaintBrown + " банок коричневой краски." );
        int weightBananas=5*80;
        int weightMilk=2*105;
        int weightIceCream=2*100;
        int weightEggs=4*70;
        int totalWeight=weightBananas+weightMilk+weightIceCream+weightEggs;
        System.out.println( " Общий вес спортзавтрака " + totalWeight + " грамм");
        float totalWeightKg=totalWeight/1000F;
        System.out.println(" Общий вес спортзавтрака " + totalWeightKg + " кг");
        int loseWeight250=250;
        int daysForLose250=7000/loseWeight250;
        System.out.println( "При ежедневной потере веса на " + loseWeight250 + " грамм спортсмен похудеет за " + daysForLose250 +  "дней");
        int loseWeight500=500;
        int daysForLose500=7000/loseWeight500;
        System.out.println( " При ежедневной потере веса на " + loseWeight500 + " кг сортсмен похудеет за " + daysForLose500 + " дней");
        int averageLoseWeight=(loseWeight250+loseWeight500)/2;
        float averageDaysForLoseWeihgt=7000/averageLoseWeight;
        System.out.println( "В среднем спортсмен похудеет за " + averageDaysForLoseWeihgt + " дней");
        int masha=67760;
        int mashaSalaryYear=masha*12;
        float mashaPercent10=masha*1.1f;
        float mashaNewSalaryYear=mashaPercent10*12;
        float mashaDifferentSalaryYear=mashaNewSalaryYear-mashaSalaryYear;
        System.out.println( "Маша теперь получает " + mashaPercent10 + " рублей. Годовой доход вырос на " + mashaDifferentSalaryYear + " рублей");
        int denis=83690;
        int denisSalaryYear=denis*12;
        float denisPercent10=denis*1.1f;
        float denisNewSalaryYear=denisPercent10*12;
        float denisDifferentSalaryYear=denisNewSalaryYear-denisSalaryYear;
        System.out.println( "Денис теперь получает " + denisPercent10 + " рублей. Годовой доход вырос на " + denisDifferentSalaryYear + " рублей");
        int kristina=76230;
        int kristinaSalaryYear=kristina*12;
        float kristinaPercent10=kristina*1.1f;
        float kristinaNewSalaryYear=kristinaPercent10*12;
        float kristinaDifferentSalaryYear=kristinaNewSalaryYear-kristinaSalaryYear;
        System.out.println( "Кристина теперь получает " + kristinaPercent10 + " рублей. Годовой доход вырос на " + kristinaDifferentSalaryYear + " рублей");




    }

}