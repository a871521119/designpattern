import com.sz.ucar.迭代器模式.FruitList;
import com.sz.ucar.迭代器模式.Iterator;
import com.sz.ucar.迭代器模式.VegetableList;
/**
 * @author weiting
 * @time 2019-01-15 10:23
 * @email ting.wei01@ucarinc.com
 * @tel
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        FruitList fruitList = new FruitList();
        for (Iterator iterator = fruitList.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------");

        VegetableList vegetableList = new VegetableList();
        for (Iterator iterator = vegetableList.getIterator();iterator.hasNext();) {
            System.out.println(iterator.next());
        }

    }
}
