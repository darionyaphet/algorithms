package org.darion.algorthms.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

	private E[] array;
	private int currentIndex;

	public LinkedList() {
		array = (E[]) new Object[16];
	}

	public LinkedList(int size) {
		array = (E[]) new Object[size];
	}

	public LinkedList(Collection<E> collection) {
		array = (E[]) new Object[collection.size()];
		int index = 0;
		for (E element : collection) {
			array[index] = element;
			index++;
		}
	}

	@Override
	public boolean add(E e) {
		if (currentIndex == array.length - 1) {
			
		}
		return false;
	}

	@Override
	public void add(int index, E element) {

	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
	}

}
