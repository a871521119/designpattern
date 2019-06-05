package com.sz.ucar.迭代器模式;
/**
 * @author weiting
 * @time 2019-01-15 10:18
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc
 */
public class VegetableList implements Container {
    public String[] vegetables = {"Spinach", "tomato", "potato"};

    @Override
    public Iterator getIterator() {
        return new VegetableIterator();
    }

    private class VegetableIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < vegetables.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return vegetables[index++];
            }
            return null;
        }
    }
}
