public class g1_gas_station{
     public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;

        for(int i : gas){
            totalgas += i;
        }

        for(int i : cost){
            totalcost += i;
        }

        if(totalgas < totalcost){
            return -1;
        }

        int currgas = 0 , sum = 0;

        for(int i=0 ; i<gas.length ; i++){
            currgas += gas[i] - cost[i];

            if(currgas < 0){
                sum = i+1;
                currgas = 0;
            }
            
        }

        return sum;

    }
    public static void main(String[] args) {
        
    }
}