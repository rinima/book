package com.daomain;

public interface Specification<T> {
	 boolean isSatisfiedBy(T t);
}
