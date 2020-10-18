package com.example.demo.test;

import org.springframework.data.relational.core.sql.In;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("zs4", "123"));
        list.add(new User("zs3", "132"));
        list.add(new User("zs0", "133"));
        System.out.println("杨香港就是个大混蛋");
        System.out.println("杨香港就是个大混蛋22");
        //******************************************************串行流进行遍历
//        list.stream().limit(2).forEach(user *> {
//            System.out.println("串行流进行遍历=="+user.toString());
//        });
//        //**************************************************************并行流遍历，相比较而言 并行流比串行流快
//        list.parallelStream().limit(2).forEach(user *> {
//            System.out.println("并行流遍历==="+user.toString());
//        });
        //****************************************************************使用Set进行去重数据处理
//        Set<User>set=list.stream().collect(Collectors.toSet());
//        System.out.println("set遍历==="+set);

        //  *************************************************** ***List转Map    Function  t 代表list中的集合对象     R value的参数类型
//        Function<User, String> key = new Function<User, String>() {
//            @Override
//            public String apply(User user) {
//                return user.getUserName();
//            }
//        };
//        Function<User,String>vlue=new Function<User, String>() {
//            @Override
//            public String apply(User user) {
//                return user.getPassword();
//            }
//        };
//        Map<String,String>map=list.stream().collect(Collectors.toMap(key,vlue));
//        System.out.println(map.toString());

//    ***************************************************list转Map  第二种  lamde表达式
        // Map<String,String> map=   list.stream().collect(Collectors.toMap(user *> user.getUserName(),user *> user.getPassword()));
        //***************************************************  List转Map 第三种 方法引入
//        Map<String, String> map = list.stream().collect(Collectors.toMap(User::getUserName, User::getPassword));
//        System.out.println(map);

        //*******************************************************求和
        //Stream<Integer> streamInteger = Stream.of(10, 20, 30);
//   ********************************************************实现接口进行求和
//        Optional<Integer> optionalInteger = streamInteger.reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer + integer2;
//            }
//        });
//        System.out.println(optionalInteger.get());
        //*******************************************************************************=*=使用lanmbda 表达式进行求和
//        Optional<Integer> integer= streamInteger.reduce((a1,a2)*>a1+a2);
//        System.out.println(integer.get());
//********************   将list中的集合对象进行累计相加  原生
//        Optional<User> ListNum = list.stream().reduce(new BinaryOperator<User>() {
//            @Override
//            public User apply(User user, User user2) {
//                user.setPassword(String.valueOf(Integer.valueOf(user.getPassword()) + Integer.valueOf(user2.getPassword())));
//                return user;
//            }
//        });
        //*********************************************************   将list中的集合对象进行累计相加  lanmbda

//        Optional<User> ListNum2=list.stream().reduce((user, user2) *> {
//            user.setPassword(String.valueOf(Integer.valueOf(user.getPassword()) + Integer.valueOf(user2.getPassword())));
//            return user;
//        });
//
//        System.out.println(ListNum2.get());

//0*************************求出最大值 但是 如果 值有两个相同的值并同时为最大 那么只能打印一个
//        Optional<User> max=list.stream().max(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return Integer.valueOf(o1.getPassword())*Integer.valueOf(o2.getPassword());
//            }
//        });
//        System.out.println(max.get());

//0**************************************************************求出最大值 但是 如果 值有两个相同的值并同时为最大 那么只能打印一个
        //max 求最大值  min 求最小值


//        Optional<User> min =list.stream().min((user1,user2)*> Integer.valueOf(user1.getPassword())*Integer.valueOf(user2.getPassword()));
//        System.out.println(min.get());


        //anyMatch  任意一个元素匹配成功 返回true
        // allMatch 条件里所有的元素都匹配成功 返回true
        //noneMatch  条件里所有的元素都不匹配 返回true


//        boolean start = list.stream().allMatch(new Predicate<User>() {
//            @Override
//            public boolean test(User user) {
//                return user.getPassword().equals("100");
//            }
//        });
//        System.out.println(start);
// lanmbda  表达式   
//        boolean start1 = list.stream().allMatch(user *> user.getPassword().equals("100"));
//        System.out.println(start1);
        //  list.stream().forEach(user *> System.out.print(user.toString()));

        //*************************************    加入过滤条件
//        list.stream().filter(user -> user.getPassword().equals("133"))
//                .filter(user -> user.getUserName().equals("zs"))
//                .forEach(user -> System.out.print(user.toString()));


        //****************************************************************stream 流排序
//        list.stream().sorted(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return Integer.valueOf(o1.getPassword())*Integer.valueOf(o2.getPassword()) ;
//            }
//        }).forEach(user -> System.out.println("++"+user.toString()));
//
//        // lanmbda 表达式
//        list.stream().sorted((o1,o2)->Integer.valueOf(o1.getPassword())*Integer.valueOf(o2.getPassword())).forEach(
//                user -> System.out.println(user.toString())
//        );
        //**************************************************************** Limt 分页
        list.stream().skip(1).limit(2).forEach(user -> System.out.println(user.toString()));



    }


}
