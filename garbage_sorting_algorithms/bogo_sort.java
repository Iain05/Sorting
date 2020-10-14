import java.util.*;

class Main {
    public static void main(String[] args) {
		int attempts = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
    		list.add(i);
		}
			

		while(true) {
			boolean sorted = true;
			Collections.shuffle(list);
			attempts++;

			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					sorted = false;			
				} 
			}
			if (sorted == true) {
				System.out.println("Holy heck it sorted itself and it only took " + attempts + " tries");
				break;
			} else if (sorted == false) {
				// System.out.println("ha you thought");
				System.out.println("Attempt " + attempts);
			}
		}	
    }
}
