package java_1_8_13_June_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LemdaExpression_Map {

	List<Integer> li = new ArrayList<>(
			Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8, 9, 10, 23, 34, 15, 6, 45, 3, 5, 3, 5));

	li = li.stream().filter(i -> i%2 != 0 && i>5).toList();}
