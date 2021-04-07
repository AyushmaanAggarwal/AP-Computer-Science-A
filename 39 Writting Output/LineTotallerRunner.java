public class LineTotallerRunner {
    public static void main(String[] args){
        LineTotaller lt = new LineTotaller("0");
        lt.setLine("1 2 3 4 5 6");
        System.out.println(lt);
        System.out.println("sum = "+lt.getSum()+"\n\n");

        lt.setLine("10 20 30 40 50 60");
        System.out.println(lt);
        System.out.println("sum = "+lt.getSum()+"\n\n");

        lt.setLine("250 657 2154 345 6796");
        System.out.println(lt);
        System.out.println("sum = "+lt.getSum()+"\n\n");

        lt.setLine("0");
        System.out.println(lt);
        System.out.println("sum = "+lt.getSum()+"\n\n");

        lt.setLine("-99 45 -98 92 87");
        System.out.println(lt);
        System.out.println("sum = "+lt.getSum()+"\n\n");
    }
    
}
