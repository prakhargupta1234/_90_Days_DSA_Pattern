package Day29;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Map<Integer, Integer> map= new TreeMap<>();
        for(int i=0;i<start.length;i++){
            map.put(start[i], map.getOrDefault(start[i], 0)+1);
            map.put(end[i], map.getOrDefault(end[i], 0)-1);
        }
        int c=0;
        int max=0;
        for(int key: map.keySet()){
            c= c+map.get(key);
            max= Math.max(max, c);
        }
        return max;
    }

}
