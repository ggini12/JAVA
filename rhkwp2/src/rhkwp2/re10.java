package rhkwp2;

import java.util.Scanner;

abstract class PairMap {
    protected String keyArray[]; 
    protected String valueArray[]; 
    abstract String get(String key); 
    abstract void put(String key, String value); 
    abstract String delete(String key); 
    abstract int length(); 
}

class Dictionary extends PairMap{
    private int size;
    private int cnt;
    public Dictionary(int size) { this.size = size; keyArray = new String[size]; valueArray = new String[size]; cnt = 0;}
    String get(String key){
        for(int i = 0; i < cnt; i++){
            if(keyArray[i].equals(key)){
                return valueArray[i];
            }
        }
        return "null";
    }
    void put(String key, String value){
        int index = cnt;
        for(int i = 0; i < cnt; i++){
            if(key.equals(keyArray[i])){
                index = i;
                break;
            }
        }
        keyArray[index] = key;
        valueArray[index] = value;
        cnt++;
    }
    String delete(String key){
        String temp = get(key);
        int index = cnt;
        for(int i = 0; i < cnt; i++){
            if(key.equals(keyArray[i])){
                index = i;
                break;
            }
        }
        keyArray[index] = "";
        valueArray[index] = "";
        cnt--;
        return temp;
    }
    int length(){
        return cnt;
    }
}

class re10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++"); 
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태"); 
        System.out.println("황기태의 값은 "+dic.get("황기태")); 
    }
}