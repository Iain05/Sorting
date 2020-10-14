class Main {
  	public static void main(String[] args) {
		int[] array = {3, 2, 5, 4};
		boolean sorted = true;

		while(true) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					sorted = false;			
				} 
			}
			if (sorted == true) {
				System.out.println("Holy heck it sorted itself");
				break;
			} else if (sorted == false) {
				System.out.println("ha you thought");
			}
		}
  }
}
