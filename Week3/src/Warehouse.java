import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class WritItems {

    private List<String> list;


    WritItems(List<String> list) {
        this.list = list;
    }

    // add items
    public void addItem(String item) {

        this.list.add(item);
    }
}


class ReadItems {

    private List<String> list;


    ReadItems(List<String> list) {
        this.list = list;
    }

    // Read the items
    public void readItem() {

        for (String item : list) {
            System.out.println(item.toString());
        }

    }

}


class TestClass {

    public static void main(String[] args) {


        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        WritItems writItems = new WritItems(list);
        ReadItems readItems = new ReadItems(list);

        writItems.addItem("Tv");
        writItems.addItem("xbox");
        writItems.addItem("laptop");
        readItems.readItem();
    }
}