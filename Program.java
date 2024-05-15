package VehicleStore;

import java.util.Arrays;

public class Program {
	public static int[] sortedBySales2(int[] arr) {
		int[] res = new int[arr.length];
		int cnt = 0,max = 0,ind = 0,i = 0;
		int[] temp = Arrays.copyOf(arr, arr.length);
		while(true) {
			if(cnt>=res.length) break;
			if(i==temp.length) {
				res[cnt++] = temp[ind];
				max = 0;
				i = 0;
				temp[ind] = -1;
				ind = 0;
			}
			if(temp[i]>max) {
				max = temp[i];
				ind = i;
			}
			i++;
		}
		return res;
	}
	public static int[] sortedBySales(int[] arr) {
		int[] res = new int[arr.length];
		int[] temp = Arrays.copyOf(arr, arr.length);
		int cnt = 0,max = 0,ind = 0;
		while(cnt<res.length) {
			max = 0;
			for(int i=0;i<temp.length;i++) {
				if(temp[i]>max) {
					max = arr[i];
					ind = i;
				}
			}
			res[cnt++] = temp[ind];
			temp[ind] = -1;
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1,6,5,10,88,12,14,2};
		System.out.println(Arrays.toString(sortedBySales(arr)));
		System.out.println();
		System.out.println(Arrays.toString(sortedBySales2(arr)));

	}

}
