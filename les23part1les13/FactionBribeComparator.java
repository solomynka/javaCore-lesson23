package les23part1les13;

import java.util.Comparator;

public class FactionBribeComparator implements Comparator<Delegate>{

	@Override
	public int compare(Delegate o1, Delegate o2) {
	
		return o1.getSumOfBribe() > o2.getSumOfBribe()? 1: -1;
	}

	

}
