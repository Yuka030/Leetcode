public class GasStation_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] gasArray = new int[gas.length * 2];
        int[] costArray = new int[cost.length * 2];

        for(int i = 0; i < gasArray.length; i++){
            if(i >= gas.length){
                gasArray[i] = gas[i - gas.length];
            }else {
                gasArray[i] = gas[i];
            }

        }

        for(int i = 0; i < costArray.length; i++){
            if(i >= cost.length){
                costArray[i] = cost[i - cost.length];
            }else {
                costArray[i] = cost[i];
            }
        }

        for(int i = 0; i < gasArray.length; i++){
            int currentGas;
            int prevGas = 0;
            if(i > gas.length) return - 1;
            for(int j = i; j < gas.length + i; j++){
                currentGas = gasArray[j];
                if(currentGas + prevGas >= costArray[j]){
                    prevGas = currentGas + prevGas - costArray[j];
                    if(j - i == gas.length - 1) return i;
                }else{
                    break;
                }
            }
        }
        return -1;
    }
}
