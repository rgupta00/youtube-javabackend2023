package com.a.collections.map.recap;

import java.util.Objects;
//100% enusre that it should be Im utable
class Key implements Comparable<Key>{
	private int k;

	public Key(int k) {
		this.k = k;
	}

	public int getK() {
		return k;
	}

	@Override
	public int hashCode() {
		return Objects.hash(k);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return k == other.k;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize is called...");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Key [k=").append(k).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Key o) {
		return Integer.compare(this.getK(), o.getK());
	}

}
