package SoSanh;

import java.awt.desktop.AboutEvent;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Point {
    private int x;
    private int y;
    public Point(){}
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(Point b){
        this.x=b.x;
        this.y=b.y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    public void vidu1(){
        ArrayList<Point> points=new ArrayList<>();
        points.add(new Point(3,7));
        points.add(new Point(3,6));
        points.add(new Point(5,2));
        Comparator<Point> x_y_compare=new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                return Integer.compare(o1.getX(),o2.getX());
//            }
//                @Override
//                public int compare(Point o1, Point o2) {
//                    int tmp=Integer.compare(o1.getX(),o2.getX());
//                    if(tmp==0)
//                        return Integer.compare(o1.getY(),o2.getY());
//                    return tmp;
//                }
            @Override
            public int compare(Point o1, Point o2) {
                return Integer.compare(o1.getX()+o1.getY(),o2.getX()+o2.getY());
            }

        };
        Collections.sort(points,x_y_compare);
        for (Point p:points){
            System.out.println(p);
        }

    }


    public void bietthuclamda(){
            ArrayList<Point> points=new ArrayList<>();
            points.add(new Point(3,5));
            points.add(new Point(2,6));
            points.add(new Point(5,2));
            points.add(new Point(6,0));
            System.out.println("*****************");
            Predicate<Point> SumPoint=point-> point.getX()+point.getY()>7;
            Predicate<Point> SumPoint2=point -> {
              if(point.getX()>5)
                  return point.getX()+point.getY()>7;
              else return point.getX()+point.getY()>6;
            };
            for(Point p:points){
                if(SumPoint2.test(p))
                    System.out.println(p.toString());
            }
        Function<Point,Integer> sumPoint3=p -> p.getY()+p.getX();
        Function<Point,Integer> sunPoint4=p -> {
            return p.getX() > p.getY() ? p.getY()-p.getX() : p.getY()+p.getX();
        };
        for(Point p:points){
            System.out.println(sunPoint4.apply(p));
        }

        Consumer<Point> printMessage = p ->{
            if(p.getX() > p.getY())
                System.out.println(p.getX()-p.getX());
            else
                System.out.println(p.getX()+p.getY());
        };

        points.forEach(printMessage);
        for (Point p:points){
            printMessage.accept(p);
        }
        points.stream().filter(p -> p.getX()>3).forEach(System.out::println);

        for(Point a:points){
            if(a.getX()>3)
                System.out.println(a.toString());
        }

        Predicate<Point> pre_x=point -> point.getX() >3;
        for(Point p:points)
        {
            if(pre_x.test(p))
                System.out.println(p.toString());
        }

        Consumer<Point> consum_x= p ->{
            if(p.getX()>3)
                System.out.println(p.toString());
        };
        points.forEach(consum_x);

    }
    public void ViDuStream(){
        List<String> names= Arrays.asList("John","Alice","Bob","Anna");
        //lọc các tên bắt đầu bằng 'A'
        names.stream().filter(name ->name.startsWith("A"))
                .forEach(System.out::println);

        List<String> filteredNames=names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        //ánh xạ tên thành chử hoa
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("============");
        names.stream().sorted().forEach(System.out::println);
        System.out.println("============");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("=================");
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        //tính tổng
        int sum=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: "+sum);
        //tính trung bình
        double average=numbers.stream()
                .mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Avergage "+average);
        //tìm giá trị lớn nhất
        OptionalInt max=numbers.stream().mapToInt(Integer::intValue).max();
        System.out.println("Max "+(max.isPresent()?max.getAsInt():"Not persent"));

        //tìm giá trị nhỏ nhất
        OptionalInt min=numbers.stream().mapToInt(Integer::intValue).min();
        System.out.println("min "+(min.isPresent()?min.getAsInt():"Not persent"));
        //sử dụng reduce để tính tổng
        int sum1=numbers.stream().reduce(0,Integer::sum);
        System.out.println("sum using reduce: "+sum1);

        //sử dùng reduce để tìm tích
        int product=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println("product using reduce "+product);

        List<List<String>> listofLists=Arrays.asList(
                Arrays.asList("a","b","c"),
                Arrays.asList("d","e","f"),
                Arrays.asList("g","h","i")
        );

        //sử dùng flatmap để kết hợp các danh sách con thành một danh sách
        List<String> combinedList=listofLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(combinedList);

        double product1=numbers.stream().mapToDouble(Integer::doubleValue).reduce(0,(kq,item)->kq+(1/item));
        System.out.println("kq:"+product1);


    }

    public void ViDuStream2(){
        List<Point> points =new ArrayList<>();
        points.add(new Point(7,2));
        points.add(new Point(3,4));
        points.add(new Point(2,6));
        points.add(new Point(7,1));
        int totalSum=points.stream()
                .flatMapToInt(point -> Arrays.stream(new int[]{point.getX(),point.getY()})).sum();

        //tính tổng các hoành độ
        int sumX=points.stream()
                .filter(p -> p.getX()>5).mapToInt(Point::getX).sum();//chuyển đổi thành intstream dựa trên giá trị x
        //tính tổng các hoành độ >5
        int sumX2=points.stream()
                .filter(p -> p.getX()>5)
                .mapToInt(Point::getX)
                .sum();
        //tính tổng toàn bộ x^2+1-y đôi với các hoành độ >5
        int sumx3=points.stream()
                .filter(p ->p.getX()>5)
                .mapToInt(p->{
                    return p.getX()*p.getX()+1-p.getY();
                }) .sum();

        //in ra từng kết quả x^2+1-y đối với x>4
        points.stream()
                .filter(p->p.getX()>4)
                .mapToInt(p->{
                    return p.getX()*p.getX()+1-p.getY();
                })//chuyển đổi thành intstream đựa trên giá trị x
                .forEach(res -> System.out.println(res));

        //tính tích toàn bộ x^2+1-y đối với các hoành độ >1
        long total5=points.stream()
                .mapToLong(p->{
                    return p.getX()*p.getX()+1-p.getY();
                })
                .reduce(1l,(kq,item)->kq*item);
        System.out.println("total5= "+total5);

        //tính tích các giá trị của 1/(x^2+y)cho tất cả các point
        double totalProduct=points.stream()
                .mapToDouble(p ->{
                    int x=p.getX();
                    int y=p.getY();
                    double tmp=x*x+y;
                    return 1.0/tmp;
                }).reduce(1.0,(res,item)->res*item);
        System.out.println("tích toàn bộ giá tr của 1/(x^2+y) "+totalProduct);
        //in ra danh sách x+y>7
        points.stream()
                .filter((p->(p.getX()+p.getY())>7))
                .forEach(System.out::println);

        //in ra danh sách x>5 và y>1
        points.stream().filter(p->(p.getX()>5 && p.getY()>1))
                .forEach(System.out::println);




    }

    public void tinhtongcachkhac(){
        List<Point> points =new ArrayList<>();
        points.add(new Point(7,2));
        points.add(new Point(3,4));
        points.add(new Point(2,6));
        points.add(new Point(7,1));

//        int tong=0;
//        for(Point p:points){
//            tong+=p.getX()+p.getY();
//        }
//        System.out.println("tong: "+tong);

        int sum=points.stream().mapToInt(p ->{
            return p.getY()+p.getX();
        }).sum();
        System.out.println("sum: "+sum);
    }
}
