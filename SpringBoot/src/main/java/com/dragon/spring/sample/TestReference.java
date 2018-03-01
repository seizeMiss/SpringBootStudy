package com.dragon.spring.sample;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestReference {
	private Product product = new Product("iPhone");
	
	@Test
    public void weakRef_1() {

        ReferenceQueue<Product> rq = new ReferenceQueue<>();
        // WeakReference<Product> wr=new WeakReference<Product>(product);
        WeakReference<Product> wr = new WeakReference<Product>(product, rq);// 引用队列
        System.out.println("wr是否已被添加至引用队列：" + wr.isEnqueued());

        Map<WeakReference<Product>, Integer> map = new HashMap<>();
        map.put(wr, 111);

        product = null;// 关键
        System.gc();// 关键

        map.keySet().forEach(e -> System.out.println(e.get()));// 不gc()的话，还能访问对象，否则null。
        System.out.println("wr是否已被添加至引用队列：" + wr.isEnqueued());
    }
}
