package Easy;

public class _01twoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int total = 0;

		for (int i = 0; i < nums.length; i++) { // ilk elemandan taramaya ba�l�yor

			for (int j = 1; j < nums.length; j++) { // ikinci elemandan taramaya ba�l�yor
				total = nums[i] + nums[j]; // ilk elemanla arta arta di�er elemanlar� topluyor her seferinde
				if (total == target) { // iki eleman�n toplam� verilen hedefe e�it mi diye kontrol ediyoruz
					System.out.println("nums[" + i + "," + j + "]"); // verilen hedefin indekslerini bulunca ekrana yazd�r�yoruz
					return;
				}

			}
		}
	}

}