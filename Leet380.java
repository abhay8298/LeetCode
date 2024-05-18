//TC=O(1) 

class RandomizedSet {
    List<Integer> list;
    HashMap<Integer,Integer> map;
    Random random = new Random();
    public RandomizedSet() {
        list= new ArrayList<>();
        map = new HashMap<>();    
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int pos=map.get(val);
        if(pos != (list.size()-1)){
            int last=list.get(list.size()-1);
            list.set(pos,last);
            map.put(last,pos);
        }
        map.remove(val);
        list.remove(list.size()-1);
        return true;  
    }
    
    public int getRandom() {
        int r = random.nextInt(list.size());
        return list.get(r);
    }
}
