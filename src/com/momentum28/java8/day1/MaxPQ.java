package com.momentum28.java8.day1;

public class MaxPQ <Key extends Comparable<Key>> {
    // 存储元素的数据
    private Key[] pq;
    // 当前priority queue中的元素
    private int size = 0;

    public MaxPQ(int cap) {
        // 索引0不用，所以多分配一个空间
        pq = (Key[]) new Comparable[cap + 1];
    }






}
