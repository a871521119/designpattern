package com.sz.ucar.迭代器模式;

/**
 * @author weiting
 * @time 2019-01-15 10:02
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc 容器的具体实现类
 */
public class FruitList implements Container {
    public String[] fruits = {"Cherry","Apple","Orange","Kiwifruit"};

    @Override
    public Iterator getIterator() {
        return new FruitIterator();
    }

    /**
     * 具体迭代器角色，实现迭代器接口中定义的方法，完成集合的迭代
     */
    private class FruitIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < fruits.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return fruits[index++];
            }
            return null;
        }
    }
}

