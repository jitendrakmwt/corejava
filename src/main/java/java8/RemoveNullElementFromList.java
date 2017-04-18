package java8;

import java.util.List;
import java.util.Objects;

import com.google.common.collect.Lists;

public class RemoveNullElementFromList {
	 public static void main(String[] args) {
		 List<Integer> list = Lists.newArrayList(null, 1, 2, null, 3, null);
		 
		 list.removeIf(p -> p == null);
		 System.out.println(list);
		 
		 List<Integer> listWithoutNulls = Lists.newArrayList(null, 1, 2, null, 3, null);
		 listWithoutNulls.removeIf(Objects::isNull);
		 System.out.println(listWithoutNulls);

	}
}
