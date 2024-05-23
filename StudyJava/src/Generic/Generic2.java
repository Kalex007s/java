package Generic;

class KeyValue<K,V>{
    private K key;
    private V velue;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVelue() {
        return velue;
    }

    public void setVelue(V velue) {
        this.velue = velue;
    }
}

public class Generic2 {
    public static void main(String[]args){
        KeyValue<String,Integer> kv1 = new KeyValue<String,Integer>();
        kv1.setKey("사과");
        kv1.setVelue(100);
        System.out.println(kv1.getKey() + " : "+kv1.getVelue());

        // 두번째 제네릭을 사용하지 않더라도 Void타입을 지정해줘야함
        KeyValue<String,Void>kv2 = new KeyValue<>();
        kv2.setKey("키 값만 사용");
        System.out.println("key : "+ kv2.getKey());
    }
}
