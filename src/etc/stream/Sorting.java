package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.Comparator;
import java.util.List;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalMeats = MENU_LIST.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .sorted(comparing(Dish::getCalories))
                .toList();

        lowCalMeats.forEach(System.out::println);

        PrintUtil.printLine();

        // 메뉴들을 이름 내림차로 정렬 (zxy순)
        MENU_LIST.stream()
                .sorted(comparing(Dish::getName).reversed())
                .forEach(System.out::println);

        PrintUtil.printLine();

        // 300 칼로리 이상인 요리 중 칼로리가 낮은 탑3 요리를 필터링
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() >= 300)
                // 칼로리 오름차순, 칼로리가 같다면 이름 오름차순
                .sorted(comparing(Dish::getCalories).thenComparing(Dish::getName))
                .limit(3)
                .forEach(System.out::println);

    }

}
