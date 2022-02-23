//在 LeetCode 商店中， 有 n 件在售的物品。每件物品都有对应的价格。然而，也有一些大礼包，每个大礼包以优惠的价格捆绑销售一组物品。
//
// 给你一个整数数组 price 表示物品价格，其中 price[i] 是第 i 件物品的价格。另有一个整数数组 needs 表示购物清单，其中 needs[
//i] 是需要购买第 i 件物品的数量。
//
// 还有一个数组 special 表示大礼包，special[i] 的长度为 n + 1 ，其中 special[i][j] 表示第 i 个大礼包中内含第 j
// 件物品的数量，且 special[i][n] （也就是数组中的最后一个整数）为第 i 个大礼包的价格。
//
// 返回 确切 满足购物清单所需花费的最低价格，你可以充分利用大礼包的优惠活动。你不能购买超出购物清单指定数量的物品，即使那样会降低整体价格。任意大礼包可无限
//次购买。
//
//
//
// 示例 1：
//
//
//输入：price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
//输出：14
//解释：有 A 和 B 两种物品，价格分别为 ¥2 和 ¥5 。
//大礼包 1 ，你可以以 ¥5 的价格购买 3A 和 0B 。
//大礼包 2 ，你可以以 ¥10 的价格购买 1A 和 2B 。
//需要购买 3 个 A 和 2 个 B ， 所以付 ¥10 购买 1A 和 2B（大礼包 2），以及 ¥4 购买 2A 。
//
// 示例 2：
//
//
//输入：price = [2,3,4], special = [[1,1,0,4],[2,2,1,9]], needs = [1,2,1]
//输出：11
//解释：A ，B ，C 的价格分别为 ¥2 ，¥3 ，¥4 。
//可以用 ¥4 购买 1A 和 1B ，也可以用 ¥9 购买 2A ，2B 和 1C 。
//需要买 1A ，2B 和 1C ，所以付 ¥4 买 1A 和 1B（大礼包 1），以及 ¥3 购买 1B ， ¥4 购买 1C 。
//不可以购买超出待购清单的物品，尽管购买大礼包 2 更加便宜。
//
//
//
// 提示：
//
//
// n == price.length
// n == needs.length
// 1 <= n <= 6
// 0 <= price[i] <= 10
// 0 <= needs[i] <= 10
// 1 <= special.length <= 100
// special[i].length == n + 1
// 0 <= special[i][j] <= 50
//
// Related Topics 位运算 记忆化搜索 数组 动态规划 回溯 状态压缩
// 👍 316 👎 0


package com.sjzc.javaTest.leetcode;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution0638 {
	// List<Integer> price = Lists.newArrayList(2, 5);
	//
	// List<List<Integer>> special = Lists.newArrayList();
	// 	special.add(Lists.newArrayList(3, 0, 5));
	// 	special.add(Lists.newArrayList(1, 2, 10));

	// List<Integer> needs = Lists.newArrayList(3, 2);

	public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
		// 礼包价格索引
		int priceIndex = special.get(0).size() - 1;
		calcRate(price, special.get(0));
		calcRate(price, special.get(1));
		return calc(price, needs, 0);
	}

	public BigDecimal calcRate(List<Integer> price,List<Integer> list) {

		int priceIndex = list.size() - 1;
		int newPrice = list.get(priceIndex);
		int oldPrice = 0;
		for (int i = 0; i < price.size(); i++) {
			oldPrice += price.get(i) * list.get(i);
		}
		BigDecimal result = new BigDecimal(newPrice).divide(new BigDecimal(oldPrice),2, BigDecimal.ROUND_HALF_UP);
		System.out.println("newPrice:" + newPrice + "-- oldPrice:" + oldPrice + "-- rate：" + result);
		return result;
	}


	public int calc(List<Integer> price, List<Integer> needs, int result) {
		result += this.calcPrice(price, needs);
		return result;
	}

	// 单品计算
	private int calcPrice(List<Integer> price, List<Integer> needs) {
		int result = 0;
		for (int i = 0; i < needs.size(); i++) {
			result += needs.get(i) * price.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		// example 1
		List<Integer> price = Lists.newArrayList(2, 5);

		List<List<Integer>> special = Lists.newArrayList();
		special.add(Lists.newArrayList(3, 0, 5));
		special.add(Lists.newArrayList(1, 2, 10));

		List<Integer> needs = Lists.newArrayList(3, 2);


		Solution0638 solution0638 = new Solution0638();
		int totalPrice = solution0638.shoppingOffers(price, special, needs);
		System.out.println("总价格：" + totalPrice);
	}

	private static List<Integer> listSub(List<Integer> aList, List<Integer> bList) {
		List<Integer> result = new ArrayList<>();
		if (aList.size() > bList.size()) {
			return null;
		}
		for (int i = 0; i < aList.size(); i++) {
			result.add(aList.get(i) - bList.get(i));
		}
		return result;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

class ListUtils{
	private static List<Integer> listAdd(List<Integer> aList, List<Integer> bList) {
		List<Integer> result = new ArrayList<>();
		if (aList.size() != bList.size()) {
			return null;
		}
		for (int i = 0; i < aList.size(); i++) {
			result.add(aList.get(i) + bList.get(i));
		}
		return result;
	}

	private static List<Integer> listSub(List<Integer> aList, List<Integer> bList) {
		List<Integer> result = new ArrayList<>();
		if (aList.size() != bList.size()) {
			return null;
		}
		for (int i = 0; i < aList.size(); i++) {
			result.add(aList.get(i) - bList.get(i));
		}
		return result;
	}
}