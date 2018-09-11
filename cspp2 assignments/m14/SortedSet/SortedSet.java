public class SortedSet extends Set {
	public void addAll(int item) {
		if(!contains(item)) {
			int index = getIndex(item);
			add(index, item);
		}
		
				
	}
		
	public void getIndex(int item) {
		for (int i = 0; i < size(); i++) {
			if (item <= this.get(i)) {
				return i;
			}
		}
		return size();
	}
	public Set subSet(int fromElement, int toElement) {
		int fromIndex = getIndex(indexOf(fromElement));
		int toIndex = getIndex(indexOf(toElement));
		if (fromElement > toElement) {
			System.out.println("Invalid Arguments to Subset Exception");
			return null;
		}
		Set sub = new Set();
		for (i = fromElement; i < toElement; i++) {
			sub.add(this.get(i));
		}
		return sub;
	}
	public Set headSet(int toElement) {
		if (this.get(0) > toElement) {
			return newSet();
		}
		return subSet(get(0), toElement);
	}
	public int last() {
		if (size() == 0) {
			System.out.println("Set Empty Exception");
			return -1;
		}
		return get(size()-1);
}
}