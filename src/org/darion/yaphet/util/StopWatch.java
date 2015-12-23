package org.darion.yaphet.util;

public class StopWatch {
	private final long start;

	public StopWatch() {
		start = now();
	}

	private long now() {
		return System.currentTimeMillis();
	}

	public long interval() {
		return now() - start;
	}
}
