package Generics;

public class Thing<T> {
	private T obj;

	public Thing(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
